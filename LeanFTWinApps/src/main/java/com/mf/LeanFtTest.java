package com.mf;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import com.hp.lft.sdk.*;
import com.hp.lft.verifications.*;
import com.hp.lft.sdk.wpf.*;

import unittesting.*;

import java.io.IOException;

public class LeanFtTest extends UnitTestClassBase {
    ProcessBuilder builder;

    @BeforeClass
    public void beforeClass() throws Exception {
    }

    @AfterClass
    public void afterClass() throws Exception {
    }

    @BeforeMethod
    public void beforeMethod() throws Exception {
        builder = new ProcessBuilder("C:\\Program Files (x86)\\Micro Focus\\Unified Functional Testing\\samples\\Flights Application\\FlightsGUI.exe");
    }

    @AfterMethod
    public void afterMethod() throws Exception {
    }

    @Test
    public void test() throws GeneralLeanFtException, IOException, InterruptedException {
        builder.start();    // launch Flights application
        Window win = Desktop.describe(Window.class, new WindowDescription.Builder()
                .fullType("window")
                .objectName("Micro Focus MyFlight Sample Application")
                .windowTitleRegExp("Micro Focus MyFlight Sample Application").build());

        EditField agentNameEditField = win.describe(EditField.class, new EditFieldDescription.Builder()
                        .objectName("agentName").build());
        agentNameEditField.setText("John");

        EditField passwordEditField = win.describe(EditField.class, new EditFieldDescription.Builder()
                        .objectName("password").build());
        passwordEditField.setSecure("5ce1fa53de3e7563c01a");

        Button oKButton = win.describe(Button.class, new ButtonDescription.Builder()
                        .objectName("okButton")
                        .text("OK").build());
        oKButton.click();

        ComboBox classComboBox = win.describe(ComboBox.class, new ComboBoxDescription.Builder()
                        .fullType("combo box")
                        .objectName("Class").build());
        classComboBox.select("Business");

        ComboBox numOfTicketsComboBox = win.describe(ComboBox.class, new ComboBoxDescription.Builder()
                        .objectName("numOfTickets").build());
        numOfTicketsComboBox.select("2");

        Button fINDFLIGHTSButton = win.describe(Button.class, new ButtonDescription.Builder()
                        .objectName("FIND FLIGHTS")
                        .text("FIND FLIGHTS").build());
        fINDFLIGHTSButton.highlight();
        fINDFLIGHTSButton.click();

        Thread.sleep(5000); // wait 5 seconds before closing the app
        win.close();
    }

}