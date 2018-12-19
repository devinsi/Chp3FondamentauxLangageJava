package com.company;

import java.time.Duration;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;

public class Main {



    public static void main(String[] args) {
        //création de l'instance liste d'article
        //ArrayList listeArticle = new ArrayList<Article>();

        //Dvd d1 = new Dvd(007, "dvd", 10.50, Duration.ofMinutes(98),
        //        ( new Personne("De Rigo", "Marc", LocalDate.of(1844,03,30))));

        Dvd d1 = new Dvd();
        d1.setReference(007);
        d1.setDesignation("Une nuit en enfert");
        d1.setPrix(10.5);
        d1.setDuree(Duration.ofMinutes(98));
        d1.setNomrealisateur(new Personne("De Rigo", "Marc", LocalDate.of(1844,03,30)));

        Livre l1 = new Livre();
        l1.setReference(006);
        l1.setDesignation( "les poètes maudits");
        l1.setPrix(9.9);
        l1.setNumISBN("LVer10");
        l1.setNbPage(400);
        l1.setNomAuteur(new Personne("paul", "Verlaine", LocalDate.of(1844, 03, 30)));


        //Création de 5 articles pour remplir la liste
        Article a1, a2, a3, a4, a5;
        a1 = new Article(001, "raquette", 18.5);
        //a2 = new Article(002, "luminaire", 109);
        //a3 = new Article(003, "pneu", 45.99);
        //a4 = new Article(004, "catane", 39.90);
        //a5 = new Article(005, "ballon", 8.90);

        //ajout des 5 articles dans la liste
        //listeArticle.add(a1);
        //listeArticle.add(d1);
        ////listeArticle.add(l1);
        //listeArticle.add(a4);
        //listeArticle.add(a5);

        //ajout d'un livre dans ???



        /*//parcours de la liste
        Iterator<Article> it;
        it = listeArticle.iterator();
        Article a;
        while (it.hasNext()){
        //tant qu'il reste des éléments
        a = it.next();
        //récupération de l'élément courant
            System.out.println(a.getReference() + "/"  + a.getDesignation() + "/"+ a.getPrix());
        //affichage des éléments détaillés
        }
        */

        test(a1);
        System.out.println(a1.ToString());
        System.out.println("******************finTestArticle*******************");

        testLivre(l1);
        System.out.println(l1.ToString());
        System.out.println("******************finTestLivre*******************");

        testDvd(d1);
        System.out.println(d1.ToString());
        System.out.println("******************finTestDvd*******************");
    }

    public static void test(Article a){
        System.out.println("*********************Article*********************");
        System.out.println("reference: " + a.getReference());
        System.out.println("désignation: " + a.getDesignation());
        System.out.println("prix: " + a.getPrix());
        System.out.println("*********************fin****************************");
    }
    public static void testLivre(Livre l1){
        System.out.println("reference: " + l1.getReference());
        System.out.println("désignation: " + l1.getDesignation());
        System.out.println("prix: " + l1.getPrix());
        System.out.println("numéro ISBN: " + l1.getNumISBN());
        System.out.println("nombre de page: " + l1.getNbPage());
        System.out.println("nom de l'auteur: " + l1.getNomAuteur().ToString()    );
        System.out.println("*********************fin****************************");
    }
    public static void testDvd(Dvd d1){
        System.out.println("reference: " + d1.getReference());
        System.out.println("désignation: " + d1.getDesignation());
        System.out.println("prix: " + d1.getPrix());
        System.out.println("durée du dvd (en min): " + d1.getDuree().toMinutes());
        System.out.println("réalisateur: " + d1.getNomrealisateur().ToString());
        System.out.println("*********************fin****************************");
    }

}
