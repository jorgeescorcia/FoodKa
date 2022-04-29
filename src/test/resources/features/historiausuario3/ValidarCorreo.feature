# language: es

Característica: Validar correo
  Yo como comensal
  Requiero la informacion de la reserva en mi correo
  Para finalizar la reserva

  @manual
  @manual-result:passed
  @manual-last-tested:Sprint-1
  @manual-test-evidence:[Correo_A_Cliente]https://drive.google.com/drive/folders/1C4BYj-CBjGPjIpomnvO4Q4RQmZNFUVxQ?usp=sharing
  Escenario: Validar correo enviado a cliente por creacion de pedido
  Dado que me encuentro en la pagina web
  Cuando finalizo la reserva
  Entonces se me debe enviar un correo con la informacion de la reserva

  @manual
  @manual-result:passed
  @manual-last-tested:Sprint-1
  @manual-test-evidence:[Correo_A_Admin]https://drive.google.com/drive/folders/13heyUTI6YxBQurd-LfuxiiQbEG4q4wWQ?usp=sharing
  Escenario: Validar correo a administrador por creacion de pedido
  Dado que el usuario se encuentra en la pagina web
  Cuando finaliza la reserva
  Entonces debera llegar un correo con la informacion de la reserva