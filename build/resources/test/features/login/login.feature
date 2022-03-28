Feature: Automation testing using Screenplay pattern.

    As an automation tester
    I need to practice automation testing using Screenplay patter
    for learn about serenity BDD framework


    Scenario: Fill a contact us login form using credentials

    Given the user is on landing page
    When him browse to login
    And him has filled it and submitted
    Then the user will see a confirmation message.


      Scenario: Fill a contact us login form without password

        Given the user is on landing page of automationpractice
        When him browse to log
        And him has filled it without password and submitted
        Then the user will see a password required error message.

