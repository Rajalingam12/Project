@Login
Feature: verifying Adactin Hotel Login details
  
  Scenario Outline: Verifying adactin hotel with valid
    Given User is on Adactin page
    When User should perform login "<userName>","<password>"
    Then User should verify after login success message "Hello Rajalingam!"

    Examples: 
      | userName   | password |
      | Rajalingam | 9351GF   |

  Scenario Outline: Verifying adactin hotel using Enter
    Given User is on Adactin page
    When User should perform login "<userName>","<password>" with Enter key
    Then User should verify after login success message "Hello Rajalingam!"

    Examples: 
      | userName   | password |
      | Rajalingam | 9351GF   |

  Scenario Outline: Verifying adactin hotel with invalid credentials
    Given User is on Adactin page
    When User should perform login "<userName>","<password>"
    Then User should verify after login error message contains "Invalid Login details or Your Password might have expired"

    Examples: 
      | userName   | password |
      | Rajalingam | 9351GF09 |
