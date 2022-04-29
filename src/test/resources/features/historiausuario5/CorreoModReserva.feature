# language: es

Característica: Validar correo de modificacion de reserva
  Yo como comensal
  Requiero la informacion de la reserva modificada en mi correo
  Para finalizar la reserva

  @manual
  @manual-result:passed
  @manual-last-tested:Sprint-1
  @manual-test-evidence:[Correo_Modificacion_Cliente]
  Escenario: Validar correo de modificacion para cliente
    Dado que me encuentro en la pagina web
    Cuando modifico la reserva
    Entonces se me debe enviar un correo con la informacion de la reserva modificada

  @manual
  @manual-result:passed
  @manual-last-tested:Sprint-1
  @manual-test-evidence:[Correo_Modificacion_Admin]
  Escenario: Validar correo de modificacion para administrador
    Dado que el usuario se encuentra en la pagina web
    Cuando modifica la reserva
    Entonces debera llegar un correo con la actualizacion de la reserva