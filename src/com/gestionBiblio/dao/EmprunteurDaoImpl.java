package com.gestionBiblio.dao;

import com.gestionBiblio.calss.Emprunteur;


import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class EmprunteurDaoImpl implements EmprunteurDao{
    private DaoFactory daoFactory;

    EmprunteurDaoImpl(DaoFactory daoFactory) {
        this.daoFactory = daoFactory;
    }



    @Override
    public void ajouter(Emprunteur Emprunteur) {
        Connection connexion = null;
        PreparedStatement preparedStatement = null;

        try {
            connexion = daoFactory.getConnection();
            preparedStatement = connexion.prepareStatement("INSERT INTO Emprunteur(name, prenom) VALUES(?, ?);");
            preparedStatement.setString(1, Emprunteur.getNom());
            preparedStatement.setString(2, Emprunteur.getPrenom());

            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }


    @Override
    public List<Emprunteur> lister() {
        List<Emprunteur> Emprunteurs = new ArrayList<Emprunteur>();
        Connection connexion = null;
        Statement statement = null;
        ResultSet resultat = null;

        try {
            connexion = daoFactory.getConnection();
            statement = connexion.createStatement();
            resultat = statement.executeQuery("SELECT name, prenom FROM Emprunteur;");

            while (resultat.next()) {
                String nom = resultat.getString("nom");
                String prenom = resultat.getString("prenom");

                Emprunteur Emprunteur = new Emprunteur();
                Emprunteur.setNom(nom);
                Emprunteur.setPrenom(prenom);

                Emprunteurs.add(Emprunteur);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return Emprunteurs;
    }
}
