@switchlanguage
Feature: switch language from defult english to spanish then english. 

Description: 
User will be able to change language from english to spanish then back to english again.  



Scenario: switch language from defult english to spanish then english again


Given I am at expedia home page
When I click on lenguage Spanish laguage will change to spanish   
And I click on lenguage English again
Then I will be able to see the change of language on the home page english again. 