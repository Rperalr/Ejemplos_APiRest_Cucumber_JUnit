Feature: Consumo de API POST

  Scenario: Escenario exitoso de creación de usuario
    Given la API está disponible
    When envío una solicitud POST con datos válidos
    Then la respuesta debe tener código 201
    And el cuerpo de la respuesta debe contener el nombre "Juan"
