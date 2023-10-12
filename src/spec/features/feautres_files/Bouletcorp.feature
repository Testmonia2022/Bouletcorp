Feature: Je souhaite tester le bouton a propos
  En tant que utilisateur je souhaite tester le bouton a propos

  @aPropos
  Scenario: Je souhaite tester le bouton a propos
    Given Je me connect sur l application Bouletcorp
    When Je clique sur le bouton a propos
    Then Je verifie que la page a change "https://bouletcorp.com/about"
    And Les widgets twitch masto insta sont bien affiches
