package com.co.prueba.stepdefinitions;

import com.co.prueba.questions.ValidateText;
import com.co.prueba.tasks.Buscar;
import com.co.prueba.tasks.Navega;
import com.co.prueba.tasks.SwitchToTab;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnStage;

import static com.co.prueba.userinterfaces.ReniecPage.TXT_TITULO;
import static com.co.prueba.utils.GlobalData.*;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.hamcrest.Matchers.containsString;

public class SerenityLoginStepDefinitions {

    @Given("el usuario se encuentra en la pagina de Reniec")
    public void elUsuarioSeEncuentraEnLaPaginaDeReniec() {
        OnStage.theActorCalled(ACTOR).wasAbleTo(Open.url(URL));
    }

    @When("ingreso a la opción Peruanos en el Extranjero, despliego la opción Consulados en el mundo e ingreso a la opción Lista de Consulados en el mundo")
    public void ingresoALaOpciónPeruanosEnElExtranjeroDespliegoLaOpciónConsuladosEnElMundoEIngresoALaOpciónListaDeConsuladosEnElMundo() {
        OnStage.theActorInTheSpotlight().attemptsTo(
                Navega.onSiteReniec()
        );
    }
    @And("se abre una nueva pestaña, ingreso a ella, y realizo la busqueda de la palabra {string}")
    public void seAbreUnaNuevaPestañaIngresoAEllaYRealizoLaBusquedaDeLaPalabra(String oficina) {
        OnStage.theActorInTheSpotlight().attemptsTo(
                SwitchToTab.now(1),
                Buscar.elConsulado(oficina),
                SwitchToTab.now(0)
        );
    }

    @Then("valido que regrese a la pagina principal y se muestre el {string}")
    public void validoQueRegreseALaPaginaPrincipalYSeMuestreEl(String titulo) {
        OnStage.theActorInTheSpotlight().should(seeThat(ValidateText.of(TXT_TITULO), containsString(titulo)));
    }
}
