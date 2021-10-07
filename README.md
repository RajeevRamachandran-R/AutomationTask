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
    1. The scenario 2 and 3 can be tested as the part of first one
    2. We can Create resusables for the common/gentric actions

2.	If this test was part of a much larger test set, how would you speed it up?
    Ans: 
    1. We can use parallel execution for speed up.
    2. Reuse this test, and also create reusables from this code
  
3.	Sometimes UI tests can fail unpredictably. For example, the page may not have fully loaded before test automation attempts to click a button on a webpage. How would you improve reliability of these tests?
    Ans: 
    1. The UI tests can fail unpredictably is mainly because of time issue, so i can add implicit and explicit wait for wait for element/action
