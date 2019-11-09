Feature: Boileiplate

Scenario: Calling boilerplate
	Given I want call the boilerplate
	When Make the request
	Then Should return boiler message
