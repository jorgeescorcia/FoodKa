package util.foodka;

import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.TextContent;

public class ResumenRegister {
    public static Question<String> MessageReserva(){
        return actor -> TextContent.of(Mensaje.MessageReserva).viewedBy(actor).asString().trim();
    }
    public static Question<String> MessageConsultaReservaFallida(){
        return actor -> TextContent.of(Mensaje.MessageConsultaReservaFallido).viewedBy(actor).asString().trim();
    }
    public static Question<String> MessageReservaExitosa(){
        return actor -> TextContent.of(Mensaje.MessageReservaExitosa).viewedBy(actor).asString().trim();
    }
    public static Question<String> MessageHoraReservaFallida(){
        return actor -> TextContent.of(Mensaje.MessageHoraReservaFallida).viewedBy(actor).asString().trim();
    }
    public static Question<String> MessageReservaActualizada(){
        return actor -> TextContent.of(Mensaje.MessageReservaActualizada).viewedBy(actor).asString().trim();
    }

}
