Feature: DIV Add Card Program 

Scenario: DIV Add Card Program Test 
	Given addCrdpgm user is already available on login page 
	When addCrdpgm title of login page is Web admin 
	Then addCrdpgm user enters username and password
	|testoperatormaker|operator123| 
	Then addCrdpgm user clicks on login button 
	Then addCrdpgm user is on Home page 
	Then addCrdpgm click on the Card Program 
	Then addCrdpgm click on the Add Card program leftmenu 
	Then addCrdpgm enter the details bin and name and code and ppgm
	|875454646|MTest|M001|pptest01| 
	And addCrdpgm click ok button	