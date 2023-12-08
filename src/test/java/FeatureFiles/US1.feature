Feature: Platform Choice


  Scenario: User makes a selection from one of the platforms
    Given User initiates application and selects allow notification by clicking it
    Then User sees Select Platform text
    When User selects one of the platforms
    Then User sees Login to Campus text