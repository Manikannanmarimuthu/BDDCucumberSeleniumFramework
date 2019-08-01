Feature: Home Page Link Verification 

@First @Second 
Scenario: Verify the Links available in HomePage 

	Given User should be available in HomePage 
	When Links should be loaded 
	Then Click on the Wallet Link 
	
@First @Second 
Scenario: Verify the Links available in HomePage1 

	Given User should be available in HomePage1 
	When Links should be loaded1 
	Then Click on the Wallet Link1 
	
@Third 
Scenario: Verify the Links available in HomePage2 

	Given User should be available in HomePage2 
	When Links should be loaded2 
	Then Click on the Wallet Link2