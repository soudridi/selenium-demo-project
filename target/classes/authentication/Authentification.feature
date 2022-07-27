@authentification
Feature: je me connect a l'application OrangeHRM
  En tant que utilisateur je souhaite m'authentifier a l'application OrangeHRM

  Background: 
    Given je me connecte a l'application OrangeHRM
    When je saisie le username "Admin"
    And Je saisie le mot de passe "admin123"
    And Je clique sur le bouton login

  @connexion_ok
  Scenario: Authentification a l'application OrangeHRM
    Then Je me redirige vers la page home "Welcome"

  @deconnexion
  Scenario: Verifier la deconnexion
    When Je clique sur l'icone logout
    And Je clique sur le bouton logout
