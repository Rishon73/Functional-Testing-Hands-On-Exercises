If False Then
Dim val
Browser("Advantage Shopping").Page("Advantage Shopping").Link("TABLETS Shop Now").Click @@ script infofile_;_ZIP::ssf3.xml_;_
Browser("Advantage Shopping").Page("Advantage Shopping").WebElement("HP ElitePad 1000 G2 Tablet").Click @@ script infofile_;_ZIP::ssf4.xml_;_
Browser("Advantage Shopping").Page("Advantage Shopping").WebButton("buy_now").Click @@ script infofile_;_ZIP::ssf5.xml_;_
Browser("Advantage Shopping").Page("Advantage Shopping").WebElement("$1,009.00 SOLD OUT").Check CheckPoint("$1,009.00 SOLD OUT") @@ script infofile_;_ZIP::ssf6.xml_;_
Browser("Advantage Shopping").Page("Advantage Shopping").WebButton("save_to_cart").Click @@ script infofile_;_ZIP::ssf7.xml_;_

val = ConvertCartTotalString2Number
If CDbl(val) > 2000 Then
	msgbox ("Cart contains too many items (" + val + "), clear it out.")
Else
	Browser("Advantage Shopping").Page("Advantage Shopping").WebButton("check_out_btn").Click
End If
Browser("Advantage Shopping").Page("Advantage Shopping_2").Link("HOME").Click
End If

Browser("Advantage Shopping").Page("Advantage Shopping_2").Link("Link").Click @@ hightlight id_;_Browser("Advantage Shopping").Page("Advantage Shopping 2").Link("Link")_;_script infofile_;_ZIP::ssf10.xml_;_
Browser("Advantage Shopping").Page("Advantage Shopping_2").WebButton("see_offer_btn").Click
Browser("Advantage Shopping").Page("Advantage Shopping_2").WebElement("$449.99 SOLD OUT").Check CheckPoint("$449.99 SOLD OUT")

Browser("Advantage Shopping").Page("Advantage Shopping_2").WebButton("save_to_cart").Click @@ hightlight id_;_Browser("Advantage Shopping").Page("Advantage Shopping 2").WebButton("save to cart")_;_script infofile_;_ZIP::ssf12.xml_;_
Browser("Advantage Shopping").Page("Advantage Shopping_2").Link("HOME").Click


Function ConvertCartTotalString2Number
	Dim val
	Dim niddle

	val = Trim(Browser("Advantage Shopping").Page("Advantage Shopping").WebButton("check_out_btn").GetROProperty("name"))
	niddle = "$"
	
	val = Mid(val, inStr(val, niddle)+1)
	val = Left(val, len(val)-1)
	ConvertCartTotalString2Number = val
End Function
