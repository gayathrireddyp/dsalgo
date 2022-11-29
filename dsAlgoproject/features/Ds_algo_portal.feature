Feature: Ds_Algo_Homepage

Scenario: succesfully opening Home page
    Given User Launches the chrome browser
   	When User opens the URL "https://dsportalapp.herokuapp.com/"
    And User clicks Get started button and enter in Ds_algo_Home page
    And User clicks on Data structures drop down button
    And User selects from the Drop down List
    Then User Gets the Alert message that you are not logged in
    And User clicks Get started buttons under one of  the six Data Structures
    Then User Gets the Alert message that you are not logged in
    When User clicks on sign in and redirected to particular page
    And User Clicks on Register!
    And close browser
   
  