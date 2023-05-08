@BookHotel
Feature: Verifying Adactin Hotel Book Hotel Details

  Scenario Outline: Verifying Adactin Book Hotel by Selecting all fields
    Given User is on Adactin page
    When User should perform login "<userName>","<password>"
    Then User should verify after login success message "Hello Rajalingam!"
    And User should perform search hotel by selecting all fields "<Location>","<Hotels>","<Roomtype>","<Noofrooms>","<Checkin>","<Checkout>", "<Adults>" and "<Child>"
    Then User should verify after search hotel success message "Select Hotel"
    And User should perform Select Hotel by selecting the Hotel
    Then User should verify after Select Hotel success message "Book A Hotel"
    And User should perform Book Hotel by selecting all the fields "<First>","<last>" and "<Address>"
      | CreditcardNo     | Creditcardtype   | Expmonth  | Expyear | Cvv |
      | 9076543210987654 | American Express | January   |    2022 | 456 |
      | 4576543210987653 | VISA             | December  |    2021 | 458 |
      | 9876543210987609 | Master Card      | September |    2022 | 498 |
      | 0976543210987651 | Other            | July      |    2020 | 410 |
     Then User should verify after Book Hotel success message "Booking Confirmation" and save the order id

    Examples: 
      | userName   | password | Location | Hotels      | Roomtype | Noofrooms | Checkin    | Checkout   | Adults  | Child    | First      | Last | Address |
      | Rajalingam | 9351GF   | Sydney   | Hotel Creek | Standard | 1 - One   | 03/01/2023 | 04/01/2023 | 1 - One | 0 - None | Rajalingam | V    | Chennai |

  Scenario Outline: Verifying Adactin Book Hotel without Selecting any fields
    Given User is on Adactin page
    When User should perform login "<userName>","<password>"
    Then User should verify after login success message "Hello Rajalingam!"
    And User should perform search hotel by selecting all fields "<Location>","<Hotels>","<Roomtype>","<Noofrooms>","<Checkin>","<Checkout>", "<Adults>" and "<Child>"
    Then User should verify after search hotel success message "Select Hotel"
    And User should perform Select Hotel by selecting the Hotel
    Then User should verify after Select Hotel success message "Book A Hotel"
    And User should perform Book Hotel Without selecting any fields
    Then User should verify after Book Hotel error messages "Please Enter your First Name","Please Enter you Last Name","Please Enter your Address","Please Enter your 16 Digit Credit Card Number","Please Select your Credit Card Type","Please Select your Credit Card Expiry Month" and "Please Enter your Credit Card CVV Number"

    Examples: 
      | userName   | password | Location | Hotels      | Roomtype | Noofrooms | Checkin    | Checkout   | Adults  | Child    |
      | Rajalingam | 9351GF   | Sydney   | Hotel Creek | Standard | 1 - One   | 03/01/2023 | 04/01/2023 | 1 - One | 0 - None |
