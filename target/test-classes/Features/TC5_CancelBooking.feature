@CancelBooking
Feature: Verifying Adactin Booking Cancel Booking Details
	
  Scenario Outline: Verifying Adactin Cancel Booking for the current order id
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
    And User should perform Cancel Booking for that order id
    Then User should verify after Cancel Booking success message "The booking has been cancelled."

    Examples: 
      | userName   | password | Location | Hotels      | Roomtype | Noofrooms | Checkin    | Checkout   | Adults  | Child    | First      | Last | Address |
      | Rajalingam | 9351GF   | Sydney   | Hotel Creek | Standard | 1 - One   | 03/01/2023 | 04/01/2023 | 1 - One | 0 - None | Rajalingam | V    | Chennai |

  Scenario Outline: Verifying Adactin Cancel Booking for Existing order id
    Given User is on Adactin page
    When User should perform login "<userName>","<password>"
    Then User should verify after login success message "Hello Rajalingam!"
    And User should perform Cancel Booking for existing order id "<orderid>"
    Then User should verify after Cancel Booking success message "The booking has been cancelled."

    Examples: 
      | userName   | password | orderid    |
      | Rajalingam | 9351GF   | I96C7ETMM5 |
