Feature: DIV Create Card Manufacturer 

Scenario: DIV Add Card Program Test 
	Given addCrdMfr user is already available on login page 
	When addCrdMfr title of login page is Web admin 
	Then addCrdMfr user enters username and password 
		|username|password|
		|testoperatormaker|operator123| 
	Then addCrdMfr user clicks on login button 
	Then addCrdMfr user is on Home page 
	Then addCrdMfr click on the Card Program 
	Then addCrdMfr enter the details name and mailID and contactNo and publicKey then click Ok button and repeat 
		|name|emailAddress|ContactNo|pgpKey|
		|Manikanann|manikannan@mvitech.com|8754546460|PGPKEY00| 
		|Manikanann1|manikannan1@mvitech.com|8754546461|PGPKEY01| 
		|Manikanann2|manikannan2@mvitech.com|8754546462|PGPKEY02|
		|Manikanann3|manikannan3@mvitech.com|8754546463|PGPKEY03|
		|Manikanann4|manikannan4@mvitech.com|8754546464|PGPKEY04|
		|Manikanann5|manikannan5@mvitech.com|8754546465|PGPKEY05|
	And close the browser