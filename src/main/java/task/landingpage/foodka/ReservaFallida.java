package task.landingpage.foodka;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;

import static userinterface.foodka.CrearReserva.*;
import static userinterface.foodka.CrearReserva.BTN_NEXT_CALENDARIO;

public class ReservaFallida implements Task {



    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(


                Scroll.to(BTN_CREAR_RESERVA),
                Click.on(BTN_CREAR_RESERVA),

                Scroll.to(BTN_CALENDARIO),
                Click.on(BTN_CALENDARIO),

                Scroll.to(BTN_DIA_FECHA),
                Click.on(BTN_DIA_FECHA),

                Scroll.to(BTN_NEXT_CALENDARIO),
                Click.on(BTN_NEXT_CALENDARIO),




                Scroll.to(BTN_NEXT_HORA),
                Click.on(BTN_NEXT_HORA)

        );
    }
    public static ReservaFallida reservaFallida(){
        return new ReservaFallida();
    }
}
