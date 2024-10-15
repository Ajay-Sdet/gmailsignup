
Feature: User will provide personal information
  
  In this scenario user will give basic personal information 

 
  Scenario: First name and last name information
    Given user on accounts page 
    When enter first and last name
    Then user can click on next


  Scenario: user will fill date of birth details
    Given user on basic infromation page
    When provides date of birth details
    And provides gender details
    Then user can click on next
    

  