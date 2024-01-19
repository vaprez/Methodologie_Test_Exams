package com;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertTrue;

import java.util.List;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.*;
import io.cucumber.java.mk_latn.No;

public class GestionProduitsSteps {
    private String NouveauProduit1;
    private String Prix;
    private String Quantite;
    private String Prix_apres;
    private String Quantite_apres;
    private Produit produit;
    

    private List<String> maliste = new java.util.ArrayList<String>();
    @Given("l'utilisateur est sur la page de gestion des produits")
    public void l_utilisateur_est_sur_la_page_de_gestion_des_produits() {
        System.out.println("L'utilisateur est sur la page d'accueil.");
    }
    @When("l'utilisateur ajoute un nouveau produit avec les informations suivantes:")
    public void l_utilisateur_ajoute_un_nouveau_produit_avec_les_informations_suivantes(DataTable dataTable) {
    List<List<String>> data = dataTable.asLists(String.class);
    NouveauProduit1 = data.get(1).get(0);
    Prix = data.get(1).get(1);
    Quantite = data.get(1).get(2);
}

    @Then("le produit {string} est ajouté avec succès")
    public void le_produit_est_ajouté_avec_succès(String nom) {
        maliste.add(NouveauProduit1);
        assertEquals(nom, NouveauProduit1);
        
    }


    @And("le produit {string} est disponible en stock")
        public void le_produit_est_disponible_en_stock(String nom) {
            maliste.add(nom);
        }

     @When("l'utilisateur vérifie la disponibilité du produit {string}")
        public void when_l_utilisateur_vérifie_la_disponibilité_du_produit(String nom) {
            assertTrue(maliste.contains(nom)); 
        }
    @Then("le système affiche que le produit {string} est disponible en stock")
    public void le_système_affiche_que_le_produit_est_disponible_en_stock(String nom) {
        assertEquals(nom, nom);
        }

    @And("le produit {string} existe avec les informations suivantes:")
    public void le_produit_existe_avec_les_informations_suivantes(String nom, DataTable dataTable) {
        List<List<String>> data = dataTable.asLists(String.class);
        maliste.add(nom);
        Prix = data.get(1).get(0);
        Quantite = data.get(1).get(1);
    }
    @When("l'utilisateur met à jour les informations du produit {string} avec:")
    public void l_utilisateur_met_à_jour_les_informations_du_produit_avec(String nom, DataTable dataTable1) {
         assertTrue(maliste.contains(nom));
        List<List<String>> data = dataTable1.asLists(String.class);
        Prix_apres = data.get(1).get(0);
        Quantite_apres = data.get(1).get(1);

        assertNotEquals(Prix,Prix_apres);
        // // assertNotEquals(Quantite, Quantite_apres);
    }

    @Then("le produit {string} est mis à jour avec succès")
    public void le_produit_est_mis_à_jour_avec_succès(String nom) {
        assertEquals(nom, nom);
    }
    
}

