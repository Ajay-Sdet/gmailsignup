
Feature: Navigate to google page and clicking on Gmail

This feature is just to landing on Google page and from google page to landing on Gmail page 
  
  
  Scenario: Landing to Google search page
    Given Google website url 
    When Google url hits on url search
    Then Google page opens 
    And user can see the google page

  Scenario: Click on gmail after landing google page
  
    When user click on gmail link 
    Then user will land on gmail page
    And user can see url "https://www.google.com/gmail/about/"

    
