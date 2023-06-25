@regression @smoke @Capt-1

Feature: 			Ebay Brand Outline
Description: 	User shoud be able to filter items by Brand
Background:   Given Open Ebay Homepage

Scenario Outline:  Filter items by Brand
                   Given Search for "<Items>"
          		     When Filter by "<Brand>"
         			     Then Items list should have products of "<Brand>"
          
Examples:
							|Items		|Brand|
							|Shoes		|Nike|
							|Shirts		|Adidas|
							|Pants		|Unbranded|





















