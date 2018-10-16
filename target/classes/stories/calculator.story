Narrative:
As a user
I want to perform operation an action
So that I can see result two numbers

Scenario: scenario Adddition
Given a Calculator Class with operation sign <sign>
When I give the first number <number1>
And I give the second number <number2>
Then I should get the result as <result>

Examples:
|sign|number1|number2|result|
|+|3|4|7|
|+|5|4|9|
|+|11|4|15|
|+|12345|4|12349|
|+|0|0|0|
|+|1|1|2|
|+|3|4|7|
|+|5|6|11|
|+|1|1|2|
|+|3|4|7|
|-|3|2|1|
|-|23|2|21|


Scenario: scenario Substraction
Given a Calculator Class with operation sign <sign>
When I give the first number <number1>
And I give the second number <number2>
Then I should get the result as <result>

Examples:
|sign|number1|number2|result|
|-|9|4|5|


Scenario: scenario Multiplication
Given a Calculator Class with operation sign <sign>
When I give the first number <number1>
And I give the second number <number2>
Then I should get the result as <result>

Examples:
|sign|number1|number2|result|
|*|3|4|12|

Scenario: scenario Division
Given a Calculator Class with operation sign <sign>
When I give the first number <number1>
And I give the second number <number2>
Then I should get the result as <result>

Examples:
|sign|number1|number2|result|
|/|12|4|3|