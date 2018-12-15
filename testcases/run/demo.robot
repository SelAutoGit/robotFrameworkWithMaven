*** Settings ***
Documentation    Demo to use robotframework with selenium for keyword-driven testing
Library     keywords.RobotGUIKeywords

*** Variables ***
${url}       http://store.demoqa.com

*** Test Cases ***
ORDER MAGIC MOUSE
    [Documentation]    Demo test to order a magic mouse
    Init
    Open    ${url}
    Find        HomePage.ProductCategory
    Move To Element       HomePage.ProductCategory
    Click       ProductCategory.Accessories
