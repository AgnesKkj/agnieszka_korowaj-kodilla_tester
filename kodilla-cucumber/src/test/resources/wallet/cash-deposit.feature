Feature: Cash Deposit

  Scenario Outline:
    Given my initial balance is <initialBalance>
    But my initial balance isn't less than '0'
    When I deposit <money> in my wallet
    Then The new balance is <newBalance>
    And the new balance is not <falseBalance>

    Examples:
    | initialBalance | money | newBalance | falseBalance |
    | 0              | 200   | 200        | -100         |
    | 200            | -100  | 200        | 100          |
    | 100            | 250   | 350        | 0            |
    | 0              | 0     | 0          | 100          |
    |-1              | 100   | 0          | 0            |
