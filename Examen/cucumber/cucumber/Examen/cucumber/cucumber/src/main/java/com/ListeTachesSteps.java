package com;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNotNull;
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
public class ListeTachesSteps {

    private TacheService tacheService;
    private List<Tache> listeDesTaches;

    @Given("l'utilisateur est sur la page des tâches")
    public void l_utilisateur_est_sur_la_page_des_tâches() {
        // Dans cette étape, vous pourriez initialiser votre service de tâches ou effectuer d'autres actions nécessaires
        tacheService = new TacheService();
        System.out.println("L'utilisateur est sur la page des tâches.");
    }

    @When("l'utilisateur demande la liste des tâches")
    public void l_utilisateur_demande_la_liste_des_tâches() {
        // Dans cette étape, vous appelez la méthode de votre service pour obtenir la liste des tâches
        listeDesTaches = tacheService.obtenirListeDesTaches();
        System.out.println("L'utilisateur demande la liste des tâches.");
    }

    @Then("la liste des tâches est affichée avec succès")
    public void la_liste_des_tâches_est_affichée_avec_succès() {
        // Dans cette étape, vous vérifiez que la liste des tâches est correctement affichée
        assertNotNull("La liste des tâches ne doit pas être nulle.", listeDesTaches);
        assertTrue("La liste des tâches doit contenir au moins une tâche.", !listeDesTaches.isEmpty());
        System.out.println("La liste des tâches est affichée avec succès.");
    }
}
