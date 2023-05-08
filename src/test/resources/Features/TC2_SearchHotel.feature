@SearchHotel
Feature: Verifying Adactin Hotel Search Hotel Details

  Scenario Outline: Verifying Adactin Search hotel by selecting all fields
    Given User is on Adactin page
    When User should perform login "<userName>","<password>"
    Then User should verify after login success message "Hello Rajalingam!"
    And User should perform search hotel by selecting all fields "<Location>","<Hotels>","<Roomtype>","<Noofrooms>","<Checkin>","<Checkout>", "<Adults>" and "<Child>"
    Then User should verify after search hotel success message "Select Hotel"

    Examples: 
      | userName   | password | Location | Hotels      | Roomtype | Noofrooms | Checkin    | Checkout   | Adults  | Child    |
      | Rajalingam | 9351GF   | Sydney   | Hotel Creek | Standard | 1 - One   | 03/01/2023 | 04/01/2023 | 1 - One | 0 - None |

  Scenario Outline: Verifying Adactin Search hotel by selecting only mandatory fields
    Given User is on Adactin page
    When User should perform login "<userName>","<password>"
    Then User should verify after login success message "Hello Rajalingam!"
    And User should perform search hotel by entering only mandatory fields "<Location>","<Noofrooms>","<Checkin>","<Checkout>" and "<Adults>"
    Then User should verify after search hotel success message "Select Hotel"

    Examples: 
      | userName   | password | Location | Noofrooms | Checkin    | Checkout   | Adults  |
      | Rajalingam | 9351GF   | Sydney   | 1 - One   | 03/01/2023 | 04/01/2023 | 1 - One |

  Scenario Outline: Verifying Adactin Search hotel by selecting invalid date
    Given User is on Adactin page
    When User should perform login "<userName>","<password>"
    Then User should verify after login success message "Hello Rajalingam!"
    And User should perform search hotel by selecting all fields "<Location>","<Hotels>","<Roomtype>","<Noofrooms>","<Checkin>","<Checkout>", "<Adults>" and "<Child>"
    Then User should verify after search hotel error message in date field "Check-In Date shall be before than Check-Out Date","Check-Out Date shall be after than Check-In Date"

    Examples: 
      | userName   | password | Location | Hotels      | Roomtype | Noofrooms | Checkin    | Checkout   | Adults  | Child    |
      | Rajalingam | 9351GF   | Sydney   | Hotel Creek | Standard | 1 - One   | 03/01/2024 | 04/01/2023 | 1 - One | 0 - None |

  Scenario Outline: Verifying Adactin Search hotel without entering value in any fields
    Given User is on Adactin page
    When User should perform login "<userName>","<password>"
    Then User should verify after login success message "Hello Rajalingam!"
    And User should perform search hotel without entering value in any fields
    Then User should verify after search hotel error message "Please Select a Location"

    Examples: 
      | userName   | password |
      | Rajalingam | 9351GF   |
