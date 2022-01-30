@table
Feature: DataTable
  
  Scenario: Data_Table
    When Go to "dataTale_url" page

    Then Click to new icon
    And Fill up all infos
    And Click to Create
    When Search entered first name
    Then Test the first name created
    And sayfayi kapatır
