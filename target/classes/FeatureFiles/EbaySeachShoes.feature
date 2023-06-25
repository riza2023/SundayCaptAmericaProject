@regression @smoke @Capt.America-1 @E2E
Feature: Ebay Search Functionality


	Scenario: Search for Shoes
	  Given Open Ebay Homepage
		When Search for Shoes
		And Click search button
		Then Item list should have only Shoes related products