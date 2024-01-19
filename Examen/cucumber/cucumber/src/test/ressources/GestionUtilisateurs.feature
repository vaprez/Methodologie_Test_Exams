Feature: Gestion des utilisateurs

  Scenario: Création d'un compte utilisateur
    Given l'utilisateur est sur la page d'inscription
    When l'utilisateur remplit le formulaire d'inscription avec les informations suivantes:
      | Nom         | Prénom      | Email                | Mot de passe |
      | Dupont      | Jean        | jean.dupont@email.com | MotDePasse123 |
    Then le compte utilisateur est créé avec succès

  Scenario: Connexion utilisateur
    Given l'utilisateur est sur la page de connexion
    When l'utilisateur saisit ses informations de connexion:
      | Email                | Mot de passe   |
      | jean.dupont@email.com | MotDePasse123  |
    Then l'utilisateur est connecté avec succès

  Scenario: Modification des informations utilisateur
    Given l'utilisateur est connecté sur son compte
    When l'utilisateur modifie ses informations avec:
      | Nouveau Nom    | Nouveau Prénom    |
      | Smith          | John              |
    Then les informations utilisateur sont mises à jour avec succès
