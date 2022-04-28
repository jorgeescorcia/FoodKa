package stepsdefinition;

import com.github.javafaker.Faker;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import setup.Setup;

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static task.landingpage.OpenLandingPage.openLandingPage;
import static task.landingpage.foodka.CrearNuevaReserva.crearNuevaReserva;
import static task.landingpage.foodka.NavergaAFoodka.navegaraFoodka;


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
                        .Telefono(faker.phoneNumber().cellPhone())
                        .Mensaje(faker.lorem().characters())
        );

    }

    @Entonces("debo observar que la reserva se ha creado satisfactoriamente")
    public void debo_observar_que_la_reserva_se_ha_creado_satisfactoriamente() {


    }

    @Dado("Que me encuentro en el modulo de reserva")
    public void que_me_encuentro_en_el_modulo_de_reserva() {

    }

    @Cuando("no lleno informacion en campos obligatorios")
    public void no_lleno_informacion_en_campos_obligatorios() {

    }

    @Entonces("debo observar que la reserva no ha sido guardada")
    public void debo_observar_que_la_reserva_no_ha_sido_guardada() {

    }
}
