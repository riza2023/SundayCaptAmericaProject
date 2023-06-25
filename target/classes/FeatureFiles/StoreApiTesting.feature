@regression @api
Feature: Store API Testing

Scenario: Store CRUD API

Given  Create store
And    Get    store
Then   Delete store