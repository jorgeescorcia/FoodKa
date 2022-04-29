# language: es
Característica: Validar boton Modificar Reserva
  Yo como comensal
  Requiero que exista un botón de  Mis reservas
  Para poder modificar mi reserva

  Antecedentes: Codigo existente
    Dado que ingreso un codigo de reserva valido

  @manual
  @manual-result:passed
  @manual-last-tested:Sprint-1
  @manual-test-evidence:[Modificacion_En_Tiempo]https://drive.google.com/drive/folders/1kcO8IMXSXUudsh7g9aQ_uBp-SlUkMgub?usp=sharing
  Escenario: Validar que se pueda modificar reserva
  Cuando estoy dentro del rango del tiempo permitido y doy clic en modificar reserva
  Entonces se debe permitir modificar la reserva

  @manual
  @manual-result:passed
  @manual-last-tested:Sprint-1
  @manual-test-evidence:[Modificacion_Fuera_Tiempo]https://drive.google.com/drive/folders/1b5kGMy1XMD5A6RYA2BzOz2csbG5vOh9O?usp=sharing
  Escenario: Validar que no se pueda modificar reserva
    Cuando estoy fuera del rango del tiempo permitido y doy clic en modificar reserva
    Entonces se debe mostrar mensaje de advertencia