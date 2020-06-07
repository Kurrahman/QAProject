@UI @Pulsa @Positive
Feature: UI Pulsa

  @Logged_in
  Scenario Outline : Selecting amount and continue
    Given The user is logged in with 'akutakbiasa@gmail.com' and 'random123'
    And The user in on the digital product page
    When The user fill <handphone> to the form
    Then Beli Sekarang button should be clickable


  Scenario: Looking up the definition of 'pear'
    Given the user is on the Wikionary home page
    When the user looks up the definition of the word 'pear'
    Then they should see the definition 'An edible fruit produced by the pear tree, similar to an apple but elongated towards the stem.'
