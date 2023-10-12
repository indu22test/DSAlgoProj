@DataStructure
Feature: Data Structures-Introduction
  
  I want to use this as  my feature file

  Background: 
    Given user Launch the Browser
    When user open the Homepage of dsportal and click get started button
    When user Navigate to Sign in button
    When user enters the Valid Username
    And enter Valid Password
    And user click the login button
    Then user should successfully login into Homepage

  @tc19
  Scenario: Open the DataStructures-Introduction page
    When user click to Get Started button below Data Structure
    Then User should land on DataStructures-Introducti-on-Introduction page

  @tc20
  Scenario: Open the Time Complexity page
    When user click to Get Started button below Data Structure
    And user click to time complexity button
    Then user should redirected to time complexity page

  @tc21
  Scenario: Opent the Practice Questions Page
    When user click to Get Started button below Data Structure
    And user click to time complexity button
    When user navigate to practice questions button
    Then User should land on the blank practice page

  @tc22
  Scenario: Display the try Editor Page with Run button to Test
    When user click to Get Started button below Data Structure
    When user click to time complexity button
    When user click the try here button
    Then user should be redirected to the try editor page

  @tc23
  Scenario: Print Message hello world in the Editor Page
    When user click to Get Started button below Data Structure
    And user click to time complexity button
    When user click the try here button
    When user enters the Print Message HelloWorld in the Editor box
    And user click the run Button
    Then user able to see the print message hello world

  @tc24
  Scenario: Get Alert Message of Syntx Error
    When user click to Get Started button below Data Structure
    And user click to time complexity button
    When user click the try here button
    When user enters the Print Message in Editor box
    And user click the run Button
    Then user able to see the Alert message of Syntx Error
    And user clicks ok Button
