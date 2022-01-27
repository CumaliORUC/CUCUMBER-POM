@wipp

Feature: US1009 Ck Hotels Login
  Scenario Outline: TC11 User try to wrong usurname_password to Login
    Given Go to "koalaResortUrl" page
    Then Click to gelismis
    And Click to adresslink
    And Click to Login
    And Enter the "<wrong_usurname>" usurname
    Then Enter the "<wrong_pasword>" password
    And Click to LoginButton
    And Test the login unsuccess
    And sayfayi kapatır

   Examples:
    |wrong_usurname|wrong_pasword|
    |wrong_usurname5|wrong_password5|
    |wrong_usurname6|wrong_password6|
    |wrong_usurname7|wrong_password7|
    |wrong_usurname8|wrong_password8|
    |wrong_usurname9|wrong_password9|