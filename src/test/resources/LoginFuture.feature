
Feature: Login to CRM application

  Scenario: CRM application login and validate web page title
    Given I want to login CRM application "<String>"
    And Enter the "<userName>" and "<password>"
    When Click on login button
    Then validate CRM homepage

