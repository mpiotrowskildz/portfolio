## Sanity Test 01
The procedure for creating the test case scenario was that first and foremost a sanity test should pass:  

TCID|Title|Preconditions|StepID|Step description|Expected result|  
--|--|--|--|--|--
C1|Correct registration|The app is opened, the registration form is opened|1|Click "Rejestracja".| 
 | | | |2|Enter a username. Use no more than 100 characters.| 
 | | | |3|Enter a correct email address.| 
 | | | |4|Enter a password that consists of at least 4 characters, at least one lowercase letter, one uppercase letter, one digit 0-9 and one of the following special characters: !@#$%^&*|
 | | | |5|Tick the checkbox.|
 | | | |6|Click "Rejestruj"|Creates a new account, a confirmation e-mail is sent to the given address and the user is informed about these actions.
C2|Correct 'Regulamin' link action|The app is opened and the option 'Rejestracja' is chosen.|1|Click the link 'Regulamin'|Your browser opens up [http://3.mrbuggy.pl/index/terms_of_use.](http://3.mrbuggy.pl/index/terms_of_use).

While C2 passed, there was an error in C1, step 4 - there were too few characters as the app requires 6 characters, so the test failed. It was decided that 6 characters are much safer and instead of changing the app, the documentation was amended.
Further test cases were created and you can find them in RegistrationTC.csv

## More to come soon!
