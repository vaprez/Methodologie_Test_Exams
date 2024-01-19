Feature: Gestion des commandes

  Scenario: Création d'une nouvelle commande
    Given l'utilisateur est sur la page d'accueil
    When l'utilisateur crée une nouvelle commande
    Then une nouvelle commande est créée avec succès

  Scenario: Ajout de produits au panier
    Given l'utilisateur est sur la page d'accueil
    And il existe un produit "ProduitA" avec un prix de 19.99
    When l'utilisateur ajoute 3 unités du produit "ProduitA" au panier
    Then le panier contient 3 unités du produit "ProduitA"
    And le montant total de la commande est de 59.97

  Scenario: Vérification du montant total de la commande
    Given l'utilisateur a un panier avec les produits suivants:
      | Produit           | Prix unitaire | Quantité |
      | ProduitB          | 15.00         | 2        |
      | ProduitC          | 10.50         | 1        |
    When l'utilisateur vérifie le montant total de la commande
    Then le montant total de la commande est de 40.50
