Feature: To verify the adactin webPage

Scenario Outline:
  User should enter valid credentials only
 when user should launch the url of webpage
When User should enter username and password based on one dimensional map
           #one dimensional map
      |username|sivavasanth9597|
       |password|Siva@1234|
And User should click login button
Then User should verfiy login webpage succesfully 
And User should select the hotel location 
#one dimentional list
|London|
And User should select the hotel 
#one dimentional list
|Hotel Sunshine|
And User should select the roomtype 
#one dimentional list
|Deluxe|
And User should select the number of rooms 
#one dimentional map
|numberOfRooms|6|

And User should enter the hotel check in date 
#one dimentional map
|checkInDate|27/04/2023|

And User should enter the hotel check out date 
#one dimentional map
|checkOutDate|29/04/2023|

And User should select the adults per room 
#one dimentional list
|3|
And User should select the children per room 
#one dimentional list
|3|
And User should click search button
And User should select the radio button
And User should click the continue button
And User should enter the first name based on one dimensional map
#one dimensional map
|firstname|Siva|
And User should enter the last name based on one dimensional list
|M|
And User should enter the address based on one dimensional map
#one dimensional map
|address|24,sri road, sathish street,prakash district,TN|
And User should enter the sixteen digit credit card number based on one dimensional list
#one dimensional list
|1236123915182345|
And User should select the credit card type based on one dimensional map
#one dimensional map
|creditCardType|VISA|
And User should select the  expiryMonth and expiryYear two dimensional list
#two dimensional map
|expiryMonth|8|
|expiryYear|2015|
And User should enter the four digit one dimensional map
#one dimensional map
|cvvNumber|2345|
And User should click booknow button