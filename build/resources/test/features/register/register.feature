Feature: Automation testing using Screenplay pattern.

    As an automation tester
    I need to practice automation testing using Screenplay patter
    for learn about serenity BDD framework


  Scenario Outline: Fill a register registration form using mandatory fields

    Given the user is on landing page of automationpractice
    When him browse to register
    And him has filled it and submitted

    |firstName|<firstName>|
    |lastName|<lastName>|
    |password|<password>|
    |address|<address>|
    |city|<city>|
    |state|<state>|
    |postalCode|<postalCode>|
    |country|<country>|
    |phone|<phone>|

    Then the user will see a confirmation message.


Examples:
    |firstName|lastName|password|address|city|state|postalCode|country|phone|
    |Johan|Muneton|123456789|avenida siempre viva 123|Juneau|Alaska|00001|United States|3001234567|




      Scenario Outline: Fill a contact us registration form without email field

        Given the user is on landing page of automationpractice
        When him browse to register
        And him has filled it with postalCode  different of five digits and submitted
        |email|<email>|
        |firstName|<firstName>|
        |lastName|<lastName>|
        |password|<password>|
        |address|<address>|
        |city|<city>|
        |state|<state>|
        |postalCode|<postalCode>|
        |country|<country>|
        |phone|<phone>|

        Then the user will see a postalCode error message.

        Examples:
        |firstName|lastName|password|address|city|state|postalCode|country|phone|
        |Johan|Muneton|123456789|avenida siempre viva 123|Juneau|Alaska|0000|United States|3001234567|



