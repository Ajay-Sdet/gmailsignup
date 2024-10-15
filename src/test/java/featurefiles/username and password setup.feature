Feature: user will setup username and password 
 
  I want to use this template for setting up username and password

  Scenario: user will give valid username to create username
    Given user on how you will sign in page
    When gives valid username 
    Then user click on next

 Scenario: user will setup valid password
     
     Given user on create a strong password page
     When gives valid password 
     And reconfirm the given password 
     Then user click on next  
     
