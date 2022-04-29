package stepsdefinition.historiausuario6;

import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;

public class ValidarBtnCancReservaStepDefinition {
    @Dado("que ingreso un codigo de reserva valido para poder cancelar")
    public void queIngresoUnCodigoDeReservaValidoParaPoderCancelar() {
    }

    @Cuando("estoy dentro del rango del tiempo permitido y doy clic en cancelar reserva")
    public void estoyDentroDelRangoDelTiempoPermitidoYDoyClicEnCancelarReserva() {
    }

    @Entonces("se debe permitir cancelar la reserva")
    public void seDebePermitirCancelarLaReserva() {
    }

    @Cuando("estoy fuera del rango del tiempo permitido y doy clic en cancelar reserva")
    public void estoyFueraDelRangoDelTiempoPermitidoYDoyClicEnCancelarReserva() {
    }

    @Entonces("se debe mostrar mensaje de advertencia de que no se pudo cancelar")
    public void seDebeMostrarMensajeDeAdvertenciaDeQueNoSePudoCancelar() {
    }

}
