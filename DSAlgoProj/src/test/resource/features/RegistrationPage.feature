@registration
Feature: Registration page functionality
  
  
  
  I want to test the functionality of the registration page

  Background: 
    Given user Launch the Browser

  @testcase06
  Scenario: check if user can successfully register without filling fields
    Given user open the Homepage of dsportal and click get started button
    Given user Navigate to the Register Page of DSPortal
    When user clicks registration button
    Then user should get an error message below username textbox

  @testcase07
  Scenario: check if user can register successfully with only valid username
    When user open the Homepage of dsportal and click get started button
    Given user Navigate to the Register Page of DSPortal
    And user enters valid username "sheetal"
    When user clicks registration button
    Then user should get an error message below password textbox

  @testcase08
  Scenario: check if user can register successfully when only confirmatory password field is blank
    When user open the Homepage of dsportal and click get started button
    Given user Navigate to the Register Page of DSPortal
    And user enters valid username "sheetal"
    And the user enters valid password  "gill"
    When user clicks registration button
    Then user should get an error message below password confirmation box

  @testcase09
  Scenario: check if user can register successfully with invalid username (only symbols)
    When user open the Homepage of dsportal and click get started button
    Given user Navigate to the Register Page of DSPortal
    And user enters symbols as username "@/!/%/$/#/@"
    And the user enters valid password "gill"
    And also matching confirmatory password "gill"
    When user clicks registration button
    Then user should get an error message

  @testcase10
  Scenario: check is user can register successfully with different passwords
    When user open the Homepage of dsportal and click get started button
    Given user Navigate to the Register Page of DSPortal
    And user enters valid username "Sheetal"
    And the user enters valid password  "Gill"
    And also matching confirmatory password "Gill%%%%%"
    When user clicks registration button
    Then user should get error message

  @testcase11
  Scenario: check if user can register successfully with less than 8 characters
    When user open the Homepage of dsportal and click get started button
    Given user Navigate to the Register Page of DSPortal
    And user enters valid username "Sheetal"
    And the user enters valid password "gill"
    And also matching confirmatory password "gill"
    When user clicks registration button
    Then user should get an error message

  @testcase12
  Scenario: check if user can register successfully with numerical password
    When user open the Homepage of dsportal and click get started button
    Given user Navigate to the Register Page of DSPortal
    And user enters valid username "Sheetal"
    And the user enters valid password "1234"
    And also matching confirmatory password "1234"
    When user clicks registration button
    Then user should get an error message

  @testcase13
  Scenario: user successfully registers
    When user open the Homepage of dsportal and click get started button
    Given user Navigate to the Register Page of DSPortal
    And user enters valid username "SeleniumSDET129"
    And the user enters valid password "NumpyNinja@1234"
    And matching confirmatory password "NumpyNinja@1234"
    When user clicks registration button
    Then user should be redirected to homepage

  @testcase14
  Scenario: user should be Redirected to login Page
    When user open the Homepage of dsportal and click get started button
    Given user Navigate to the Register Page of DSPortal
    And user enters valid username "SheetalKarotiya"
    When user click to login button
    Then user should be redirected to Login Page

  @testcase15
  Scenario: user Get Alert Message you are not Logged in
    When user open the Homepage of dsportal and click get started button
    Given user Navigate to the Register Page of DSPortal
    And user enters valid username "SheetalKarotiya"
    And user click to Dropdown of DataStructure
    When user navigate to Array button
    Then user get Alert Message "you are not Logged in"

  @testcase16
  Scenario: user should be Redirected to login Page
    When user open the Homepage of dsportal and click get started button
    Given user Navigate to the Register Page of DSPortal
    And user enters valid username "SheetalKarotiya"
    And the user enters valid password "1234"
    When user click to login button
    Then user should be redirected to Login Page

  @testcase17
  Scenario: user should be Redirected to login Page
    When user open the Homepage of dsportal and click get started button
    Given user Navigate to the Register Page of DSPortal
    And user enters valid username "SheetalKarotiya"
    And the user enters valid password "1234"
    When user click to login button
    Then user should be redirected to Login Page
