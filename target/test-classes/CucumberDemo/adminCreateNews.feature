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
Feature: As a tool manager, I want ability to create News, 
so that I can deliver it to our customer who subscripted from Front-end module

  @tag1
  Scenario: Group, Name, Subject and Body are mandatory information
    Given I am staying CreateNews Page
    When I click menu Send News  
    And  I give Group, Name, Subject and Body are blank        
    And I do submit button Next
    Then  I see message error "This is required field" 

