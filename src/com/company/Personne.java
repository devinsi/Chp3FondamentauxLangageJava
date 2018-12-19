package com.company;

import java.time.LocalDate;
import java.util.ArrayList;


public class Personne {
    private String nom;
    private String prenom;
    private LocalDate dateOfBurth;
    private ArrayList<Article>oeuvres;

    public Personne(){
        super();
        oeuvres = new ArrayList<>();
    }

    public String getNom() {
        return nom;
    }
    public String getPrenom() {
        return prenom;
    }
    public LocalDate getDateOfBurth() {
        return dateOfBurth;
    }
    public ArrayList<Article> getOeuvres() { return oeuvres; }
    public void setNom(String nom) {
        this.nom = nom;
    }
    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }
    public void setDateOfBurth(LocalDate dateOfBurth) {
        this.dateOfBurth = dateOfBurth;
    }



    public Personne(String nom, String prenom, LocalDate dateOfBurth ) {
        this.nom = nom;
        this.prenom = prenom;
        this.dateOfBurth = dateOfBurth;

    }

    public String ToString(){
        return nom + " " + prenom + " " + ", Né le: " + dateOfBurth ; //+ "dont les oeuvres son t: " + listeOeuvres;
    }

}
