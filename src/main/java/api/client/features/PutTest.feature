
Feature: Actualización de usuario

  Scenario: Actualizar información de un usuario existente
    Given que tengo un usuario con ID 1
    When actualizo su nombre a "Juan Pérez"
    Then la respuesta debe tener código 20 del usuario