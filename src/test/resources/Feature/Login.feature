Feature: User Login into the WhereIsMyPatient application

Background:
Given the user opens the URL "http://52.22.241.165:10026/"

Scenario: Successful login with valid credentials
When the user enters the email "user@mailinator.com" and the password "Testing12345$"
And clicks on the Log In button
Then the page navigates to the user dashboard screen

Scenario Outline: Login with invalid credentials
When the user enters the email "<username>" and the password "<password>"
And clicks on the Log In button
Then an error validation message shows "Invalid Credential."

Examples:
| username             | password      |
| user1@mailinator.com  | Testing12345  |

Scenario: Login with valid email and invalid password
When the user enters the email "user@mailinator.com" and the password "Testing123"
And clicks on the Log In button
Then an error validation message shows "Invalid Credential."

Scenario: Login with invalid email and valid password
When the user enters the email "user@mailinator" and the password "Testing12345$"
And clicks on the Log In button
Then an error validation message shows "Invalid email format"

Scenario: Login without entering any credentials
When the user does not enter any credentials "" and ""
And clicks on the Log In button
Then error validation messages show "Email is required" and "Password is required"

Scenario: Successful login with valid credentials using datatable
When the user enters the username and password and press enter key
|username|password|
|user@mailinator.com|Testing12345$|
Then the page navigates to the user dashboard screen