Feature: Dell Login


@Sprint7
Scenario: Verify User Login in Profile

Given Launch Dell "<URL>"
Then Click SignIn and Click SignIn Button
Then Enter UserName and Password and Click Login
Then Verify User in Profile Page


