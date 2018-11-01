package com.accenture.ScrenCucumWinAppGradle.questions;

import com.accenture.ScrenCucumWinAppGradle.ui.Numbers;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class Questions implements Question<String> {

	@Override
	public String answeredBy(Actor actor) {
		// TODO Auto-generated method stub
		
		return Text.of(Numbers.RES).viewedBy(actor).asString();
	}
	
	public static Questions is() {
		// TODO Auto-generated method stub
		return new Questions();
	}

	

}
