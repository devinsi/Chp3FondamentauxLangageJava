package com.company;

public class Article {

    private int reference;
    private String designation;
    private double prix;


    //déclaration des différentes version de constructeurs
    public Article(){
        super();
    }

    public Article(int ref){
        this();
        setReference(ref);
    }

    public Article(int ref, String des){
        this(ref);
        setDesignation(des);
    }

    public Article(int ref, String des, double px) {
        this.reference = ref;
        this.designation = des;
        this.prix = px;
    }


    public int getReference() {
        return reference;
    }
    public String getDesignation() {
        return designation;
    }
    public double getPrix() {
        return prix;
    }
    public void setReference(int reference) {
        this.reference = reference;
    }
    public void setDesignation(String designation) {
        this.designation = designation;
    }
    public void setPrix(double prix) {
        this.prix = prix;
    }



    public String ToString() {
        return getReference() + " " + getDesignation() + " " + getPrix();
    }




}
