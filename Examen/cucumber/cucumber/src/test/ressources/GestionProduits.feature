
Feature: GestionProduits Feature

  Scenario: Ajout d'un nouveau produit
    Given l'utilisateur est sur la page de gestion des produits
    When l'utilisateur ajoute un nouveau produit avec les informations suivantes:
    | Nom du produit | Prix unitaire | Quantité en stock |
    | NouveauProduit1 | 25.99         | 50                |
    Then le produit "NouveauProduit1" est ajouté avec succès


  Scenario: Vérification de la disponibilité d'un produit
    Given l'utilisateur est sur la page de gestion des produits
    And le produit "ProduitExistant" est disponible en stock
    When l'utilisateur vérifie la disponibilité du produit "ProduitExistant"
    Then le système affiche que le produit "ProduitExistant" est disponible en stock

  Scenario: Mise à jour des informations d'un produit
    Given l'utilisateur est sur la page de gestion des produits
    And le produit "ProduitAUpdater" existe avec les informations suivantes:
      | Prix unitaire actuel | Quantité en stock actuelle |
      | 19.99                | 30                        |
    When l'utilisateur met à jour les informations du produit "ProduitAUpdater" avec:
      | Nouveau prix unitaire | Nouvelle quantité en stock |
      | 24.99                 | 40                        |
    Then le produit "ProduitAUpdater" est mis à jour avec succès
