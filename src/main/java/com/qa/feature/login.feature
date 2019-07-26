Feature: DIV Login Feature 

#Simple Data Driven Approch
# Without Example
#Scenario: DIV Login Test 

#	Given user is already available on login page 
#	When title of login page is Web admin 
#	Then user enter "admin" and "password" 
#	Then user clicks on login button 
#	And user is on login page


#With Examples
Scenario Outline: DIV Login Test 

	Given user is already available on login page 
	When title of login page is Web admin 
	Then user enter "<username>" and "<password>" 
	Then user clicks on login button 
	And user is on login page 
	
	Examples: 
		| username | password |
		|admin|password|
		|testoperatormaker|operator123|
		
		