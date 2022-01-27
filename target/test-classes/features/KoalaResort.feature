@login_negative
Feature: US1009 Ck Hotels Login

  Scenario Outline: TC11 kullanici gecerli bilgilerle giris yapar

    Given Go to "koalaResortUrl" page
    Then Click to gelismis
    And Click to adresslink
    And Click to Login
    And Enter the "<wrong usurname>" usurname
    Then Enter the "<wrong pasword>" password
    Then Click to LoginButton
    And Test the login unsuccess
    And sayfayi kapatır

    Examples:
    |wrong usurname|wrong pasword|
  |Manager5|Manager5!|
  |Manager6|Manager6!|
  |Manager7|Manager7!|
  |Manager8|Manager8!|
  |Manager9|Manager9!|