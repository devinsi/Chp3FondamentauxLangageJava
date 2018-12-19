package com.company;

import java.util.ArrayList;

public class Livre extends Article {

    //déclaration des attributs
    private String numISBN;
    private int nbPage;
    private Personne nomAuteur;

    public Livre(){
        super();

    }

    public int getNbPage() {
        return nbPage;
    }

    public Personne getNomAuteur() {
        return nomAuteur;
    }

    public String getNumISBN() { return numISBN; }

    public void setNbPage(int nbPage) {
        this.nbPage = nbPage;
    }

    public void setNumISBN(String numISBN) {
        this.numISBN = numISBN;
    }

    public void setNomAuteur(Personne nomAuteur) {
        this.nomAuteur = nomAuteur;
        ArrayList<Article> lst;
        lst = nomAuteur.getOeuvres();
        if (!lst.contains(this)){
            lst.add(this);
        }

    }

    //déclaration des différentes versions de constructeurs
    public Livre(int ref, String des, double px, String numISBN, int nbPage, Personne nomAuteur){
        super(ref, des, px);
        setNumISBN(numISBN);
        setNbPage(nbPage);
        setNomAuteur(nomAuteur);
    }

    public String ToString(){
        return super.ToString() + " " +  getNumISBN() + " " + getNbPage() + " " + getNomAuteur();
    }

}
