Feature: WU Registration

  Scenario Outline: TC001 WU Registration Validation
    Given user launches the application
    When user click on register tab in the home page
    Then verify that user landed on registration page
    And user enter the first name as <firstName> in the first name field
    And user enter the middle name as <middleName> in the middle name field
    And user enter the last name as <lastName> in the last name field

    Examples: 
      | firstName | middleName | lastName |
      | Subbu     | Mani       | Nani     |
      | Sunil     | Anil       | Revuri   |
