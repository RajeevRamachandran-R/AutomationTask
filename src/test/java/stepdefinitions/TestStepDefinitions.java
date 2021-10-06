package stepdefinitions;

import PageMethods.HomePage;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import utilities.CommonUtils;

public class TestStepDefinitions extends CommonUtils{

	HomePage home = new HomePage();

	@Before
	public void browserSetup() {
		getDriver();
	}

	@After
	public void exit() {
		driver.close();
	}

	@Given("user navigate to site")
	public void user_navigate_to_site() {
		home.verifyPageLoaded();
	}

	@And("user fill the below fields")
	public void user_fill_the_below_fields(DataTable dataMap) {
		home.fillingDetails(dataMap);
	}

	@Then("user will verify the eatimated loan Amount with {string}")
	public void user_will_verify_the_eatimated_loan_Amount_with(String string) {
		home.clickAndButtonAndVerifyEstimatedLoanAmount(string);
	}

	@Then("user will verify clicking start over button clear the form")
	public void user_will_verify_clicking_start_over_button_clear_the_form() {
		home.verifyStartOverButtonClearTheForm();
	}

	@Then("user will verify the message after clicking Work out how much I could borrow button")
	public void user_will_verify_the_message_after_clicking_Work_out_how_much_I_could_borrow_button() {
		home.verifyReturnMessage();
	}

}
