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
import static task.landingpage.foodka.CrearNuevaReserva.crearNuevaReserva;
import static task.landingpage.foodka.NavergaAFoodka.navegaraFoodka;
import static task.landingpage.foodka.ReservaFallida.reservaFallida;


public class ValidarCamposReservaSteps extends Setup {
    Faker faker = new Faker();
    private static final String ACTOR_NAME = "Student";

    @Dado("Que me encuentro en la opcion de reserva")
    public void que_me_encuentro_en_la_opcion_de_reserva() {
        actorSetupTheBrowser(ACTOR_NAME);
        theActorInTheSpotlight().wasAbleTo(
                openLandingPage(),
                navegaraFoodka()

        );

    }

    @Cuando("lleno la informacion en los campos obligatorios y doy click en el boton Guardar reserva")
    public void lleno_la_informacion_en_los_campos_obligatorios_y_doy_click_en_el_boton_Guardar_reserva() {
        theActorInTheSpotlight().wasAbleTo(
                crearNuevaReserva()
                        .Nombre(faker.name().firstName())
                        .Apellido(faker.name().lastName())
                        .Email(faker.internet().emailAddress())
                        .Telefono(faker.number().digits(10))
                        .Mensaje(faker.lorem().characters())
        );

    }

    @Entonces("debo observar que la reserva se ha creado satisfactoriamente")
    public void debo_observar_que_la_reserva_se_ha_creado_satisfactoriamente() {
        theActorInTheSpotlight().should(
                seeThat( "el mensaje de reserva exitosa es ", ResumenRegister.MessageReservaExitosa() , equalTo("Reserva exitosa revise su correo para ver su codigo"))
        );

    }

    @Dado("Que me encuentro en el modulo de reserva")
    public void que_me_encuentro_en_el_modulo_de_reserva() {
        actorSetupTheBrowser(ACTOR_NAME);
        theActorInTheSpotlight().wasAbleTo(
                openLandingPage(),
                navegaraFoodka()

        );


    }

    @Cuando("no selecciono una hora")
    public void no_selecciono_una_hora() {
        theActorInTheSpotlight().wasAbleTo(
                reservaFallida()

        );


    }

    @Entonces("debo observar el mensaje que la hora no a sido seleccionada")
    public void debo_observar_el_mensaje_que_la_hora_no_a_sido_seleccionada() {
        theActorInTheSpotlight().should(
                seeThat( "el mensaje hora no seleccionada ", ResumenRegister.MessageHoraReservaFallida() , equalTo("Seleccione una Hora por favor"))
        );

    }
}
