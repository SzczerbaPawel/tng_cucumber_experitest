package StepDefs;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class FirstStepDef {

    @Given("step1")
    public void step1(){
        System.out.println("Step1");
    }

    @When("step2")
    public void step2(){
        System.out.println("Step2");
    }

    @Then("step3")
    public void step3(){
        System.out.println("Step3");
    }
}
