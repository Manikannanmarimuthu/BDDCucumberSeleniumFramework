Feature: DIV Login Feature 

Scenario: DIV Login Test 

	Given user is already available on login page 
	When title of login page is Web admin 
	Then user enter username  and password 
	Then user clicks on login button
	And user is on login page