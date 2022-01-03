Feature: Gmail Login

@GmailLogin
Scenario: Verify User Can Login in Gmail Account


Given Launch Gmail "<URL>"
Then Enter Username and Enter Password and Click On Next
Then Verify User is in the Gmail Account