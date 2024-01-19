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



public class GestionUtilisateursSteps {
    private String nom;
    private String prenom;
    private String email;
    private String motDePasse;
    private boolean compteUtilisateurCree = false;

    @Given("l'utilisateur est sur la page d'inscription")
    public void l_utilisateur_est_sur_la_page_d_inscription() {
        // Implémentez les étapes nécessaires
        System.out.println("L'utilisateur est sur la page d'inscription.");
    }

    @When("l'utilisateur remplit le formulaire d'inscription avec les informations suivantes:")
    public void l_utilisateur_remplit_le_formulaire_d_inscription_avec_les_informations_suivantes(DataTable dataTable) {
        Map<String, String> userData = dataTable.asMap(String.class, String.class);
        nom = userData.get("Nom");
        prenom = userData.get("Prénom");
        email = userData.get("Email");
        motDePasse = userData.get("Mot de passe");

        // À adapter en fonction de votre application
        System.out.println("L'utilisateur remplit le formulaire d'inscription avec les informations suivantes :");
        System.out.println("Nom : " + nom + ", Prénom : " + prenom + ", Email : " + email + ", Mot de passe : " + motDePasse);

        // Ici, vous devriez appeler les méthodes réelles de votre application pour effectuer l'inscription
        // Par exemple :
        // UtilisateurService.inscrireUtilisateur(nom, prenom, email, motDePasse);
        compteUtilisateurCree = true;
    }

    @Then("le compte utilisateur est créé avec succès")
    public void le_compte_utilisateur_est_créé_avec_succès() {
        // À adapter en fonction de votre application
        System.out.println("Le compte utilisateur est créé avec succès.");
        // Assurez-vous de vérifier la création du compte dans votre application
        // Par exemple :
        // assertTrue("Le compte utilisateur doit être créé.", compteUtilisateurCree);
    }

    @Given("l'utilisateur est sur la page de connexion")
    public void l_utilisateur_est_sur_la_page_de_connexion() {
        // Implémentez les étapes nécessaires
        System.out.println("L'utilisateur est sur la page de connexion.");
    }

    @When("l'utilisateur saisit ses informations de connexion:")
    public void l_utilisateur_saisit_ses_informations_de_connexion(DataTable dataTable) {
        Map<String, String> loginData = dataTable.asMap(String.class, String.class);
        email = loginData.get("Email");
        motDePasse = loginData.get("Mot de passe");

        // À adapter en fonction de votre application
        System.out.println("L'utilisateur saisit ses informations de connexion :");
        System.out.println("Email : " + email + ", Mot de passe : " + motDePasse);

        // Ici, vous devriez appeler les méthodes réelles de votre application pour effectuer la connexion
        // Par exemple :
        // UtilisateurService.connecterUtilisateur(email, motDePasse);
    }

    @Then("l'utilisateur est connecté avec succès")
    public void l_utilisateur_est_connecté_avec_succès() {
        // À adapter en fonction de votre application
        System.out.println("L'utilisateur est connecté avec succès.");
        // Assurez-vous de vérifier la connexion dans votre application
        // Par exemple :
        // assertTrue("L'utilisateur doit être connecté.", utilisateurConnecte);
    }

    @Given("l'utilisateur est connecté sur son compte")
    public void l_utilisateur_est_connecté_sur_son_compte() {
        // À adapter en fonction de votre application
        System.out.println("L'utilisateur est connecté sur son compte.");
    }

    @When("l'utilisateur modifie ses informations avec:")
    public void l_utilisateur_modifie_ses_informations_avec(DataTable dataTable) {
        Map<String, String> nouvellesInfos = dataTable.asMap(String.class, String.class);
        nom = nouvellesInfos.get("Nouveau Nom");
        prenom = nouvellesInfos.get("Nouveau Prénom");

        // À adapter en fonction de votre application
        System.out.println("L'utilisateur modifie ses informations avec :");
        System.out.println("Nouveau Nom : " + nom + ", Nouveau Prénom : " + prenom);

        // Ici, vous devriez appeler les méthodes réelles de votre application pour effectuer la modification des infos
        // Par exemple :
        // UtilisateurService.modifierInformationsUtilisateur(email, nom, prenom);
    }

    @Then("les informations utilisateur sont mises à jour avec succès")
    public void les_informations_utilisateur_sont_mises_à_jour_avec_succès() {
        // À adapter en fonction
    }
}






