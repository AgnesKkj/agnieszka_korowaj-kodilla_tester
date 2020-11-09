Feature: Cash Withdrawal
  I have a wallet with specific balance and I withdraw a desired amount of money
  Scenario Outline: Successful withdrawal from a wallet
    Given I have deposited <depositedBalance> in my wallet
    When I request <requestedAmount>
    Then <withdrawnAmount> should be dispensed
    And <withdrawnAmount> is equal <requestedAmount>
    And the final balance is <finalBalance>
    Examples:
      | depositedBalance | requestedAmount | withdrawnAmount | finalBalance |
      | 200              | 30              | 30              | 170          |
      | 200              | 200             | 200             | 0            |
      | 400              | 200             | 200             | 200          |
      | 0                | 200             | 0               | 0            |
      | 200              | 400             | 0               | 200          |
      | -100             | 200             | 0               | -100         |
      | 200              | -100            | 0               | 200          |
      | 200              | 0               | 0               | 200          |

  #Scenario: Successful withdrawal from a wallet
    #Given I have deposited $200 in my wallet
    #When I request $30
    #Then $30 should be dispensed