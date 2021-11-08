Feature: Registration Error Validation

Scenario: Validate 'This field is required' message appears for Date of Birth field when left blank during registration
  Given I am on Home Page
  And I navigate to Registration Page
  When I am on Registration Page
  And I select 'Mr' in the title field
  And I enter 'Tom' in the firstName field
  And I enter 'Maringo' in the surname field
  And I click on termsAndConditions checkbox
  Then I click on Join Now from submission
  And 'This field is required' appears under Date of Birth field