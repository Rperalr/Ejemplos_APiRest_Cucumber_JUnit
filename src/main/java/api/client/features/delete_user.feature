Feature: Actualización de usuario

  Scenario: Elemina usuario existente
    Given que tengo un usuario con ID 1
    When elimino el IDuser 1
    Then la respuesta debe regresar usuario 1 eliminado