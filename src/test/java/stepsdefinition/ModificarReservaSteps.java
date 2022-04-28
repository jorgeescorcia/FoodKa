package stepsdefinition;

import com.github.javafaker.Faker;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import setup.Setup;
import util.foodka.ResumenRegister;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static org.hamcrest.core.IsEqual.equalTo;
import static task.landingpage.OpenLandingPage.openLandingPage;
import static task.landingpage.foodka.ModificarReserva.modificarReserva;
import static task.landingpage.foodka.NavergaAFoodka.navegaraFoodka;
import static task.landingpage.foodka.ProbarModuloReserva.probarModuloReserva;

public class ModificarReservaSteps extends Setup {
    Faker faker = new Faker();
    private static final String ACTOR_NAME = "Student";

    @Dado("que el comensal desea realizar una modificacion")
    public void que_el_comensal_desea_realizar_una_modificacion() {
        actorSetupTheBrowser(ACTOR_NAME);
        theActorInTheSpotlight().wasAbleTo(
                openLandingPage(),
                navegaraFoodka()

        );

    }

    @Cuando("se realice la modificacion en la reserva")
    public void se_realice_la_modificacion_en_la_reserva() {
        theActorInTheSpotlight().wasAbleTo(
                modificarReserva()
                        .InputMisReservas("86ae5c8d-d")
                        .InputNuevoPedido(faker.lorem().characters())


        );

    }

    @Entonces("Se debe visualizar un mensaje Modificacion de reserva exitosa")
    public void se_debe_visualizar_un_mensaje_Modificacion_de_reserva_exitosa() {
        theActorInTheSpotlight().should(
                seeThat( "el mensaje de modificación exitosa ", ResumenRegister.MessageReservaActualizada() , equalTo("Reserva actualizada con exito"))
        );

    }

}
