@Web
Feature: Search Pokemon

  Scenario: Search article about Apple on Wikipedia
    Given User open Bulbapedia home page
    When User input search "Bulbasaur" on home page and Click Enter
    Then User see article with contains "Bulbasaur" details and show that its "#001" pokemon

  Scenario: Search article about Apple on Wikipedia
    Given User open Bulbapedia home page
    When User input search "Pikachu" on home page and Click Enter
    Then User see article with contains "Pikachu" details and show that its "#025" pokemon

  Scenario: Search article about Apple on Wikipedia
    Given User open Bulbapedia home page
    When User input search "Charmeleon" on home page and Click Enter
    Then User see article with contains "Charmeleon" details and show that its "#005" pokemon