
@rapor
Feature: Go to Webpages
  Scenario Outline: Visiting webpages

    Given Go to "<page_url>" page

    Examples:

    |page_url|
    |amazon_url|
    |yandex_url|
    |facebook_url|
    |tesla_url|