Feature: Validar url OpenBank

  Scenario Outline: Validar que pueda llegar al enpoint
    Given que el usuario pueda tener acceso a la url "<web>"
    Then la respuesta que se espera es un codigo de "status"

    Examples:
      | web                                   | status |
      | https://www.openbank.es               | 200    |
      | https://www.openbank.es/nohaynada     | 403    |