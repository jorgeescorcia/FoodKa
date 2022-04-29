# language: es
Característica: Validar boton Cancelar Reserva
  Yo como comensal
  Requiero que exista un botón de Mis reservas
  Para poder cancelar mi reserva

  Antecedentes: Codigo existente
    Dado que ingreso un codigo de reserva valido para poder cancelar

  @manual
  @manual-result:passed
  @manual-last-tested:Sprint-1
  @manual-test-evidence:[Cancelacion_En_Tiempo]
  Escenario: Validar que se pueda cancelar reserva
    Cuando estoy dentro del rango del tiempo permitido y doy clic en cancelar reserva
    Entonces se debe permitir cancelar la reserva

  @manual
  @manual-result:passed
  @manual-last-tested:Sprint-1
  @manual-test-evidence:[Cancelacion_Fuera_Tiempo]
  Escenario: Validar que no se pueda cancelar reserva
    Cuando estoy fuera del rango del tiempo permitido y doy clic en cancelar reserva
    Entonces se debe mostrar mensaje de advertencia de que no se pudo cancelar