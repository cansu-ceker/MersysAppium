Feature: Account Settings

  Scenario: View and change account setting

    Given the user is logged in
    When the user navigate to the Setting page
    Then  they should see the following options in the Setting menu:
      | Edit Account    |
      | Switch School   |
      | Change Password |
      | Notification    |
      | Language        |
    When they click on the link
