package util.foodka;

import org.openqa.selenium.By;

public class Mensaje {
    public static By MessageReserva = By.xpath("//h4[contains(text(),'Reserva')]");
    public static By MessageConsultaReservaFallido = By.xpath("//div[contains(text(),'No hay reservaciones con este código')]");
    public static By MessageReservaExitosa = By.xpath("//div[contains(text(),'Reserva exitosa revise su correo para ver su codig')]");
    public static By MessageHoraReservaFallida = By.xpath("//div[contains(text(),'Seleccione una Hora por favor')]");
    public static By MessageReservaActualizada = By.xpath("//div[contains(text(),'Reserva actualizada con exito')]");

}
