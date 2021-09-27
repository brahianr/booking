Feature: Add travel companion

  Background:
    Given that user open Booking home page
    When he submit username and password
      | email           | password    |
      | testr3@test.com | Testpass123 |

  Scenario: Add travel companion successful
    Given that user is in travel companion option
    When he enters the data of his companion
      | name     | lastname | birthDay | birthMonth | birthYear |
      | nameTest | LasTest  | 12       | 05         | 1997      |
    Then he should see nameTest added
    #Then he should see the accompanying person added