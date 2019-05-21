package com.mf;

import com.hp.lft.report.ReportException;
import com.hp.lft.report.Reporter;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import com.hp.lft.sdk.*;
import com.hp.lft.verifications.*;
import com.hp.lft.sdk.web.*;
import java.io.IOException;

import unittesting.*;

public class LeanFtTest extends UnitTestClassBase {

    Browser browser;
    private static String FILE_NAME = "C:\\Users\\demo\\Functional-Testing-Hands-On-Exercises\\resources\\SampleData.xlsx";
    private ExcelParser excelParser;

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
        excelParser = new ExcelParser();
    }

    @After
    public void tearDown() throws Exception {
        browser.close();
        excelParser.close();
    }

    @Test
    public void testFirefox () throws GeneralLeanFtException, IOException, InvalidFormatException, ReportException {
        excelParser.parse(FILE_NAME, 0);
        browser = BrowserFactory.launch(BrowserType.FIREFOX);

        String[] loginNames = excelParser.getAllCellsByHeaderName("LoginName");
        String[] passwords = excelParser.getAllCellsByHeaderName("Password");

        for (int i = 0; i<loginNames.length; i++)
            runBrowserTest(loginNames[i], passwords[i]);
    }

    public void runBrowserTest(String userName, String password) throws GeneralLeanFtException, ReportException {
        Reporter.reportEvent("Starting test iteration", "User:"+userName);
        browser.navigate("http://nimbusserver.aos.com:8000/");
        browser.sync();

        Link myAccountMyOrdersSignOutLink = browser.describe(Link.class, new LinkDescription.Builder()
                .innerText("My account My orders Sign out ")
                .tagName("A").build());
        myAccountMyOrdersSignOutLink.click();

        EditField usernameEditField = browser.describe(EditField.class, new EditFieldDescription.Builder()
                .name("username")
                .tagName("INPUT")
                .type("text").build());
        usernameEditField.setValue(userName);

        EditField passwordEditField = browser.describe(EditField.class, new EditFieldDescription.Builder()
                .name("password")
                .tagName("INPUT")
                .type("password").build());
        passwordEditField.setValue(password);

        Button signInBtnundefinedButton = browser.describe(Button.class, new ButtonDescription.Builder()
                .buttonType("button")
                .name("SIGN IN")
                .tagName("BUTTON").build());
        signInBtnundefinedButton.click();

        Link shaharMyAccountMyOrdersSignOutLink = browser.describe(Link.class, new LinkDescription.Builder()
                .innerText(userName+" My account My orders Sign out ")
                .tagName("A").build());
        shaharMyAccountMyOrdersSignOutLink.click();

        Link myAccountLink = browser.describe(Link.class, new LinkDescription.Builder()
                .innerText("My account")
                .tagName("LABEL").build());
        myAccountLink.click();

        CheckBox categoryTabletsCheckBox = browser.describe(CheckBox.class, new CheckBoxDescription.Builder()
                .name("category_tablets")
                .tagName("INPUT")
                .type("checkbox").build());
        categoryTabletsCheckBox.set(false);

        CheckBox categoryLaptopsCheckBox = browser.describe(CheckBox.class, new CheckBoxDescription.Builder()
                .name("category_laptops")
                .tagName("INPUT")
                .type("checkbox").build());
        categoryLaptopsCheckBox.set(false);

        CheckBox categorySpeakersCheckBox = browser.describe(CheckBox.class, new CheckBoxDescription.Builder()
                .name("category_speakers")
                .tagName("INPUT")
                .type("checkbox").build());
        categorySpeakersCheckBox.set(false);

        shaharMyAccountMyOrdersSignOutLink.click();

        Link signOutLink = browser.describe(Link.class, new LinkDescription.Builder()
                .innerText("Sign out")
                .tagName("LABEL").build());
        signOutLink.click();

        Reporter.reportEvent("Exiting test iteration", "user: "+userName);
    }

}