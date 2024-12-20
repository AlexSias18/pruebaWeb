package com.co.prueba.tasks;

import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;

import java.util.ArrayList;


public class SwitchToTab implements Task {
    private int pestaña;

    // Constructor que acepta el valor a ingresar
    public SwitchToTab(int pestaña) {
        this.pestaña = pestaña;
    }
    public static SwitchToTab now(int pestaña) {
        return Instrumented.instanceOf(SwitchToTab.class).withProperties(pestaña);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        var driver = BrowseTheWeb.as(actor).getDriver();
        ArrayList<String> tabs = new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(tabs.get(pestaña)); // Cambiar pestaña por parámetro
    }
}
