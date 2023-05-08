@SelectHotel
Feature: Verifying Adactin Hotel Select Hotel Details

  Scenario Outline: Verifying Adactin Select hotel by selecting hotel Name
    Given User is on Adactin page
    When User should perform login "<userName>","<password>"
    Then User should verify after login success message "Hello Rajalingam!"
    And User should perform search hotel by selecting all fields "<Location>","<Hotels>","<Roomtype>","<Noofrooms>","<Checkin>","<Checkout>", "<Adults>" and "<Child>"
    Then User should verify after search hotel success message "Select Hotel"
    And User should perform Select Hotel by selecting the Hotel
    Then User should verify after Select Hotel success message "Book A Hotel"

    Examples: 
      | userName   | password | Location | Hotels      | Roomtype | Noofrooms | Checkin    | Checkout   | Adults  | Child    |
      | Rajalingam | 9351GF   | Sydney   | Hotel Creek | Standard | 1 - One   | 03/01/2023 | 04/01/2023 | 1 - One | 0 - None |

  Scenario Outline: Verifying Adactin Select hotel without selecting hotel Name
    Given User is on Adactin page
    When User should perform login "<userName>","<password>"
    Then User should verify after login success message "Hello Rajalingam!"
    And User should perform search hotel by selecting all fields "<Location>","<Hotels>","<Roomtype>","<Noofrooms>","<Checkin>","<Checkout>", "<Adults>" and "<Child>"
    Then User should verify after search hotel success message "Select Hotel"
    And User should perform Select Hotel without selecting the Hotel
    Then User should verify after Select Hotel error message "Please Select a Hotel"

    Examples: 
      | userName   | password | Location | Hotels      | Roomtype | Noofrooms | Checkin    | Checkout   | Adults  | Child    |
      | Rajalingam | 9351GF   | Sydney   | Hotel Creek | Standard | 1 - One   | 03/01/2023 | 04/01/2023 | 1 - One | 0 - None |
