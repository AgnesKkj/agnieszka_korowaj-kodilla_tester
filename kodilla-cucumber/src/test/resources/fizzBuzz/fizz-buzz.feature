Feature: Fizz-Buzz

  Scenario Outline: The number is divisible by 3, is divisible by 5, is divisible by 3 and 5, or is not divisible by 3 or 5
    Given number is <number>
    When I ask if the number <isDivisibleByThree>
    And I ask if the number <isDivisibleByFive>
    When I compare <isDivisibleByThree> and <isDivisibleByFive>
    Then I should get a message <answer>

  Examples:
  | number | isDivisibleByThree | isDivisibleByFive | answer |
  | 6 | true | false | "Fizz" |
  | 15 | true | true | "FizzBuzz" |
  | 7 | false | false | "None" |
  | 10 | false | true | "Buzz" |