# language: es

Característica: Validar Horario
  Yo como comensal
  Requiero seleccionar una hora
  Para poder agendar la reserva

  @manual
  @manual-result:passed
  @manual-last-tested:Sprint-1
  @manual-test-evidence:[Horarios_Inhabilitados]
  Escenario: Mostrar el formulario de la fecha no disponible
    Dado que me encuentro en el formulario de la reserva
    Cuando selecciono una fecha
    Entonces los horarios no disponibles estaran desabilitados

  @manual
  @manual-result:passed
  @manual-last-tested:Sprint-1
  @manual-test-evidence:[Horario_Inhabilitado_En_Proceso]
  Escenario: Mostrar el formulario de la fecha inhabilitado para demas usuarios
    Dado que me encuentro en el formulario de la reserva
    Cuando selecciono el horario de la reserva
    Entonces el horario seleccionado no estara disponible para los demas usuarios