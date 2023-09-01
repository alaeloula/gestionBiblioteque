package com.gestionBiblio.dao;

import com.gestionBiblio.calss.Emprunteur;

import java.util.List;

public interface EmprunteurDao {
    void ajouter(Emprunteur Emprunteur );
    List<Emprunteur> lister();
}
