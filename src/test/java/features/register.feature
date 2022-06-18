@reg
  Feature: Registration
    @regsuc @smoke @regretion
    Scenario: User should be able to register successfully on demo.nopcommerce website

      Given user is on registration page
      When user enter all required filled and click on register button
      Then user can see Register success message

    @regfail
    Scenario: User should be able to register successfully on demo.nopcommerce website

      Given user is on registration page
      When user enter all required filled and click on register button
      Then user can see Register success message

    Scenario: User should be able to register successfully on demo.nopcommerce website

      Given user is on registration page
      When user enter all required filled and click on register button
      Then user can see Register success message
