Feature: Google Search
  As a user I want to test search function

  Scenario Outline: Basic search
    Given I open search page
    When I lookup the word <arg0>
    Then search result display the word <arg0>
    Examples:
      | arg0       |
      | "selenium" |

#  Scenario: Basic search
#    Given I open search page
#    When I lookup the word "selenium"
#    Then search result display the word "selenium"