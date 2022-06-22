Feature: To check wheter form is filled correctly 

Scenario Outline: Successful filling of form 

Given user is in form webpage 
When enter "<First name>" and "<Last Name>"
Then Quit the browser 

Examples:
|First name||Last Name|
|Red||Fox|
|Blue||Fox|
|Green||Fox|
