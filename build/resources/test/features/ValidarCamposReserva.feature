# language: es
Característica: Validacion de campos del formulario
  Yo como comensal
  Requiero diligenciar un formulario con mi pedido
  Para poder ordenar los platos que deseo

  Escenario:  validar campos obligatorios completos
    Dado Que me encuentro en la opcion de reserva
    Cuando lleno la informacion en los campos obligatorios y doy click en el boton Guardar reserva
    Entonces debo observar que la reserva se ha creado satisfactoriamente

  Escenario:  hora no seleccionada
    Dado Que me encuentro en el modulo de reserva
    Cuando no selecciono una hora
    Entonces debo observar el mensaje que la hora no a sido seleccionada