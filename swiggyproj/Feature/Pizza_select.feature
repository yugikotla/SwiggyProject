Feature: swiggy usage

@Regression
Scenario Outline: selecting the location searching for an item selcting the restarunt and accessing help

Given a user is on the home page of the swiggy
When he cliicks on the search button
And he enters a name as "chennai"
And he clicks on the search button
And he finds the search box
And he enters enters the name as "<item>"
And he selects the restarunt
And he clicks on the cart icon
And he compares the checkout page "Your cart is empty"
Then he clicks on the help button

Examples:
|item|
|pizza|