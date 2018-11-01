package com.accenture.ScrenCucumWinAppGradle.step_definitions;

import java.net.MalformedURLException;
import java.net.URL;

import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import com.accenture.ScrenCucumWinAppGradle.questions.Questions;
import com.accenture.ScrenCucumWinAppGradle.task.Add;


import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.appium.java_client.windows.WindowsDriver;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.thucydides.core.annotations.Managed;
import static net.serenitybdd.screenplay.GivenWhenThen.*;
import static org.hamcrest.CoreMatchers.equalTo;
public class StepsD {
Actor daniel = Actor.named("Daniel");
	
	@Managed(driver = "appium")
    public WebDriver driver;	

	
	@Given("^que un usuario quiere realizar una adicion en la calculadora de Windows$")
    public void que_un_usuario_quiere_realizar_una_adicion_en_la_calculadora_de_windows() throws Throwable {
		DesiredCapabilities capabilities = new DesiredCapabilities();
	    capabilities.setCapability("app", "Microsoft.WindowsCalculator_8wekyb3d8bbwe!App");
	    driver = new WindowsDriver(new URL("http://127.0.0.1:4723"), capabilities);
		daniel.can(BrowseTheWeb.with(driver));
    }

    @When("^realiza la suma de 1 mas 1$")
    public void realiza_la_suma_de_1_mas_1() throws Throwable {
        daniel.attemptsTo(Add.theApp());
    }

    @Then("^el usuario espera ver (.*) como resultado$")
    public void el_usuario_espera_ver_2_como_resultado(String num) throws Throwable {        
    	daniel.should(seeThat(Questions.is(), equalTo(num)));
    }
}
