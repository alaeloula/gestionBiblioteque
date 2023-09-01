package com.gestionBiblio.calss;

import com.gestionBiblio.dao.EmprunteurDao;

import java.util.List;

public class Emprunteur {
    private int id;
    private String nom;
    private String prenom;
    private EmprunteurDao EmprunteurDao;

    // Constructors
    public Emprunteur() {
    }

    public Emprunteur(int id, String nom, String prenom) {
        this.id = id;
        this.nom = nom;
        this.prenom = prenom;
    }

    // Getters and Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }


}
