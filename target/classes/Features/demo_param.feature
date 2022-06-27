Feature: To check wheter form is filled correctly 

Scenario: Successful filling of form 

Given user is in form webpage 
When enter creds
			|Red|Fox|
Then Quit the browser 

