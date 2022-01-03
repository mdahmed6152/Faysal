Feature: Dell Login


@Sprint7
Scenario: Verify User Login in Profile

Given Launch Dell "<URL>"
Then Click SignIn and Click SignIn Button
Then Enter UserName and Password and Click Login
Then Verify User in Profile Page

@Sprint7
Scenario: Verify XPS result

Given Launch Dell "<URL>"
Then Enter XPS on Search Field
Then Click on Search Button
And Verify XPS Search Result

