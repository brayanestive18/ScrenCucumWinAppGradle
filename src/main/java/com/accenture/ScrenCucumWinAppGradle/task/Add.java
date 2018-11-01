package com.accenture.ScrenCucumWinAppGradle.task;

import static net.serenitybdd.screenplay.Tasks.instrumented;

import com.accenture.ScrenCucumWinAppGradle.ui.Numbers;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

public class Add implements Task{

	@Override
	public <T extends Actor> void performAs(T actor) {
		// TODO Auto-generated method stub
		actor.attemptsTo(
				Click.on(Numbers.BOTON_1), 
				Click.on(Numbers.BOTON_MAS), 
				Click.on(Numbers.BOTON_1), 
				Click.on(Numbers.BOTON_IGUAL)
				);
		
	}
	
	public static Add theApp() {		
		return instrumented(Add.class);
	}
}
