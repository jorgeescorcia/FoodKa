package task.landingpage.foodka;

import net.serenitybdd.screenplay.Actor;

import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Scroll;

import static userinterface.foodka.ConsultaReserva.*;

public class ModificarReserva extends ProbarModuloReserva implements Task {


    private String InputMisReservas;
    private String InputNuevoPedido;

    public ModificarReserva InputMisReservas(String inputMisReservas) {
        InputMisReservas = inputMisReservas;
        return this;
    }
    public ModificarReserva InputNuevoPedido(String inputMisReservas) {
        InputNuevoPedido = inputMisReservas;
        return this;
    }


    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Scroll.to(BTN_MIS_RESERVAS),
                Click.on(BTN_MIS_RESERVAS),

                Scroll.to(INPUT_MIS_RESERVAS),
                Enter.theValue(InputMisReservas).into(INPUT_MIS_RESERVAS),

                Click.on(BTN_BUSCAR),

                Scroll.to(BTN_MODIFICAR_RESERVA),
                Click.on(BTN_MODIFICAR_RESERVA),

                Scroll.to(TEXT_AREA_NUEVO_PEDIDO),
                Enter.theValue(InputNuevoPedido).into(TEXT_AREA_NUEVO_PEDIDO),

                Scroll.to(BTN_GUARDAR_MODIFICACION),
                Click.on(BTN_GUARDAR_MODIFICACION)
        );

    }


    public static ModificarReserva modificarReserva(){
        return new ModificarReserva();
    }
}
