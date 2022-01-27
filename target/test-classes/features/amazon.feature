

Feature: US_1001_amazon

    Background: Sayfaya gider
    Given kullanici amazon sayfasina gider

  Scenario: Amazon Search Feature

      And iPhone icin arama yapar
      Then sonuclarin Iphone icerdigini test eder

      And tea pot icin arama yapar
      Then sonuclarin tea pot icerdigini test eder

      And flower icin arama yapar
      Then sonuclarin flower icerdigini test eder

    And sayfayi kapatır