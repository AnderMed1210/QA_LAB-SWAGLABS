Feature: Iniciar Sesión en APP Saucedemo


  @testSaucedemo
  Scenario: Iniciar Sesión
  Given que me encuentro en la APP de Saucedemo
  When selecciono el input username e ingreso la credencial "problem_user"
  And selecciono el input password e ingreso la credencial "secret_sauce"
  And selecciono el boton Login
  Then valido que debería aparecer el título de "PRODUCTS"
  And también valido que al menos exista un item
