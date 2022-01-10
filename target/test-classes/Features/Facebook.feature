@E2E
Feature: Verify facebook application

  Background: 
    Given User is on facebook login page

  @Sanity @Reg
  Scenario Outline: Validate facebook login with invalid credentials
    When User enter "<userName>" and "<password>"
    And User click on login Button
    Then User get error message

    Examples: 
      | userName      | password |
      | abu@gmail.com | abu@123  |

  @Smoke @Reg
  Scenario: Validate facebook singup page with invalid credentials
    When User click on createNew Button
    And User enters "Nitish" and "Selvakumar"
    Then User Click on signup Button
