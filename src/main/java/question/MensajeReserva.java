package question;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import util.foodka.Mensaje;

public class MensajeReserva implements Question {

    public static Question <String> valorMensaje(){
        return new MensajeReserva();
    }

    @Override
    public Object answeredBy(Actor actor) {
        return BrowseTheWeb.as(actor).find(Mensaje.MessageReserva).getText();
    }
}
