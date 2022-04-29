# new feature
# Tags: optional
# language: es

Característica: Funcionalidad formulario reserva
  Yo como comensal
  Requiero seleccionar una fecha
  Para poder agendar la reserva

  @manual
  @manual-result:passed
  @manual-last-tested:Sprint-1
  @manual-test-evidence:[Formulario_Reserva]https://drive.google.com/drive/folders/1UaEMVDVRI4zS4OBNcsAeN3Wax4oj69Lr?usp=sharing
  Escenario:  Validar formulario de reserva
    Dado que me encuentro en la pagina web
    Cuando presiono el boton reservas
    Entonces observo el formulario para hacer la reserva

  @manual
  @manual-result:passed
  @manual-last-tested:Sprint-1
  @manual-test-evidence:[Calendario]https://drive.google.com/drive/folders/1Xiv8CvBiXnwF8sUM7Q9Yr4BQkl8riG7W?usp=sharing
  Escenario: Validar formulario fecha reserva
    Dado que me encuentro en el formulario de la reserva
    Cuando presion el icono del calendario
    Entonces debo observar el calendario para seleccionar la fecha de reserva

  @manual
  @manual-result:passed
  @manual-last-tested:Sprint-1
  @manual-test-evidence:[Horarios]https://drive.google.com/drive/folders/11gVlY0paWfSm_2_RZ6b56G6otlRfznfK?usp=sharing
  Escenario:  Mostrar horarios de la fecha asignada
    Cuando selecciono la fecha en el formulario de la reserva
    Entonces debo observar los horarios disponibles para esa fecha