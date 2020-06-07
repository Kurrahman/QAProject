@UI @Pulsa @Negative
Feature: UI Pulsa

  Scenario Outline : Filling invalid number and continue
    Given The user in on the digital product page
    And The user is logged in with 'akutakbiasa@gmail.com' and 'random123'
    When The user fill <handphone> to the form
    Then The user should not be able to continue to checkout
    Examples:
      | handphone        |
      | 0000000000000000 |
      | 08135            |
      | null             |
      | 0808080808       |