package com;

public class Produit {

    private String nom;
    private String prix;
    private String quantite;

    public Produit(String nom, String prix, String quantite) {
        this.nom = nom;
        this.prix = prix;
        this.quantite = quantite;
    }

    public String getNom() {
        return nom;
    }

    public String getPrix() {
        return prix;
    }

    public String getQuantite() {
        return quantite;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setPrix(String prix) {
        this.prix = prix;
    }

    public void setQuantite(String quantite) {
        this.quantite = quantite;
    }

    public void afficher() {
        System.out.println("Nom: " + nom + " Prix: " + prix + " Quantite: " + quantite);
    }

    public void afficherNom() {
        System.out.println("Nom: " + nom);
    }

    public void afficherPrix() {
        System.out.println("Prix: " + prix);
    }

    public void afficherQuantite() {
        System.out.println("Quantite: " + quantite);
    }

    public void afficherNomPrix() {
        System.out.println("Nom: " + nom + " Prix: " + prix);
    }

    public void afficherNomQuantite() {
        System.out.println("Nom: " + nom + " Quantite: " + quantite);
    }

    public void afficherPrixQuantite() {
        System.out.println("Prix: " + prix + " Quantite: " + quantite);
    }

    public void afficherNomPrixQuantite() {
        System.out.println("Nom: " + nom + " Prix: " + prix + " Quantite: " + quantite);
    }

    public void afficherPrixQuantiteNom() {
        System.out.println("Prix: " + prix + " Quantite: " + quantite + " Nom: " + nom);
    }

    public void afficherQuantiteNom() {
        System.out.println("Quantite: " + quantite + " Nom: " + nom);
    }

    public void afficherQuantitePrix() {
        System.out.println("Quantite: " + quantite + " Prix: " + prix);
    }
}
