package userinterface.foodka;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class ConsultaReserva extends PageObject {

    public static final Target BTN_MIS_RESERVAS = Target
            .the("BtnMisReservas")
            .located(By.xpath("//body/div[@id='root']/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/button[1]"));


    public static final Target INPUT_MIS_RESERVAS = Target
            .the("InputMisReservas")
            .located(By.xpath("//input[@id=':r2:']"));

    public static final Target BTN_BUSCAR = Target
            .the("BtnBuscar")
            .located(By.xpath("//body/div[2]/div[3]/div[1]/div[1]/div[1]/button[2]"));

    public static final Target BTN_MODIFICAR_RESERVA = Target
            .the("BtnBuscar")
            .located(By.xpath("//body/div[2]/div[3]/div[1]/div[1]/div[1]/form[1]/div[1]/button[1]"));

    public static final Target TEXT_AREA_NUEVO_PEDIDO = Target
            .the("TextNuevoPedido")
            .located(By.xpath("//textarea[@id='customersurname-disabled']"));

    public static final Target BTN_GUARDAR_MODIFICACION = Target
            .the("Btn")
            .located(By.xpath("//body/div[2]/div[3]/div[1]/div[1]/div[1]/div[2]/button[1]"));


    ////body/div[2]/div[3]/div[1]/div[1]/div[1]/div[2]/button[1]


}
