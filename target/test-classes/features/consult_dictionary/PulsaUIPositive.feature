@UI @Pulsa @Positive
Feature: UI Pulsa

  Scenario Outline : Filling number and continue
    Given The user in on the digital product page
    And The user is logged in with 'akutakbiasa@gmail.com' and 'random123'
    When The user fill <handphone> to the form
    Then The checkout number should be <handphone2>
    Examples:
      | handphone    | handphone2     |
      | 08984897050  | 0898 4897 050  |
      | 081357263067 | 0813 5726 3067 |

  Scenario Outline: Filling number and change product
    Given The user in on the digital product page
    And The user is logged in with 'akutakbiasa@gmail.com' and 'random123'
    When The user fill <handphone> to the form
    And The user change the product to <productName>
    Then The checkout amount should be <productName>
    Examples:
      | handphone    | productName |
      | 081357263067 | 40.000      |
      | 081357263067 | 100.000     |

  Scenario Outline: Filling number and change number
    Given The user in on the digital product page
    And The user is logged in with 'akutakbiasa@gmail.com' and 'random123'
    When The user fill <handphone1> to the form
    When The user fill <handphone2> to the form
    Then The checkout number should be <handphone3>
    Examples:
      | handphone1   | handphone2   | handphone3     |
      | 08984897050  | 081357263067 | 0813 5726 3067 |
      | 081357263067 | 08984897050  | 0898 4897 050  |


  Scenario Outline: Filling number and change partially
    Given The user in on the digital product page
    And The user is logged in with 'akutakbiasa@gmail.com' and 'random123'
    When The user fill <handphone1> to the form
    And The user change <ndigit> from position <position> to <change>
    Then The checkout number should be <handphone2>
    Examples:
      | handphone1  | ndigit | position | change  | handphone2    |
      | 08984897050 | 3      | 2        | 135     | 0813 5897 050 |
      | 08984897050 | 7      | 2        | 0000000 | 0800 0000 050 |