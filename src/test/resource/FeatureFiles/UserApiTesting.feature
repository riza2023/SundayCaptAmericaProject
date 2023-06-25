@regression @api
Feature: User API Testing

Scenario: User CRUD API

Given  Create user
And    Get    user
When   Update user
Then   Delete user