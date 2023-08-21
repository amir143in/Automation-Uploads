Feature: Varios transacciones user

  Background: 
    * url 'https://petstore.swagger.io/'
    * header Accept = 'application/json'
    * header Content-Type = 'application/json'
    And def requestBodyCrearUsuario = read("../../data/dataPostCrearUsuario.json")
    And def requestBodyActaulizarUsuario = read("../../data/dataPUTActualizarNombreyCorreo.json")

  Scenario: Crear nuevo usuario
    Given path 'v2/user'
    And request requestBodyCrearUsuario
    When method POST
    Then status 200
    And print response
    * print 'El usuario ya fue creado exitosamente...'

  Scenario: Buscar el usuario creado
    * def query = requestBodyCrearUsuario.username
    * print query
    Given path 'v2/user/', query
    When method GET
    Then status 200
    And print response.username
    And match response.username == query
    * print 'El usuario ' + query + ' fue buscado exitosamente'

  Scenario: Actualizar el nombre y el correo del usuario
    * def query = requestBodyActaulizarUsuario.username
    * print query
    Given path 'v2/user/', query
    And request requestBodyActaulizarUsuario
    When method PUT
    Then status 200
    And print response
    * print 'El usuario ' + query + ' actualizo exitosamente'

  Scenario: Buscar el usuario actualizado
    * def query = requestBodyActaulizarUsuario.username
    * print query
    Given path 'v2/user/', query
    When method GET
    Then status 200
    And print response.username
    And match response.username == query
    * print 'El usuario ' + query + ' fue buscado exitosamente'

  Scenario: Eliminar el usuario
    * def query = requestBodyActaulizarUsuario.username
    * print query
    Given path 'v2/user/', query
    When method DELETE
    Then status 200
    * print 'El usuario ' + query + 'fue eliminado...'
