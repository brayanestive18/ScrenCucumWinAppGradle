package com.accenture.ScrenCucumWinAppGradle.runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
		features= "src/test/resources/features/calc.feature", 
		glue = {"com.accenture.ScrenCucumWinAppGradle.step_definitions"}
)
public class Runner {

}
