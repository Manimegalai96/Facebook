Feature: Account creating in Facebook application

Scenario: user Login the Facebook application
Given user Launch the Url
Scenario Outline: user Enter the "<username>" in User Field
And user Enter the "<password>" in Password Field
Then user Click the Login button 
But user Dont Have Account and Click to Create New Account

Examples:
|username|password|
|Manimegalai Nagendiran|M@ni1996|
|Manimegalai Guhan|M@ni1990|

Scenario: user Navigates Create New Account pages
When user Enter the "Manimegalai" in FirstName Field
And user Enter the "Nagendiran" in LastName Field
And user Enter the "73586787159" in Mobile Field
And user Enter the "M@ni19960301" in newPassword Field
And user Select the dropdown for Date Field
And user Select the dropdown for Month Field
And user Select the dropdown for Year Field
And user Click the Gender button 
Then user Click the SignUp button for Create Account