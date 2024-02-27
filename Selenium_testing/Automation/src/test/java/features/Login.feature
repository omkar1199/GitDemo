Feature: Application Login
Scenario: Homepage default login
Given User is on Netbanking landing page
When User login into page with username and password
Then Homepage is populated
And cards are displyed