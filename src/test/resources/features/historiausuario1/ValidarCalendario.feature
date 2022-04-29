#language: es
  Característica: Validar calendario
    Yo como comensal
    Requiero seleccionar una fecha
    Para poder agendar la reserva

    @manual
    @manual-result:passed
    @manual-last-tested:Sprint-1
    @manual-test-evidence:[Radio_Button]https://drive.google.com/drive/folders/1T6l8-O6bBljd4gMfMyX4HEHs8JiAc7pk?usp=sharing
    Escenario: Mostrar el formulario de la fecha
      Dado que me encuentro en el formulario de la reserva
      Cuando selecciono la fecha
      Entonces se debe mostrar los horarios disponibles para esa fecha como radio buttons