Feature: Prevent users from making withdrawals on a sum below 0
  Scenario: User tries to withdraw -1
    Given there is 100 in my wallet
    When I try to withdraw -1
    Then The withdrawal is not made
    And I get a negative withdrawal error message