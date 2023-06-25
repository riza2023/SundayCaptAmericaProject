@regression @smoke @Capt.America-2 @E2E
Feature: Ebay Search Functionality for Shirt

Background:        
Given Open Ebay Homepage

Scenario: Search for Shirt

		When  Search for Shirt
		And   Click search button
		Then  Item list should have only Shirt related products
		
		
