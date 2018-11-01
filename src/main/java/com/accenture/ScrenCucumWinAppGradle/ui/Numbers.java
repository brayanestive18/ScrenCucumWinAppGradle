package com.accenture.ScrenCucumWinAppGradle.ui;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class Numbers extends PageObject {
	public static Target BOTON_1 = Target.the("Botón 1").located(By.name("Uno"));
	public static Target BOTON_MAS = Target.the("Botón Más").located(By.name("Más"));
	public static Target BOTON_IGUAL = Target.the("Botón igual a").located(By.name("Es igual a"));
	public static Target RES = Target.the("Resultado es 2").located(By.name("Se muestra 2"));
}
