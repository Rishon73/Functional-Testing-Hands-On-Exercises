package com.mf;

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
        browser = BrowserFactory.launch(BrowserType.FIREFOX);
        model = new AOS_Model(browser);
    }

    @After
    public void tearDown() throws Exception {
        browser.close();
    }

    @Test
    public void thisISMyTest() throws GeneralLeanFtException, InterruptedException {
        browser.navigate("http://nimbusserver:8000/#/");
        browser.sync();

        model.AdvantageShoppingPage().MiceCategoryLink().click();
        model.AdvantageShoppingPage().SelectedMouseImage().click();
        model.AdvantageShoppingPage().BunnyRedWebElement().click();
        model.AdvantageShoppingPage().QuantityEditField().setValue("1");
        model.AdvantageShoppingPage().SaveToCartButton().click();
        model.AdvantageShoppingPage().MenuCartWebElement().click();
        browser.sync();
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

        Thread.sleep(5000); //sleep for 5 seconds
    }

}