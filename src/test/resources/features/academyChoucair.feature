# Autor: Daniel Agudelo

  @stories
  Feature: Academy Choucair
    As a user, I want to learn how to automate in screenplay at the Choucair Academy with the automation course
  @scenario1
  Scenario Outline: Search for an automation course
    Given than brandon wants to learn automation at the academy Choucair
    | strUser    | strPassword   |
    | <strUser>  | <strPassword> |
    When he searches for the course on the choucair academy platform
    | strCourse   |
    | <strCourse> |
    Then he finds the course
    | strCourse   |
    | <strCourse> |

    Examples:
    | strUser    | strPassword   | strCourse                              |
    | 1017267930 | Choucair2020* | Prueba Técnica - Analista Bancolombia  |