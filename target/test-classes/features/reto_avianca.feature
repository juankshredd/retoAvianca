#Actor: Christian Tapias Escudero - t.christian@tcs.com

Feature: as a user want to the form of the page

  Background: open browser
    Given I am in the main page

  @TEST1
  Scenario: the user complete the form
    When I fill the form and submit
      | name                           | phone      | email             | country  | city | username | password |
      | Luisa Fernanda Ramirez Beltran | 3107285252 | luisa@ramirez.com | Colombia | Cali | lfrb     | 123Abc   |
    Then I should watch the massage This is just a dummy form, you just clicked SUBMIT BUTTON

  @TEST2
  Scenario: the user complete the form
    When I fill the form and submit
      | name                           | phone      | email             | country  | city | username | password |
      | Luisa Fernanda Ramirez Beltran | 3107285252 | luisa@ramirez.com | Colombia | Cali | lfrb     | 123Abc   |
    Then I should watch the massage This is just a dummy form,