

Feature: as a user want to the form of the page

  Background: open browser
    Given I am in the main page

  @TEST2
  Scenario: the user complete the form
    When I fill the form and submit
      | country  | city |  password |
      | Colombia | Cali |  123Abc   |
    Then I should watch the massage This is just a dummy form,