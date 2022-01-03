Feature: Deals


@Sprint7
Scenario: Verify Gaming PC Deals

Given Launch Dell "<URL>"
Then Mouseover on Deals Link
Then Click on Gaming PC Deals
And Verify Gaming PC Deals Page

@Sprint7
Scenario: Verify Workstations 

Given Launch Dell "<URL>"
Then Mouseover on Products Link
Then Click on Workstations
And Verify Workstations Page