package com.mf;

import com.hp.lft.report.ReportException;
import com.hp.lft.report.Reporter;
import com.hp.lft.report.Status;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import com.hp.lft.sdk.*;
import com.hp.lft.verifications.*;
import com.hp.lft.sdk.web.*;

import unittesting.*;

import java.awt.image.RenderedImage;
import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;


public class LeanFtTest extends UnitTestClassBase {

    // Global variables can be accessed from all methods
    Browser browser;
    AOS_Model model;

    public LeanFtTest() {
        //Change this constructor to private if you supply your own public constructor
    }

    @BeforeClass
    public static void setUpBeforeClass() throws Exception {
        instance = new LeanFtTest();
        globalSetup(LeanFtTest.class);
    }

    @AfterClass
    public static void tearDownAfterClass() throws Exception {
        globalTearDown();
    }

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
        browser.close();
    }

    @Test
    public void testFirefox(){
        runBrowserTest(BrowserType.FIREFOX);
    }

    @Test
    public void testChrome(){
        runBrowserTest(BrowserType.CHROME);
    }
    
    // This will be the main function. It'll run few times.
    // Let's first add proper Java error handling using try/catch
    private void runBrowserTest(BrowserType browserType) {
        try {
            // Must move init objects here
            browser = BrowserFactory.launch(browserType);
            model = new AOS_Model(browser);

            browser.navigate("http://nimbusserver:8000/#/");
            browser.sync();

            model.AdvantageShoppingPage().MiceCategoryLink().click();
            model.AdvantageShoppingPage().SelectedMouseImage().click();
            model.AdvantageShoppingPage().BunnyRedWebElement().click();
            model.AdvantageShoppingPage().QuantityEditField().setValue("10");
            model.AdvantageShoppingPage().SaveToCartButton().click();
            model.AdvantageShoppingPage().MenuCartWebElement().click();
            browser.sync();

            // Let's add verifications on the cart amount
            // 1. Add the right object to out Application Model
            // 2. Grab its value
            // 3. Convert the value from Strin to double (number format)
            // 4. Add verification and take actions

            // Grab the object text
            String cartTotal = model.AdvantageShoppingPage().CartTotalWebElement().getInnerText();
            System.out.println(cartTotal);

            // Converting String to number
            // Step 1 get rid of the '$' sign
            String[] labelParts = cartTotal.split("\\$");
            System.out.println(labelParts[1]);

            // Step 2 format the strrin to a number (remove an ',' in the string
            NumberFormat format = NumberFormat.getInstance(Locale.US);
            Number number = format.parse(labelParts[1]);
            double dblTotal = number.doubleValue();

            double maxCartAmount = 100;

            // Add verification
            Verify.less(dblTotal, maxCartAmount, "Cart total verification", "This will tell us if someone is buying too much");

            // Add Report event (optional)
            if (dblTotal > maxCartAmount) {
                // Get a screen capture of the object we're verifying
                RenderedImage image = model.AdvantageShoppingPage().CartTotalWebElement().getSnapshot();
                Reporter.reportEvent("Cart total verification", "Amount exceeds the maximun amout ($" + maxCartAmount + ")", Status.Failed, image);
            } else
                Reporter.reportEvent("Cart total verification", "Amount is ok", Status.Passed);

            model.AdvantageShoppingPage().CheckOutBtnButton().click();
            model.AdvantageShoppingPage().UsernameInOrderPaymentEditField().setValue("Shahar");
            model.AdvantageShoppingPage().PasswordInOrderPaymentEditField().setSecure("5cdccee7f5128bb1b34e92b2deeb8e4dadf8a8180b795b95");
            model.AdvantageShoppingPage().LoginBtnundefinedButton().click();
            browser.sync();
            model.AdvantageShoppingPage().NextBtnButton().click();
            model.AdvantageShoppingPage().SafepayPasswordEditField().setValue("Shahar");
            model.AdvantageShoppingPage().SafepayPasswordEditField().setSecure("5cdccee7f5128bb1b34e92b2deeb8e4dadf8a8180b795b95");
            model.AdvantageShoppingPage().PayNowBtnSAFEPAYButton().click();
            browser.sync();
            model.AdvantageShoppingPage().MenuCartWebElement().click();
            model.AdvantageShoppingPage().SignOutLink().click();
        }catch (ParseException pe){
            System.out.println("ParseException error cought: "+ pe.getMessage());
        }catch (ReportException re){
            System.out.println("ReportException error cought: "+re.getMessage());
        } catch (GeneralLeanFtException glfte){
            System.out.println("GeneralLeanFtException error cought: " + glfte.getMessage());
        }
    }
}