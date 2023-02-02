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
@SmokeTest
Feature: I want to be able to enter my account info

  @SmokeTest
  Scenario: Afeter logged in, I should be enter a new account info
    Given I open "chrome" browser
    And I visit "qa" environment
    When I enter "batch07@codegator.com.qa" username
    And I enter "Welcome2" password
    When I click the "Login" button
    Then I should see the dashboard
    And I click the accounts tab
    When I click the new  " New " button
    And I Enter "MoAbdelhaye" Account name
    Then I Enter the "9090909090" account number
    And I Enter the "unknown" account Site
    And I Enter the "1000000" Annaul revenue
    Then I Enter the "010101010101" Phone number
    And I Enter the "0000000000" Fax number
    And I Enter the "www.moAbdelhay.com" website
    And I Enter the "22222222222" SIC code
    And I should see the following values for "00N3t00000LA9IN" field
      | --None-- |
      | Gold     |
      | Silver   |
      | Platinum |
      | Bronze   |
    Then I click the " Save " save button
    And I should see the reccord I saved
	@SmokeTest
  Scenario: As a valid user I should be able to login and create an account using data table
    Given I open "chrome" browser
    And I visit "qa" environment
    When I enter "batch07@codegator.com.qa" username
    And I enter "Welcome2" password
    When I click the "Login" button
    Then I should see the dashboard
    And I can create an account
      | Account_Name   | Account_Number | Rating |
      | MoAbdelhaye111 |         111111 | Warm   |
      | MoAbdelahye222 |         222222 | Cold   |