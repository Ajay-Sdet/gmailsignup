Feature: Verification through phone number
 
  I want to use this template for phone number details

  Scenario: user provides valid phone number
    Given user on confirm you are not a robot page
    When select india country from the dropdown list
    And provide valid phone number 
    Then click on next to verify phone number verification
    

  Scenario: user will provide verification code
    Given user on verification page 
    When provides the verification code
    Then click on next to verify phone number verification
   