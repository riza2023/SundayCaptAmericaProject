@regression @api
Feature: Petstore API Testing

Scenario: Pet CRUD API    //c:create(post),r:read(get), u:update, d:delete
	
	Given   Create pet
	And     Update pet
	When    Get   pet
	Then    Delete pet