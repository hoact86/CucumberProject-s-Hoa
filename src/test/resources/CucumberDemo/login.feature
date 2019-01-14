#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template
@tag
Feature: As a tool manager, I want ability to login module Admin

  @tag1
  Scenario: Login with username invalid  or password invalid
    Given I am staying login page
    When I enter username invalid or password invalid 
    And I submit button Login
    Then I see the error tooltip "Hãy nhập E-mail ở định dạng: user@email.com"

	@tag2
  Scenario: Login with username and password valid
 		Given I am staying login page
		When I give username and password valid
    And  I click button Login
    Then I see  admin page with logo "Testmaster.vn - Admin"
