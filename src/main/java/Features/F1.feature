Feature: Simple login test

Scenario: Case user is vaid

Given I opened the url
When I entered the username
And I entered the password
And I clicked log in button
Then I log in 