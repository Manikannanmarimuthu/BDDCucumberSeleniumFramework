Feature: DIV Add Prepaid Program 

Scenario Outline: DIV Add Prepaid Program Test 
	Given addpppgm user is already available on login page 
	When addpppgm title of login page is Web admin 
	Then addpppgm user enter "<username>" and "<password>" 
	Then addpppgm user clicks on login button 
	Then addpppgm user is on Home page 
	Then addpppgm click on the Wallet Prepaid Program 
	Then addpppgm click on the Add Prepaid program leftmenu 
	Then addpppgm enter the details"<ppname>" and "<ppcode>" and "<axprojectcode>" and "<axdivisioncode>" and "<transID>" and "<accountprefix>" 
	And addpppgm clic ok button 
	
	Examples: 
		| username | password |ppname|ppcode|axprojectcode|axdivisioncode|transID|accountprefix|
		|testoperatormaker|operator123|pp27|PPax27|PPaxj|PPD27|pptr27|123423|
		|testoperatormaker|operator123|pp28|ppax28|ppaxh|ppd28|pptr28|123234|
		|testoperatormaker|operator123|pp29|ppax29|ppaxh|ppd29|pptr29|123834|
		|testoperatormaker|operator123|pp30|ppax30|ppaxh|ppd30|pptr30|123934|
		|testoperatormaker|operator123|pp31|ppax31|ppaxh|ppd31|pptr31|123734|
		