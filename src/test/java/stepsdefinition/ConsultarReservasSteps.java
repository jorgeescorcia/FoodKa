package stepsdefinition;

import com.github.javafaker.Faker;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import task.landingpage.foodka.ProbarModuloReserva;
import util.register.ResumenRegister;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static org.hamcrest.core.IsEqual.equalTo;
import static task.landingpage.OpenLandingPage.openLandingPage;
import static task.landingpage.foodka.NavergaAFoodka.navegaraFoodka;
import static task.landingpage.foodka.ProbarModuloReserva.probarModuloReserva;


public class ConsultarReservasSteps extends Setup{
    Faker faker = new Faker();
    private static final String ACTOR_NAME = "Student";

    @Dado("Que me encuentro en el modulo de consultar reserva")
    public void que_me_encuentro_en_el_modulo_de_consultar_reserva() {
        actorSetupTheBrowser(ACTOR_NAME);
        theActorInTheSpotlight().wasAbleTo(
                openLandingPage(),
                navegaraFoodka()

        );

    }

    @Cuando("ingreso el codigo de la reserva en el campos correspondiente")
    public void ingreso_el_codigo_de_la_reserva_en_el_campos_correspondiente() {
        theActorInTheSpotlight().wasAbleTo(
                probarModuloReserva()
                .InputMisReservas("86ae5c8d-d")


        );

    }

    @Entonces("se consulte y se visualice la informacion de la reserva")
    public void se_consulte_y_se_visualice_la_informacion_de_la_reserva() {
        theActorInTheSpotlight().should(
                seeThat( "el mensaje de reserva es ", ResumenRegister.MessageReserva() , equalTo("Reserva"))
        );

    }

    @Dado("Que me encuentro en la opcion de consultar reserva")
    public void que_me_encuentro_en_la_opcion_de_consultar_reserva() {
        actorSetupTheBrowser(ACTOR_NAME);
        theActorInTheSpotlight().wasAbleTo(
                openLandingPage(),
                navegaraFoodka()

        );

    }

    @Cuando("ingreso el codigo incorrecto")
    public void ingreso_el_codigo_incorrecto() {

        theActorInTheSpotlight().wasAbleTo(
                probarModuloReserva()
                        .InputMisReservas(faker.number().digit())


        );

    }

    @Entonces("debo observar un mensaje que me indique que no se pudo consultar la reserva")
    public void debo_observar_un_mensaje_que_me_indique_que_no_se_pudo_consultar_la_reserva() {

        theActorInTheSpotlight().should(
                seeThat( "el mensaje de reserva fallido es ", ResumenRegister.MessageReservaFallida() , equalTo("No hay reservaciones con este código"))
        );
    }
}
