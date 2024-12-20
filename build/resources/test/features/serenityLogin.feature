Feature: Navegar en Reniec


  @pruebaIQ
  Scenario Outline: Probar búsqueda de Consulados
    Given el usuario se encuentra en la pagina de Reniec
    When ingreso a la opción Peruanos en el Extranjero, despliego la opción Consulados en el mundo e ingreso a la opción Lista de Consulados en el mundo
    And se abre una nueva pestaña, ingreso a ella, y realizo la busqueda de la palabra "<oficina>"
    Then valido que regrese a la pagina principal y se muestre el "<titulo>"
    Examples:
      | titulo   | oficina |
      | Peruanos en el extranjero | cuenca  |
