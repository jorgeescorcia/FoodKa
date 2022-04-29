# language: es

Característica: Validar boton Mis Reservas
  Yo como comensal
  Requiero que exista un botón de  Mis reservas
  Para poder revisar mi reserva

  @manual
  @manual-result:passed
  @manual-last-tested:Sprint-1
  @manual-test-evidence:[Boton_Mis_Reservas]https://drive.google.com/drive/folders/1v9gCyJswNzNp0X7-7FNBMCOPWfyYSZo8?usp=sharing
  Escenario: Mostrar el boton  mis reservas
    Cuando me encuentro en la pagina web
    Entonces debo observar el boton de Mis reservas

  @manual
  @manual-result:passed
  @manual-last-tested:Sprint-1
  @manual-test-evidence:[Ventana_Buscar_Reserva]https://drive.google.com/drive/folders/1GAtjzQrYsm6IFmziD-xhRGBITJ8kuB3m?usp=sharing
  Escenario: Mostrar el campo codigo de reserva
    Dado que me encuentro en la pagina web
    Cuando doy clic en el boton mis reservas
    Entonces observo el campo de ingreso del codigo de reserva

  @manual
  @manual-result:passed
  @manual-last-tested:Sprint-1
  @manual-test-evidence:[Ver_Modificar_Reserva]https://drive.google.com/drive/folders/1WITVMWhe4VQd0fTQEs79NhKkQ_NXp9c3?usp=sharing
  Escenario: Mostrar boton Modificar reserva
    Dado que ingreso el codigo de la reserva
    Cuando valido la existencia de mi reserva
    Entonces se debe visualizar el boton de Modificar reserva y su estilo con naranja #F0950E

  @manual
  @manual-result:passed
  @manual-last-tested:Sprint-1
  @manual-test-evidence:[Ver_Cancelar_Reserva]https://drive.google.com/drive/folders/19Th_iatRbZjBGLMGufPtG6j2-g6RWLq3?usp=sharing
  Escenario: Mostrar boton Cancelar reserva
    Dado que ingreso un codigo de reserva
    Cuando valido la existencia de mi reserva
    Entonces se debe visualizar el boton de Cancelar reserva y su estilo con naranja #F0950E