*** Settings ***
Documentation    Demo to use robotframework with selenium for keyword-driven testing
Library     keywords.RobotGUIKeywords

*** Variables ***
${url}       http://store.demoqa.com

*** Test Cases ***
ORDER MAGIC MOUSE
    [Documentation]    Demo test to order a magic mouse work flow
    Init
    Open        ${url}
    Find        HomePage.ProductCategory
    Move To Element       HomePage.ProductCategory
    Click       ProductCategory.Accessories
    Click       Accessories.Button.AddtoCart
    Click       Accessories.Link.Checkout
    Click       Checkout.Link.Continue
    Type In     Checkout.Fianl.Email        joe@gmail.com
    Type In     Checkout.Final.FirstName    John
    Type In     Checkout.Final.LastName     Doe
    Type In     Checkout.Final.Address      1 main street
    Type In     Checkout.Final.City     Toronto
    Select      Checkout.Final.Country      Canada
    Type In     Checkout.Final.PostCode     m1m1m1
    Type In     Checkout.Final.Phone        1234567890
    Click       Checkout.Final.SameAs
    Click       Checkout.Final.Purchase
    Validate Element Presence       TransactionResults.Title
    Validate Element Text       TransactionResults.Title        Transaction Results
    Validate Element Text       TransactionResults.Name     Magic Mouse
    Validate Element Text       TransactionResults.Price        	$150.00
    Validate Element Text       TransactionResults.Quantity     1
    Validate Element Text       TransactionResults.ItemTotal        $150.00
    Close
*** Test Cases ***
ORDER MAGIC MOUSE Negative Test case
    [Documentation]    Demo test to order a magic mouse work flow, negative test cases, email is not typed in
    Init
    Open        ${url}
    Find        HomePage.ProductCategory
    Move To Element       HomePage.ProductCategory
    Click       ProductCategory.Accessories
    Click       Accessories.Button.AddtoCart
    Click       Accessories.Link.Checkout
    Click       Checkout.Link.Continue
    Type In     Checkout.Final.FirstName    John
    Type In     Checkout.Final.LastName     Doe
    Type In     Checkout.Final.Address      1 main street
    Type In     Checkout.Final.City     Toronto
    Select      Checkout.Final.Country      Canada
    Type In     Checkout.Final.PostCode     m1m1m1
    Type In     Checkout.Final.Phone        1234567890
    Click       Checkout.Final.SameAs
    Click       Checkout.Final.Purchase
    Validate Element Presence       TransactionResults.Title
    Close