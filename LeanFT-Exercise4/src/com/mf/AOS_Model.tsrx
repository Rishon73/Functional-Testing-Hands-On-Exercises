<?xml version="1.0" encoding="utf-8" standalone="yes"?>
<applicationModel>
    <name>Application Model</name>
    <className>AOS_Model</className>
    <objects>
        <object type="Page" technology="Web">
            <name> Advantage Shopping</name>
            <codeName>AdvantageShoppingPage</codeName>
            <description></description>
            <identification/>
            <children>
                <object type="Link" technology="Web">
                    <name>MiceCategory</name>
                    <codeName>MiceCategoryLink</codeName>
                    <description></description>
                    <identification>
                        <properties>
                            <property name="InnerText" type="string" isRegExp="false">MICE Shop Now </property>
                            <property name="TagName" type="string" isRegExp="false">DIV</property>
                        </properties>
                    </identification>
                </object>
                <object type="WebElement" technology="Web">
                    <name>menuCart</name>
                    <codeName>MenuCartWebElement</codeName>
                    <description></description>
                    <identification>
                        <properties>
                            <property name="AccessibilityName" type="string" isRegExp="false"></property>
                            <property name="InnerText" type="string" isRegExp="false"></property>
                            <property name="TagName" type="string" isRegExp="false">svg</property>
                        </properties>
                        <index>6</index>
                    </identification>
                </object>
                <object type="WebElement" technology="Web">
                    <name>UserAccount</name>
                    <codeName>UserAccountWebElement</codeName>
                    <description></description>
                    <identification>
                        <properties>
                            <property name="AccessibilityName" type="string" isRegExp="false"></property>
                            <property name="InnerText" type="string" isRegExp="false"></property>
                            <property name="TagName" type="string" isRegExp="false">path</property>
                        </properties>
                        <index>7</index>
                    </identification>
                </object>
                <object type="Image" technology="Web">
                    <name>selectedMouse</name>
                    <codeName>SelectedMouseImage</codeName>
                    <description></description>
                    <identification>
                        <properties>
                            <property name="Alt" type="string" isRegExp="false"></property>
                            <property name="TagName" type="string" isRegExp="false">IMG</property>
                            <property name="Type" type="enum" isRegExp="false">Normal</property>
                        </properties>
                        <index>2</index>
                    </identification>
                </object>
                <object type="Image" technology="Web">
                    <name>anotherMouse</name>
                    <codeName>AnotherMouseImage</codeName>
                    <description></description>
                    <identification>
                        <properties>
                            <property name="Alt" type="string" isRegExp="false"></property>
                            <property name="TagName" type="string" isRegExp="false">IMG</property>
                            <property name="Type" type="enum" isRegExp="false">Normal</property>
                        </properties>
                        <index>1</index>
                    </identification>
                </object>
                <object type="WebElement" technology="Web">
                    <name>bunnyWhite</name>
                    <codeName>BunnyWhiteWebElement</codeName>
                    <description></description>
                    <identification>
                        <properties>
                            <property name="ClassName" type="string" isRegExp="false">productColor ng-scope colorSelected WHITE</property>
                            <property name="InnerText" type="string" isRegExp="false"></property>
                            <property name="TagName" type="string" isRegExp="false">SPAN</property>
                        </properties>
                    </identification>
                </object>
                <object type="WebElement" technology="Web">
                    <name>bunnyGrey</name>
                    <codeName>BunnyGreyWebElement</codeName>
                    <description></description>
                    <identification>
                        <properties>
                            <property name="ClassName" type="string" isRegExp="false">bunny productColor ng-scope GRAY</property>
                            <property name="InnerText" type="string" isRegExp="false"></property>
                            <property name="TagName" type="string" isRegExp="false">SPAN</property>
                        </properties>
                    </identification>
                </object>
                <object type="WebElement" technology="Web">
                    <name>bunnyRed</name>
                    <codeName>BunnyRedWebElement</codeName>
                    <description></description>
                    <identification>
                        <properties>
                            <property name="ClassName" type="string" isRegExp="false">bunny productColor ng-scope RED</property>
                            <property name="InnerText" type="string" isRegExp="false"></property>
                            <property name="TagName" type="string" isRegExp="false">SPAN</property>
                        </properties>
                    </identification>
                </object>
                <object type="EditField" technology="Web">
                    <name>quantity</name>
                    <codeName>QuantityEditField</codeName>
                    <description></description>
                    <identification>
                        <properties>
                            <property name="Name" type="string" isRegExp="false">quantity</property>
                            <property name="TagName" type="string" isRegExp="false">INPUT</property>
                            <property name="Type" type="string" isRegExp="false">text</property>
                        </properties>
                    </identification>
                </object>
                <object type="Button" technology="Web">
                    <name>save_to_cart</name>
                    <codeName>SaveToCartButton</codeName>
                    <description></description>
                    <identification>
                        <properties>
                            <property name="ButtonType" type="string" isRegExp="false">submit</property>
                            <property name="Name" type="string" isRegExp="false">ADD TO CART</property>
                            <property name="TagName" type="string" isRegExp="false">BUTTON</property>
                        </properties>
                    </identification>
                </object>
                <object type="Button" technology="Web">
                    <name>check_out_btn</name>
                    <codeName>CheckOutBtnButton</codeName>
                    <description></description>
                    <identification>
                        <properties>
                            <property name="ButtonType" type="string" isRegExp="false">submit</property>
                            <property name="Name" type="string" isRegExp="true">CHECKOUT \(.*\)</property>
                            <property name="TagName" type="string" isRegExp="false">BUTTON</property>
                        </properties>
                    </identification>
                </object>
                <object type="EditField" technology="Web">
                    <name>usernameInOrderPayment</name>
                    <codeName>UsernameInOrderPaymentEditField</codeName>
                    <description></description>
                    <identification>
                        <properties>
                            <property name="Name" type="string" isRegExp="false">usernameInOrderPayment</property>
                            <property name="TagName" type="string" isRegExp="false">INPUT</property>
                            <property name="Type" type="string" isRegExp="false">text</property>
                        </properties>
                    </identification>
                </object>
                <object type="EditField" technology="Web">
                    <name>passwordInOrderPayment</name>
                    <codeName>PasswordInOrderPaymentEditField</codeName>
                    <description></description>
                    <identification>
                        <properties>
                            <property name="Name" type="string" isRegExp="false">passwordInOrderPayment</property>
                            <property name="TagName" type="string" isRegExp="false">INPUT</property>
                            <property name="Type" type="string" isRegExp="false">password</property>
                        </properties>
                    </identification>
                </object>
                <object type="Button" technology="Web">
                    <name>login_btnundefined</name>
                    <codeName>LoginBtnundefinedButton</codeName>
                    <description></description>
                    <identification>
                        <properties>
                            <property name="ButtonType" type="string" isRegExp="false">button</property>
                            <property name="Name" type="string" isRegExp="false">LOGIN</property>
                            <property name="TagName" type="string" isRegExp="false">BUTTON</property>
                        </properties>
                    </identification>
                </object>
                <object type="Button" technology="Web">
                    <name>next_btn</name>
                    <codeName>NextBtnButton</codeName>
                    <description></description>
                    <identification>
                        <properties>
                            <property name="ButtonType" type="string" isRegExp="false">submit</property>
                            <property name="Name" type="string" isRegExp="false">NEXT</property>
                            <property name="TagName" type="string" isRegExp="false">BUTTON</property>
                        </properties>
                    </identification>
                </object>
                <object type="EditField" technology="Web">
                    <name>safepay_username</name>
                    <codeName>SafepayUsernameEditField</codeName>
                    <description></description>
                    <identification>
                        <properties>
                            <property name="Name" type="string" isRegExp="false">safepay_username</property>
                            <property name="TagName" type="string" isRegExp="false">INPUT</property>
                            <property name="Type" type="string" isRegExp="false">text</property>
                        </properties>
                    </identification>
                </object>
                <object type="EditField" technology="Web">
                    <name>safepay_password</name>
                    <codeName>SafepayPasswordEditField</codeName>
                    <description></description>
                    <identification>
                        <properties>
                            <property name="Name" type="string" isRegExp="false">safepay_password</property>
                            <property name="TagName" type="string" isRegExp="false">INPUT</property>
                            <property name="Type" type="string" isRegExp="false">password</property>
                        </properties>
                    </identification>
                </object>
                <object type="Button" technology="Web">
                    <name>pay_now_btn_SAFEPAY</name>
                    <codeName>PayNowBtnSAFEPAYButton</codeName>
                    <description></description>
                    <identification>
                        <properties>
                            <property name="AccessibilityName" type="string" isRegExp="false"></property>
                            <property name="ButtonType" type="string" isRegExp="false">button</property>
                            <property name="Name" type="string" isRegExp="false">PAY NOW</property>
                            <property name="Role" type="string" isRegExp="false">button</property>
                            <property name="TagName" type="string" isRegExp="false">BUTTON</property>
                        </properties>
                        <index>0</index>
                    </identification>
                </object>
                <object type="WebElement" technology="Web">
                    <name>$99.96</name>
                    <codeName>WebElement</codeName>
                    <description></description>
                    <identification>
                        <properties>
                            <property name="ClassName" type="string" isRegExp="false">roboto-medium totalValue ng-binding</property>
                            <property name="InnerText" type="string" isRegExp="false">$99.96</property>
                            <property name="TagName" type="string" isRegExp="false">SPAN</property>
                        </properties>
                    </identification>
                </object>
                <object type="WebElement" technology="Web">
                    <name>Thank you for buying with Advantage</name>
                    <codeName>ThankYouForBuyingWithAdvantageWebElement</codeName>
                    <description></description>
                    <identification>
                        <properties>
                            <property name="InnerText" type="string" isRegExp="false">Thank you for buying with Advantage</property>
                            <property name="TagName" type="string" isRegExp="false">SPAN</property>
                        </properties>
                    </identification>
                </object>
                <object type="WebElement" technology="Web">
                    <name>trackingNumberLabel</name>
                    <codeName>TrackingNumberLabelWebElement</codeName>
                    <description></description>
                    <identification>
                        <properties>
                            <property name="InnerText" type="string" isRegExp="false">7768233574</property>
                            <property name="TagName" type="string" isRegExp="false">LABEL</property>
                        </properties>
                    </identification>
                </object>
                <object type="WebElement" technology="Web">
                    <name>orderNumberLabel</name>
                    <codeName>OrderNumberLabelWebElement</codeName>
                    <description></description>
                    <identification>
                        <properties>
                            <property name="InnerText" type="string" isRegExp="false">7768264473</property>
                            <property name="TagName" type="string" isRegExp="false">LABEL</property>
                        </properties>
                    </identification>
                </object>
                <object type="WebElement" technology="Web">
                    <name>menuUser</name>
                    <codeName>MenuUserWebElement</codeName>
                    <description></description>
                    <identification>
                        <properties>
                            <property name="AccessibilityName" type="string" isRegExp="false"></property>
                            <property name="InnerText" type="string" isRegExp="false"></property>
                            <property name="TagName" type="string" isRegExp="false">svg</property>
                        </properties>
                        <index>7</index>
                    </identification>
                </object>
                <object type="Link" technology="Web">
                    <name>Sign out</name>
                    <codeName>SignOutLink</codeName>
                    <description></description>
                    <identification>
                        <properties>
                            <property name="InnerText" type="string" isRegExp="false">Sign out</property>
                            <property name="TagName" type="string" isRegExp="false">LABEL</property>
                        </properties>
                    </identification>
                </object>
            </children>
        </object>
    </objects>
</applicationModel>
