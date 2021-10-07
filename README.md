Run:
Run the runner file using Run as Junit from src/test/java/runner. 

Report:
Reports are under target/cucumber-reports folder

TestCase Status:
TestCase 1 and 3 got failed bacause acceptance criteria.
TestCase 1 : Calculated amount differs from expected amount
TestCase 3  : Actual Message differs from expected Message


Questions

1.	What other tests would you suggest could be written? You do not need to write them out in detail or code them.
    Ans: 
    1. Below listed some scenario that we can write also:
        1. Validate Elements In Home page
        2. Verify Fields are displaying
        3. Check the Mandatory Fields
        4. Check with negative scenarios for filling Form
        5. validation of tabs in Home page
        6. Navigation Between tabs
        7. validation of Links in Home page
        8. Verification of Login
        9. Verification of Search Operation
        10. Automation of Repayments Calculator functionality
        11. validation and verification for Request contact functionality
        12. validation of "Your questions answered" functionality
        13.  validation and verification for "Contact us or apply" functionality
        14.  validation of "Important information" Message
        15.  validation of "Connect with us" and "Download our new app" functionality
    2. We can Create resusables for the common/gentric actions

2.	If this test was part of a much larger test set, how would you speed it up?
    Ans: 
    1. We can use parallel execution for speed up.
    2. Reuse this test, and also create reusables from this code
  
3.	Sometimes UI tests can fail unpredictably. For example, the page may not have fully loaded before test automation attempts to click a button on a webpage. How would you improve reliability of these tests?
    Ans: 
    1. The UI tests can fail unpredictably is mainly because of time issue, so i can add implicit and explicit wait for wait for element/action
