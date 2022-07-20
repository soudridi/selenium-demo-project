@authentification
Feature: je me connect a l'application OrangeHRM
  En tant que utilisateur je souhaite me authentifier a l'application OrangeHRM

  @connexion_ok
  Scenario: Authentification a l'application OrangeHRM
    Given je me connecte a l'application OrangeHRM
    When je saisie le username "Admin"
    And Je saisie le mot de passe "admin123"
    And Je clique sur le bouton login
    Then Je me redirige vers la page home "welcome"
