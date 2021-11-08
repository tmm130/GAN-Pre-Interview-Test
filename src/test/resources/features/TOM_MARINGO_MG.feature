Feature: Validate New Password Criteria

  Background: Navigate to registration page
		Given I am on Home Page
		And I navigate to Registration Page
		And I am on Registration Page


  Scenario Outline: Validate an error is displayed when a user enters incorrect password criteria during registration
    When I fill out the form with <title>, <firstName>, <surname>, <birthDay>, <birthMonth>, <birthYear>, <password>
    And I click on termsAndConditions checkbox
    And I click on Join Now submission button
    Then an error appears under Password field

    Examples: 
      | title | firstName | surname | birthDay | birthMonth | birthYear | password |
      |  Mr   |    Tom    | Maringo |    1     |     1      |    1970   | notgood  |
      |  Mr   |    Tom    | Maringo |    1     |     1      |    1970   | notgood1 |
      |  Mr   |    Tom    | Maringo |    1     |     1      |    1970   | notgood$ |
      |  Mr   |    Tom    | Maringo |    1     |     1      |    1970   | not1!    |
      |  Mr   |    Tom    | Maringo |    1     |     1      |    1970   | 4321!    |
      |  Mr   |    Tom    | Maringo |    1     |     1      |    1970   | &$@!#    |
      
  Scenario Outline: Validate that when a user enters a valid password that registration is completed successfully
    When I fill out the form with <title>, <firstName>, <surname>, <birthDay>, <birthMonth>, <birthYear>, <password>
    And I click on termsAndConditions checkbox
    And I click on Join Now submission button
    Then registration is completed successfully

    Examples: 
      | title | firstName | surname | birthDay | birthMonth | birthYear | password 				 |
      |  Mr   |    Tom    | Maringo |    1     |     1      |    1970   | good1!  				 |
      |  Mr   |    Tom    | Maringo |    1     |     1      |    1970   | 4good@  				 |
      |  Mr   |    Tom    | Maringo |    1     |     1      |    1970   | $good3   				 |
      |  Mr   |    Tom    | Maringo |    1     |     1      |    1970   | &good2   				 |
      |  Mr   |    Tom    | Maringo |    1     |     1      |    1970   | 12345!   				 |
      |  Mr   |    Tom    | Maringo |    1     |     1      |    1970   | &goodpassword2   |
      |  Mr   |    Tom    | Maringo |    1     |     1      |    1970   | &@!$1#           |