package com.mf;

import org.testng.Reporter;
import org.testng.annotations.*;
import com.hp.lft.sdk.*;
import com.hp.lft.verifications.*;
import com.hp.lft.sdk.web.*;
import com.hp.lft.report.*;

import unittesting.*;

public class LeanFtTest extends UnitTestClassBase {

    @BeforeClass
    public void beforeClass() throws Exception {
    }

    @AfterClass
    public void afterClass() throws Exception {
    }

    @BeforeMethod
    public void beforeMethod() throws Exception {
    }

    @AfterMethod
    public void afterMethod() throws Exception {
    }

    // Runs in parallel when set to true
    // otherwise it runs in serial
    @DataProvider(name="TestBrowsers", parallel = true)
    public Object[][] getTestBrowsers(){
        return new Object[][]{
                {BrowserType.CHROME, 5000},
                {BrowserType.FIREFOX, 3000}
        };
    }

    @Test(dataProvider = "TestBrowsers")
    public void test(BrowserType browserType, int millis) throws GeneralLeanFtException, InterruptedException, ReportException {
        com.hp.lft.report.Reporter.reportEvent("Enter test",
                "Entering with: "+browserType.name() + " and waiting for "+ millis +" milliseconds");
        Browser browser = BrowserFactory.launch(browserType);
        AOS_Model model = new AOS_Model(browser);
        browser.navigate("http://nimbusserver.aos.com:8000/#/");
        browser.sync();

        model.AdvantageShoppingPage().MiceCategoryLink().highlight();
        model.AdvantageShoppingPage().MiceCategoryLink().click();

        model.AdvantageShoppingPage().SelectedMouseImage().highlight();
        model.AdvantageShoppingPage().SelectedMouseImage().click();

        Thread.sleep(millis);
        browser.close();
    }

}