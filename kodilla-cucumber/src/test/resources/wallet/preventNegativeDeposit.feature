Feature: Prevent users from making deposits on a sum below 0
  Scenario: User tries to deposit -1
    Given there is 100 in my wallet
    When I try to deposit -1
    Then The deposit is not made
    And I get a negative deposit error message

