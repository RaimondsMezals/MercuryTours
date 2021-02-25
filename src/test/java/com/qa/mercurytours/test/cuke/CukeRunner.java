package com.qa.mercurytours.test.cuke;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/test/resources/cuke",
		glue = "com.qa.mercurytours.test.cuke.stepdefs")
public class CukeRunner {

}
