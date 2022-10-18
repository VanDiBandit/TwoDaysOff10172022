-Notes For Testing

JUNIT 5 is the newest Unit Testing
Benefits of Unit Testing
-Test is trying to confirm that the small unit of code is working correctly
-Unit can target code in several different classes at once
-those tests are called Component tests
-The test code obtains results of target code and confirms that those results are correct
-checking to see if the code is doing what it's supposed to do

-Benefits of Unit Testing
*Quick Feedback
*Automated Regression checking - we can run all the test over time before we deploy the program to users
*Design Aid - allow us to see if the way the target code us called is clear and understandable
*Improves confidence - Validating that the pieces work correctly improves your confidence as a programmer
*Documentation - they can open the unit test and find out what the code is used for

-JUNIT 5 needs at least Java 8 to function
-Can check the details as to why the test failed
-If you use assertEquals to compare collections JUnit will check that the two collections contain equivalent objects

-@BeforeAll will run once before all test methods in the class
-@BeforeEach will run once before EACH test METHOD
-@AfterEach will run once AFTER each test method
-@AfterAll will run after all test methods in the class

JUNIT provides a way to write a custom message
All JUNIT assertions lets you add a message

