
Feature: user clicks on google agreement 

  I want to use this template foruser to agree gogle agreements


  Scenario: user scrolls down and clicks on agreement page
    Given user on agreement page
    When scrolls down to end page
    And click on i agree button
    Then press next button
   