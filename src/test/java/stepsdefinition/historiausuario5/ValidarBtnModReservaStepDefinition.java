package stepsdefinition.historiausuario5;

import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;

public class ValidarBtnModReservaStepDefinition {
    @Dado("que ingreso un codigo de reserva valido")
    public void queIngresoUnCodigoDeReservaValido() {
    }

    @Cuando("estoy dentro del rango del tiempo permitido y doy clic en modificar reserva")
    public void estoyDentroDelRangoDelTiempoPermitidoYDoyClicEnModificarReserva() {
    }

    @Entonces("se debe permitir modificar la reserva")
    public void seDebePermitirModificarLaReserva() {
    }

    @Cuando("estoy fuera del rango del tiempo permitido y doy clic en modificar reserva")
    public void estoyFueraDelRangoDelTiempoPermitidoYDoyClicEnModificarReserva() {
    }

    @Entonces("se debe mostrar mensaje de advertencia")
    public void seDebeMostrarMensajeDeAdvertencia() {
    }
}
