@regression @smoke @Capt.America-4 @E2E
Feature: Ebay Search Functionality for Pants  
  
Background:     
Given Open Ebay Homepage

Scenario: Search for Pants
	
		When Search for Pants
		And  Click on search button
		Then Item list should have only Pants related products
		