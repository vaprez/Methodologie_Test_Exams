
package com;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ProcessusCommandeSteps {
     private List<String> panier = new ArrayList<>();
     private double montantTotal;
     private boolean nouvelleCommandeCreee = false;
     private String nom;
     private double prix;

     private Map<String, Double> prixProduits = new HashMap<>();
     private Map<String, Integer> quantiteProduits = new HashMap<>();

     @Given("l'utilisateur est sur la page d'accueil")
     public void l_utilisateur_est_sur_la_page_d_accueil() {
         System.out.println("L'utilisateur est sur la page d'accueil.");
     }

    @When("l'utilisateur crée une nouvelle commande")
    public void l_utilisateur_crée_une_nouvelle_commande() {
        nouvelleCommandeCreee = true;
    }

    @Then("une nouvelle commande est créée avec succès")
    public void une_nouvelle_commande_est_créée_avec_succès() {
        assertTrue(nouvelleCommandeCreee);
    }

    @And("il existe un produit {string} avec un prix de {double}")
    public void il_existe_un_produit_avec_un_prix(String nomProduit, double prixProduit) {
        nom = nomProduit;
        prix = prixProduit;
    }

    @When("l'utilisateur ajoute {int} unités du produit {string} au panier")
    public void l_utilisateur_ajoute_unités_du_produit_au_panier(int quantite, String nomProduit) {
        // Implémentez les étapes nécessaires pour ajouter le produit au panier
        panier.add(nomProduit);
    }

    @Then("le panier contient {int} unités du produit {string}")
    public void le_panier_contient_unités_du_produit(int quantite, String nomProduit) {
        // Implémentez les étapes nécessaires pour vérifier la quantité du produit dans le panier
        montantTotal = quantite * prix;
    }

    @Given("l'utilisateur a un panier avec les produits suivants:")
    public void l_utilisateur_a_un_panier_avec_les_produits_suivants(DataTable dataTable) {
        List<Map<String, String>> produits = dataTable.asMaps(String.class, String.class);

        for (Map<String, String> produit : produits) {
            String nomProduit = produit.get("Produit");
            double prixUnitaire = Double.parseDouble(produit.get("Prix unitaire"));
            int quantite = Integer.parseInt(produit.get("Quantité"));

            prixProduits.put(nomProduit, prixUnitaire);
            quantiteProduits.put(nomProduit, quantite);
        }
    }

    @When("l'utilisateur vérifie le montant total de la commande")
    public void l_utilisateur_vérifie_le_montant_total_de_la_commande() {
        montantTotal = calculerMontantTotal();
    }

    @Then("le montant total de la commande est de {double}")
    public void le_montant_total_de_la_commande_est_de(double montantAttendu) {
        assertEquals(montantAttendu, montantTotal, 0.01);
    }

    private double calculerMontantTotal() {
        double montantTotalCalculé = 0.0;

        for (String nomProduit : prixProduits.keySet()) {
            double prixUnitaire = prixProduits.get(nomProduit);
            int quantite = quantiteProduits.get(nomProduit);

            montantTotalCalculé += prixUnitaire * quantite;
        }

        return montantTotalCalculé;
    }
}
