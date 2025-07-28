Feature:  Prueba de  creación  de  usuario vía  API  POST

          Scenario:  Crear un  nuevo  usuario  exitosamente
            Given  se  prepara  la solicitud  para  crear  un usuario
            When  se  envía la  solicitud  POST  al endpoint  de  creación
            Then la  respuesta  debe  tener código  201
            And  el cuerpo  de  respuesta  debe contener  el  nombre  del usuario