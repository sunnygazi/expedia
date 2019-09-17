@accountLongin
Feature: Web application account login function and web account webpage velidation. 

Description: 
User able to login with valid credentials



Scenario Outline: Login function validation
Given Put URL and go to home apge
When I click on login  
And I enter Username as "<name>" and Password as "<password>"
Then login should be successful


Examples:
| name  					| password       		 | 
| ibrahimgaziqa@gmail.com	| VFyVpz6k-bcVRrR 		 |