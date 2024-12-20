package com.co.prueba.tasks;

import com.co.prueba.userinterfaces.ReniecPage;
import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.JavaScriptClick;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class Navega implements Task {



    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                JavaScriptClick.on(ReniecPage.BTN_PERUANOS),
                WaitUntil.the(ReniecPage.TXT_TITULO, isVisible()).forNoMoreThan(10).seconds(),
                JavaScriptClick.on(ReniecPage.BTN_CONSULADOS),
                WaitUntil.the(ReniecPage.BTN_LISTA, isVisible()).forNoMoreThan(10).seconds(),
                JavaScriptClick.on(ReniecPage.BTN_LISTA)
        );
    }

    public static Navega onSiteReniec(){
        return Instrumented.instanceOf(Navega.class).newInstance();
    }
}
