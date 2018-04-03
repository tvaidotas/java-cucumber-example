package com.qa.example;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import static org.junit.Assert.assertEquals;

public class CalculatorSteps {

    private Calculator calculator;
    private int additionNumber;

    @Given("^A calculator$")
    public void createCalculator(){
        calculator = new Calculator();
    }

    @When("^I use the addition functionality for numbers 5 and 5$")
    public void addTwoNumbers(){
        additionNumber = calculator.addition(5,5);
    }

    @Then("^the result will be 10$")
    public void numberEquals(){
        assertEquals(additionNumber, 10);
    }

}
