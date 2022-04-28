package task.landingpage.foodka;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Scroll;

import static userinterface.foodka.CrearReserva.*;

public class CrearNuevaReserva implements Task {

    private String Nombre;
    private String Apellido;
    private String Email;
    private String Telefono;
    private String Mensaje;

    public CrearNuevaReserva Nombre(String nombre) {
        Nombre = nombre;
        return this;
    }
    public CrearNuevaReserva Apellido(String apellido) {
        Apellido = apellido;
        return this;
    }
    public CrearNuevaReserva Email(String email) {
        Email = email;
        return this;
    }
    public CrearNuevaReserva Telefono(String telefono) {
        Telefono = telefono;
        return this;
    }
    public CrearNuevaReserva Mensaje(String mensaje) {
        Mensaje = mensaje;
        return this;
    }


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

                Scroll.to(RADIO_BUTTON_HORA),
                Click.on(RADIO_BUTTON_HORA),

                Scroll.to(BTN_NEXT_HORA),
                Click.on(BTN_NEXT_HORA),

                Scroll.to(NOMBRE),
                Enter.theValue(Nombre).into(NOMBRE),

                Scroll.to(APELLIDO),
                Enter.theValue(Apellido).into(APELLIDO),

                Scroll.to(EMAIL),
                Enter.theValue(Email).into(EMAIL),

                Scroll.to(TELEFONO),
                Enter.theValue(Telefono).into(TELEFONO),

                Scroll.to(BTN_NEXT_CONTACTO),
                Click.on(BTN_NEXT_CONTACTO),

                Scroll.to(MENSAJE_PEDIDO),
                Enter.theValue(Mensaje).into(MENSAJE_PEDIDO),

                Scroll.to(BTN_SUBMIT),
                Click.on(BTN_SUBMIT)






        );

    }
    public static CrearNuevaReserva crearNuevaReserva(){
        return new CrearNuevaReserva();
    }
}
