Feature: our-people search and sort by functinality.

@first
Scenario:  Search for a person, validate that the correct person was found 
	Given you are on octopus website 
	When search for Chloe Allan ,who is there in the list. 
	Then Then Validate that Chloe Allan found was correct  
	
#Examples:
#
#|Person |
#|Chloe Allan|
#|Patrick Deane|


@second
Scenario: Click on an image and verify that the profile details match the person found
	When Click on the image  
	Then verify that the profile details match the person found
	
@third
Scenario: Sort by A-Z  and verify that the sorting order is correct
	Given go back on our-people search page
	When selected for Sort by A-Z 
	Then Validate A-Z sorting order is correct 

@fourth  
Scenario: Sort by Z-A  verify that the sorting order is correct
	When selected for Sort by Z-A 
	Then Validate Z-A  sorting order is correct

@fifth
Scenario: Search for Person who is not a part of team
	When search for Person Pallavi Gajelli           
	#who is not there in the list
	Then Validate that correst error msg is shown

@sixth
Scenario: search for a person in different Team , verify for error msg
	When search for Chloe Allan ,who is there in the list
	When Client relations team is selected 
	Then verify error msg No results found 
