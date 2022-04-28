package util.foodka;

import org.openqa.selenium.By;

public class Mensaje {
    public static By MessageReserva = By.xpath("//h4[contains(text(),'Reserva')]");
    public static By MessageConsultaReservaFallido = By.xpath("//div[contains(text(),'No hay reservaciones con este código')]");

}
