Feature: Automation testing using Screenplay pattern.

    As an automation tester
    I need to practice automation testing using Screenplay patter
    for learn about serenity BDD framework


  Scenario: Fill a contact us registration form using mandatory fields

    Given the user is on landing page of the automationpractice
    When him browse to contact us link
    And him has filled it and submitted

    Then the user will see a confirmation message.


      Scenario: Fill a contact us registration form without email field

        Given the user is on landing page of automationpractice
        When him browse to contact us
        And him has filled it without subject and submitted

        Then the user will see a subject error message.


