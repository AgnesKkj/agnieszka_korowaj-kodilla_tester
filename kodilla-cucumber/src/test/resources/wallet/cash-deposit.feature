Feature: Cash Deposit
  I have a wallet and I deposit a desired amount of money in it

  Scenario Outline:
    Given my initial balance is <initialBalance>
    And my initial balance isn't less than '0'
    When I deposit <money> in my wallet
    Then The new balance is <newBalance>
    And the new balance is not <falseBalance>

    Examples:
    | initialBalance | money | newBalance | falseBalance |
    | 0              | 200   | 200        | -100         |
    | 200            | -100  | 200        | 100          |
    | 100            | 250   | 350        | 0            |
    | 0              | 0     | 0          | 100          |
    |-1              | 200   | 0          | 0            |
