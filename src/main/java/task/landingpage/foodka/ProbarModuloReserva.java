package task.landingpage.foodka;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Scroll;


import static userinterface.foodka.ConsultaReserva.*;


public class ProbarModuloReserva implements Task {


    private String InputMisReservas;

    public ProbarModuloReserva InputMisReservas(String inputMisReservas) {
        InputMisReservas = inputMisReservas;
        return this;
    }



    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Scroll.to(BTN_MIS_RESERVAS),
                Click.on(BTN_MIS_RESERVAS),

                Scroll.to(INPUT_MIS_RESERVAS),
                Enter.theValue(InputMisReservas).into(INPUT_MIS_RESERVAS),

                Click.on(BTN_BUSCAR)
        );
    }
    public static ProbarModuloReserva probarModuloReserva(){
        return new ProbarModuloReserva();
    }
}
