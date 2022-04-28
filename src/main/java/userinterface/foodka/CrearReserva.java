package userinterface.foodka;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class CrearReserva extends PageObject {

    public static final Target BTN_CREAR_RESERVA = Target
            .the("BtnCrearReserva")
            .located(By.xpath("//body/div[@id='root']/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/button[1]"));

    public static final Target BTN_CALENDARIO = Target
            .the("BtnCalendario")
            .located(By.xpath("//header/div[1]/form[1]/div[2]/div[1]/div[1]/button[1]/*[1]"));

    public static final Target BTN_DIA_FECHA = Target
            .the("BtnDiaFecha")
            .located(By.xpath("//body/div[3]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[5]/div[5]/button[1]"));

    public static final Target BTN_NEXT_CALENDARIO = Target
            .the("BtnNext")
            .located(By.xpath("//header/div[1]/form[1]/div[3]/button[1]"));

    public static final Target RADIO_BUTTON_HORA = Target
            .the("RadioButton")
            .located(By.xpath("//span[contains(text(),'16:00')]"));

    public static final Target BTN_NEXT_HORA = Target
            .the("BtnNextHora")
            .located(By.xpath("//header/div[1]/form[1]/div[3]/button[2]"));

    public static final Target NOMBRE = Target
            .the("Nombre")
            .located(By.xpath("//input[@id=':r4:']"));

    public static final Target APELLIDO = Target
            .the("Apellido")
            .located(By.xpath("//input[@id=':r5:']"));

    public static final Target EMAIL = Target
            .the("Email")
            .located(By.xpath("//input[@id=':r6:']"));

    public static final Target TELEFONO = Target
            .the("Telefono")
            .located(By.xpath("//input[@id=':r7:']"));

    public static final Target BTN_NEXT_CONTACTO = Target
            .the("BtnNextContacto")
            .located(By.xpath("//header/div[1]/form[1]/div[6]/button[2]"));

    public static final Target MENSAJE_PEDIDO = Target
            .the("MensajePedido")
            .located(By.xpath("//textarea[1]"));

    public static final Target BTN_SUBMIT = Target
            .the("BtnNextContacto")
            .located(By.xpath("//header/div[1]/form[1]/div[4]/button[2]"));








}
