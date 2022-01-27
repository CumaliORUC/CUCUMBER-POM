
@wip
  Feature: Yandex Multiple Search

    Scenario Outline: Yandex multi search

      Given Go to yandex web page
      And Search "<items>"
      And test the "<items>" at results
      Then sayfayi kapatır

      Examples:
        |items|
        |Nutella|
        |milk|
        |tomatoes|
        |popcorn|

