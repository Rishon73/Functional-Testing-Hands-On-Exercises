'Sign in
Browser("Advantage Shopping").Page("Advantage Shopping").Link("Link").Click @@ hightlight id_;_Browser("Advantage Shopping").Page("Advantage Shopping").Link("Link")_;_script infofile_;_ssf8.xml_;_
Browser("Advantage Shopping").Page("Advantage Shopping").WebEdit("username").Set "Shahar" @@ hightlight id_;_Browser("Advantage Shopping").Page("Advantage Shopping").WebEdit("username")_;_script infofile_;_ssf9.xml_;_
Browser("Advantage Shopping").Page("Advantage Shopping").WebEdit("password").SetSecure "5cd9a8a056aee46955c242c685400e40a22c02e3b16f6ea1" @@ hightlight id_;_Browser("Advantage Shopping").Page("Advantage Shopping").WebEdit("password")_;_script infofile_;_ssf10.xml_;_
Browser("Advantage Shopping").Page("Advantage Shopping").WebButton("sign_in_btnundefined").Click @@ hightlight id_;_Browser("Advantage Shopping").Page("Advantage Shopping").WebButton("sign in btnundefined")_;_script infofile_;_ssf11.xml_;_

'Checkpoint
Browser("Advantage Shopping").Page("Advantage Shopping").WebElement("Shahar").Check CheckPoint("CheckUserName") @@ hightlight id_;_Browser("Advantage Shopping").Page("Advantage Shopping").WebElement("Shahar")_;_script infofile_;_ssf12.xml_;_

'Contact us
Browser("Advantage Shopping").Page("Advantage Shopping").Link("Link_4").Click @@ hightlight id_;_Browser("Advantage Shopping").Page("Advantage Shopping").Link("Link 4")_;_script infofile_;_ssf15.xml_;_
Browser("Advantage Shopping").Page("Advantage Shopping").WebList("categoryListbox").Select "Tablets" @@ hightlight id_;_Browser("Advantage Shopping").Page("Advantage Shopping").WebList("categoryListboxContactUs")_;_script infofile_;_ssf16.xml_;_
Browser("Advantage Shopping").Page("Advantage Shopping").WebList("productListbox").Select DataTable("Product", dtGlobalSheet) @@ hightlight id_;_Browser("Advantage Shopping").Page("Advantage Shopping").WebList("productListboxContactUs")_;_script infofile_;_ssf17.xml_;_
Browser("Advantage Shopping").Page("Advantage Shopping").WebEdit("emailContactUs").Set "Shahar@aos.com" @@ hightlight id_;_Browser("Advantage Shopping").Page("Advantage Shopping").WebEdit("emailContactUs")_;_script infofile_;_ssf18.xml_;_
Browser("Advantage Shopping").Page("Advantage Shopping").WebEdit("subjectTextareaContactUs").Set "This is a great product :-)" @@ hightlight id_;_Browser("Advantage Shopping").Page("Advantage Shopping").WebEdit("subjectTextareaContactUs")_;_script infofile_;_ssf19.xml_;_
Browser("Advantage Shopping").Page("Advantage Shopping").WebButton("send_btnundefined").Click

'Go up
Browser("Advantage Shopping").Page("Advantage Shopping").Image("GO UP").Click

'Sign out
Browser("Advantage Shopping").Page("Advantage Shopping").Link("Link_2").Click @@ hightlight id_;_Browser("Advantage Shopping").Page("Advantage Shopping").Link("Link 2")_;_script infofile_;_ssf13.xml_;_
Browser("Advantage Shopping").Page("Advantage Shopping").Link("Link_3").Click @@ hightlight id_;_Browser("Advantage Shopping").Page("Advantage Shopping").Link("Link 3")_;_script infofile_;_ssf14.xml_;_
