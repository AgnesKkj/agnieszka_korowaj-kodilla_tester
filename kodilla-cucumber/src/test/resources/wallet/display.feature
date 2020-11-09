Feature: Display balance
  Scenario Outline: User checks the balance of their wallet
  Given there is <balance> in my wallet
  When I check the balance
  Then I should see that the balance is <balance>
  And I should see that the balance is not <falseBalance>
    Examples:
    | balance | falseBalance |
    | 30      | 0            |
    | 1       | -1           |
    | 200     | 400          |
    | 0       | 100          |


