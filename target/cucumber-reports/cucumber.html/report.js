$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/UIScenarios.feature");
formatter.feature({
  "name": "UI automation Scenarios",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@AutomationTask"
    }
  ]
});
formatter.scenario({
  "name": "verify that the calculator working with User Input",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@AutomationTask"
    },
    {
      "name": "@Task1"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "user navigate to site",
  "keyword": "Given "
});
formatter.match({
  "location": "TestStepDefinitions.user_navigate_to_site()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user fill the below fields",
  "rows": [
    {
      "cells": [
        "Application type",
        "Number of dependants",
        "Property you would like to buy",
        "Your income (before tax)",
        "Your other income",
        "Living expenses",
        "Current home loan repayments",
        "Other loan repayments",
        "Other commitments",
        "Total credit card limits"
      ]
    },
    {
      "cells": [
        "Single",
        "0",
        "Home to live in",
        "80000",
        "10000",
        "500",
        "0",
        "100",
        "0",
        "10000"
      ]
    }
  ],
  "keyword": "And "
});
formatter.match({
  "location": "TestStepDefinitions.user_fill_the_below_fields(DataTable)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user will verify the eatimated loan Amount with \"$479,000\"",
  "keyword": "Then "
});
formatter.match({
  "location": "TestStepDefinitions.user_will_verify_the_eatimated_loan_Amount_with(String)"
});
formatter.result({
  "error_message": "junit.framework.AssertionFailedError: expected:\u003c479000\u003e but was:\u003c508000\u003e\r\n\tat junit.framework.Assert.fail(Assert.java:57)\r\n\tat junit.framework.Assert.failNotEquals(Assert.java:329)\r\n\tat junit.framework.Assert.assertEquals(Assert.java:78)\r\n\tat junit.framework.Assert.assertEquals(Assert.java:234)\r\n\tat junit.framework.Assert.assertEquals(Assert.java:241)\r\n\tat PageMethods.HomePage.clickAndButtonAndVerifyEstimatedLoanAmount(HomePage.java:75)\r\n\tat stepdefinitions.TestStepDefinitions.user_will_verify_the_eatimated_loan_Amount_with(TestStepDefinitions.java:38)\r\n\tat ✽.user will verify the eatimated loan Amount with \"$479,000\"(file:src/test/resources/features/UIScenarios.feature:10)\r\n",
  "status": "failed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "verify that the calculator working with User Input",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@AutomationTask"
    },
    {
      "name": "@Task2"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "user navigate to site",
  "keyword": "Given "
});
formatter.match({
  "location": "TestStepDefinitions.user_navigate_to_site()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user fill the below fields",
  "rows": [
    {
      "cells": [
        "Application type",
        "Number of dependants",
        "Property you would like to buy",
        "Your income (before tax)",
        "Your other income",
        "Living expenses",
        "Current home loan repayments",
        "Other loan repayments",
        "Other commitments",
        "Total credit card limits"
      ]
    },
    {
      "cells": [
        "Single",
        "0",
        "Home to live in",
        "80000",
        "10000",
        "500",
        "0",
        "100",
        "0",
        "10000"
      ]
    }
  ],
  "keyword": "And "
});
formatter.match({
  "location": "TestStepDefinitions.user_fill_the_below_fields(DataTable)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user will verify clicking start over button clear the form",
  "keyword": "Then "
});
formatter.match({
  "location": "TestStepDefinitions.user_will_verify_clicking_start_over_button_clear_the_form()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "verify that the calculator working with User Input",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@AutomationTask"
    },
    {
      "name": "@Task3"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "user navigate to site",
  "keyword": "Given "
});
formatter.match({
  "location": "TestStepDefinitions.user_navigate_to_site()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user fill the below fields",
  "rows": [
    {
      "cells": [
        "Living expenses"
      ]
    },
    {
      "cells": [
        "1"
      ]
    }
  ],
  "keyword": "And "
});
formatter.match({
  "location": "TestStepDefinitions.user_fill_the_below_fields(DataTable)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user will verify the message after clicking Work out how much I could borrow button",
  "keyword": "Then "
});
formatter.match({
  "location": "TestStepDefinitions.user_will_verify_the_message_after_clicking_Work_out_how_much_I_could_borrow_button()"
});
formatter.result({
  "error_message": "junit.framework.ComparisonFailure: expected:\u003c...ns, call us on 1800 [100 641].\u003e but was:\u003c...ns, call us on 1800 [035 500].\u003e\r\n\tat junit.framework.Assert.assertEquals(Assert.java:100)\r\n\tat junit.framework.Assert.assertEquals(Assert.java:107)\r\n\tat PageMethods.HomePage.verifyReturnMessage(HomePage.java:111)\r\n\tat stepdefinitions.TestStepDefinitions.user_will_verify_the_message_after_clicking_Work_out_how_much_I_could_borrow_button(TestStepDefinitions.java:48)\r\n\tat ✽.user will verify the message after clicking Work out how much I could borrow button(file:src/test/resources/features/UIScenarios.feature:26)\r\n",
  "status": "failed"
});
formatter.after({
  "status": "passed"
});
});