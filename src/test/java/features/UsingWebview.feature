Feature: Searching for elements on the webview section

  Scenario: Search for elements on a webview
    Given user is able to use a webview
    When he visits https://www.google.com
    Then he must be able to interact with the web elements