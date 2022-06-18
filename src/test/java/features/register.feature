@test
  Feature: Registration
    Scenario: User should be able to register successfully on demo.nopcommerce website

      Given user is on registration page
      When user enter all required filled and click on register button
      Then user can see Register success message