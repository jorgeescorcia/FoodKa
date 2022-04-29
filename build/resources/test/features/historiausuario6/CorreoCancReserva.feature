# language: es

Característica: Validar correo de modificacion de reserva
  Yo como comensal
  Requiero la informacion de la reserva modificada en mi correo
  Para finalizar la reserva

  @manual
  @manual-result:passed
  @manual-last-tested:Sprint-1
  @manual-test-evidence:[Correo_Cancelacion_Cliente]https://drive.google.com/drive/folders/1n-7kTtbisqRK8W9kGGziNqy786AavudY?usp=sharing
  Escenario: Validar correo de cancelacion para cliente
    Dado que me encuentro en la pagina web
    Cuando cancelo la reserva
    Entonces se me debe enviar un correo de aviso de reserva cancelada

  @manual
  @manual-result:passed
  @manual-last-tested:Sprint-1
  @manual-test-evidence:[Correo_Cancelacion_Admin]https://drive.google.com/drive/folders/115_S5PTkdpAK_pOyTm-Hw-ODfaIe3sMc?usp=sharing
  Escenario: Validar correo de cancelacion para administrador
    Dado que el usuario se encuentra en la pagina web
    Cuando cancela la reserva
    Entonces debera llegar un correo notificando que se cancelo una reserva