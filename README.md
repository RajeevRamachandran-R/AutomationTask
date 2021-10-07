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
    1. We can Create resusables for the common/gentric actions
    2. We can test the other scenarios in first one.
    3. We can Add Logging and extent report generation
2.	If this test was part of a much larger test set, how would you speed it up?
    Ans: 
    1. Reuse this test, and create reusables from this code
    2. Code already written that i can modify to work for larger test set.
  
4.	Sometimes UI tests can fail unpredictably. For example, the page may not have fully loaded before test automation attempts to click a button on a webpage. How would you improve reliability of these tests?
    Ans: 
    1. The UI tests can fail unpredictably is mainly because of time issue, so i can add implicit and explicit wait for wait for element/action
