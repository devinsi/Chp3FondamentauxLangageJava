package com.company;

import java.time.Duration;
import java.util.ArrayList;

public class Dvd extends Article{

    //déclaration des attributs
    private Duration duree;
    private Personne nomrealisateur;

    public Dvd(){
        super();
    }

    //getters
    public Duration getDuree() {
        return duree;
    }
    public Personne getNomrealisateur() {
        return nomrealisateur;
    }
    //setters
    public void setDuree(Duration duree) {
        this.duree = duree;
    }

    public void setNomrealisateur(Personne nomrealisateur) {
        this.nomrealisateur = nomrealisateur;
        ArrayList<Article> lst;
        lst = nomrealisateur.getOeuvres();
        if (!lst.contains(this)){
            lst.add(this);
        }
    }

    //constructeurs
    public Dvd(int ref, String des, double px, Duration duree, Personne nomrealisateur) {
        super(ref, des, px);
        setDuree(duree);
        setNomrealisateur(nomrealisateur);
    }

    //methodes


    public String ToString(){
        return super.ToString() + " " +  getDuree().toMinutes() + " " + getNomrealisateur();
    }
}
