package com.co.prueba.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class ReniecPage {

  public static final Target BTN_PERUANOS= Target.the(("Peruanos en el Extranjero"))
          .located(By.xpath("//body[1]/table[2]/tbody[1]/tr[1]/td[1]/table[1]/tbody[1]/tr[1]/td[1]/table[1]/tbody[1]/tr[1]/td[2]/table[1]/tbody[1]/tr[1]/td[1]/table[1]/tbody[1]/tr[20]/td[1]/table[1]/tbody[1]/tr[1]/td[1]/a[1]"));

  public static final Target BTN_CONSULADOS = Target.the("Consulados en el mundo")
          .located(By.xpath("//a[contains(text(),'CONSULADOS EN EL MUNDO')]"));

  public static final Target BTN_LISTA = Target.the("Lista de Consulados en el mundo")
          .located(By.xpath("//a[contains(text(),'Lista de Consulados en el mundo')]"));

  public static final Target TXT_TITULO = Target.the("txt")
          .located(By.xpath("//tbody/tr[1]/td[1]/span[1]"));

}