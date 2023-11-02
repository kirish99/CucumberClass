Feature: To Validate Login functionality

Scenario: to validate login with invalid username and invalid password
Given To user launch chrome browser
And To User pass url
When To user enters invalid username and invalid password
And To user click login button
Then To user verify invalid error
And To quit chrome browser

