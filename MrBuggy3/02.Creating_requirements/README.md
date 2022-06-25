## Creating requirements for the app
The following served as a test basis that allowed me to create test conditions and test cases as a result.
1. The app consists of the client app and the server app.
1. There need to be **three** versions of the client app: demo, final and public.
2. The demo includes only one task, different from the tasks available in the final and public versions.
3. The public version will be released after the Cup has ended.
4. The three versions differ only in terms of the number of tasks: 1 for the demo, 15 for the other two.
5. The app needs to run on
   * Windows 7/8/8.1 - the client app;
   * Windows 7 - the server app.
6. The client app has to deliver data to the server app in the form of a text file, either directly via the app, or by being exported from the client app and then imported by the server app.
7. The client app has to allow the users to find one defect in each exercise/task and report it.
8. The exercises/tasks
8. The client app needs to generate an event log.
9. All exercises/tasks have to be implented in the app.
10. The exercises/tasks need to include functional or security defects.
11. The exercises/tasks have to be shown in a random order
11. The client app has to work in two modes:
    * team: captain and team member modes;
    * individual: player mode.
15. Reporting defects has to be blocked in the team member mode.
13. The app cannot lose any data in case of a sudden crash.
14. A backup has to be created each time the "Report a defect" is clicked. The backup needs to be in a text format.
15. If a loss of connection occurs, the user should still be able to use the app.
16. The whole GUI needs to be in Polish.
17. The app window should be divided into two parts: "Zadania" (Exercises/Tasks) and "Menu boczne" (Side menu).
18. The side menu has to consist of boxes displaying the following:  
    * time left to the end of the round (the final version),
    * the exercise/task no.,
    * "Opis zadania" - the description of the exercise/task, 
    * "Lista zadań" list of tasks/exercises,
    * navigation buttons: "Następne" (Next) and "Poprzednie" (Previous),
    * "Zaraportuj defekt" (Report a bug) button,
    * "Zakończ" (Finish) button.
19. The exercise/task window has to show the current exercise/task being done.
20. The app window must include a MrBuggy 3 icon.
21. "Opis zadania" should also include the number of possible points to score.
22. "Lista zadań" has to allow for navigation between exercsises/tasks and also to clearly show the current task, tasks without an answer and those which have been answered.
23. "Zakończ" button has to export all the answers to the server/a text file. This action cannot be undone and can be done only once. This action needs to be confirmed in a separate message.
24. The server app has to be accessed by the command line or a GUI and is dedicated only to the jury of the tournament.
25. The server app has to:  
    * fetch reports of all the teams and users;
    * keep the scoreboard divided into team and individual scores;
    * automatically check the reported defects;
    * allow the jury to manually change the score;
    * show the general rank on a seperate monitor;
    * allow for generating an overall report that includes the user's position in the rank, the name of the user and its team, the number of points given for each task/exercise done by each member and team and the sum of points scored by each team member and the whole team;  
29. Log all events (i.e. [un]successfully received report, or correctly reviewed report) in the server log.
30. The interface's response time should be shorter than 1 sec.
31. The general report should be generated under 15 sec.
32. The backup copy of the client app should not exceed 2MB.
33. The client app cannot use more than 100MB of RAM.
33. The server app needs to be able to receive 50 reports at once.
34. The access to both the server and client apps needs to be login and password protected. 
35. Each user of the app has to have a seperate login which consists of 4-8 characters (at least one lowercase letter, one uppercase letter, one number 0-9 and one special character).
36. The login cannot include white-space characters and/or Polish diacritics).
36. The password should contain at least 4 characters (at least one lowercase letter, one uppercase letter, one number 0-9 and one special character).
37. The password cannot include white-space characters and/or Polish diacritics).
35. There needs to be a procedure of creating, restoring and unlocking an account.
36. There needs to be a procedure of changing the password.
37. The account needs to be blocked after three attempts of entering the wrong password.
38. The server app has be create a backup of the general report.
39. MrBuggy3 must be a portable app in a zip archive. The archive has to include the exe file and all the necessary libraries and resources to run it.
40. The demo app should include one of the two possible tasks/exercises: 
    * A calculator that can only divide. The defect is that it divides by 0 and shows 0 as the result.
    * A function that checks if two rectangles intersect and then showing the information. The defect is a wrong information saying that the rectangles do not intersect when one of them completely covers the other.
46. The defects are scored according to their severity:
    * trivial defects (1-2 points);
    * normal defects (3-4 points);
    * critical defects (4-6 points).
47. The app deducts 2 points for reporting a correct functionality.
