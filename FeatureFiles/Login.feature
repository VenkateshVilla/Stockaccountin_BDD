Feature: stock accounting login validation

@test1
Scenario: login validation with valid user credentials

			When I open chrome 
			And launch stock url
			When I enter username 
			And I enter password
			When I click on login button
			Then I should see the homepage

@test2
Scenario: ApplicationLogin Validation
	When Open Browser
	When Open Application
	When Wait For Username
	When Enter Username
	And Wait For Password
	And Enter Password
	And Wait For Password
	When Click On Login
	When wait For Logout
	When Click On Logout
	When Wait For OK 
	When Click On Ok
	When CloseBrowser
