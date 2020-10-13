Feature: Is it the number is divisible by 3 or 5?


  Scenario Outline: Number is divisible by 3 and 5
    Given number is <number>
    When I ask if it's FizzBuzz
    Then I should be told <result>

    Examples:
      |number|result|
      |3|"Fizz"|
      |5|"Buzz"|
      |15|"FizzBuzz"|
      |2|"Nope"|