# language: es

Característica: Validar boton Mis Reservas
  Yo como comensal
  Requiero que exista un botón de  Mis reservas
  Para poder revisar mi reserva

  @manual
  @manual-result:passed
  @manual-last-tested:Sprint-1
  @manual-test-evidence:[Boton_Mis_Reservas]
  Escenario: Mostrar el boton  mis reservas
    Cuando me encuentro en la pagina web
    Entonces debo observar el boton de "mis reservas"

  @manual
  @manual-result:passed
  @manual-last-tested:Sprint-1
  @manual-test-evidence:[Ventana_Buscar_Reserva]
  Escenario: Mostrar el campo codigo de reserva
    Dado que me encuentro en la pagina web
    Cuando doy clic en el boton mis reservas
    Entonces observo el campo de ingreso del codigo de reserva

  @manual
  @manual-result:passed
  @manual-last-tested:Sprint-1
  @manual-test-evidence:[Ver_Modificar_Reserva]
  Escenario: Mostrar boton Modificar reserva
    Dado que ingreso el codigo de la reserva
    Cuando valido la existencia de mi reserva
    Entonces se debe visualizar el boton de Modificar reserva y su estilo con naranja #F0950E

  @manual
  @manual-result:passed
  @manual-last-tested:Sprint-1
  @manual-test-evidence:[Ver_Cancelar_Reserva]
  Escenario: Mostrar boton Cancelar reserva
    Dado que ingreso un codigo de reserva
    Cuando valido la existencia de mi reserva
    Entonces se debe visualizar el boton de Cancelar reserva y su estilo con naranja #F0950E