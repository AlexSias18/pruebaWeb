package com.co.prueba.tasks;

import com.co.prueba.userinterfaces.ConsuladoPage;
import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.JavaScriptClick;
import net.serenitybdd.screenplay.waits.WaitUntil;

public class Buscar implements Task {

    private String oficina;

    // Constructor que acepta el valor a ingresar
    public Buscar(String oficina) {
        this.oficina = oficina;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(ConsuladoPage.TXT_TITLE, isVisible()).forNoMoreThan(10).seconds(),
                Enter.theValue(oficina).into(ConsuladoPage.INPUT_OFICINA),
                JavaScriptClick.on(ConsuladoPage.BTN_SEARCH),
                WaitUntil.the(ConsuladoPage.TXT_RESULTADO, isVisible()).forNoMoreThan(10).seconds()
        );
    }

    // Método para crear la tarea con Instrumented.instanceOf
    public static Buscar elConsulado(String oficina) {
        return Instrumented.instanceOf(Buscar.class).withProperties(oficina);
    }
}
