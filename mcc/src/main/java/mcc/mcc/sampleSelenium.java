package mcc.mcc;



/*
 Feature: Test Demoaut application
  This file describes testing demoaut application
 
Scenario: In Firefox open demoaut site
	Given Load the Firefox driver jar
	And Create object and open demoaut portal
	Then Get the date displayed in the screen
	And Enter username in username field
	And Enter password in password field
	Then click login button
	Then Get title of the page in console
 
 */

public class sampleSelenium {
	
		@Given("I enter 50 in the calculator")
		public void I_enter_50_in_the_calculator(){
			System.out.println("I enter 50 in the calculator");
		}
		
		@And("I press add")
		public void I_press_add(){
			System.out.println("I press add");
		}
		
		@And("I have entered 50 in the calculator")
		public void I_have_entered_50_in_the_calculator(){
			System.out.println("I have entered 50 in the calculator");
		}
		
		@When("I press equal symbol")
		public void I_press_equals(){
			System.out.println("I press equal symbol");
		}
		
		@Then("The result should be 100 on the screen")
		public void The_result_should_be_100_on_the_screen(){
			System.out.println("The result should be 100 on the screen");
		}

} 

