package com.mf;

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

    // global variable;
    Browser browser;

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
        browser = BrowserFactory.launch(BrowserType.FIREFOX); // could be FIREFOX as welll...
    }

    @After
    public void tearDown() throws Exception {
        browser.close();
    }

    @Test
    public void test() throws GeneralLeanFtException {
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
        usernameEditField.setValue("Shahar");

        EditField passwordEditField = browser.describe(EditField.class, new EditFieldDescription.Builder()
                .name("password")
                .tagName("INPUT")
                .type("password").build());
        passwordEditField.setSecure("5cdc93358f89cca5af471fe32688b8cec9603b620449e381");

        Button signInBtnundefinedButton = browser.describe(Button.class, new ButtonDescription.Builder()
                .buttonType("button")
                .name("SIGN IN")
                .tagName("BUTTON").build());
        signInBtnundefinedButton.click();

        Link mICEShopNowLink = browser.describe(Link.class, new LinkDescription.Builder()
                .innerText("MICE Shop Now ")
                .tagName("DIV").build());
        mICEShopNowLink.click();

        Image fetchImageImageId5300Image = browser.describe(Image.class, new ImageDescription.Builder()
                .alt("")
                .tagName("IMG")
                .type(com.hp.lft.sdk.web.ImageType.NORMAL)
                .index(2).build());
        fetchImageImageId5300Image.click();

        WebElement bunnyWebElement = browser.describe(WebElement.class, new WebElementDescription.Builder()
                .className("bunny productColor ng-scope RED")
                .innerText("")
                .tagName("SPAN").build());
        bunnyWebElement.click();

        WebElement webElement = browser.describe(WebElement.class, new WebElementDescription.Builder()
                .className("plus")
                .innerText("")
                .tagName("DIV").build());
        webElement.click();

        webElement.click();

        Button saveToCartButton = browser.describe(Button.class, new ButtonDescription.Builder()
                .buttonType("submit")
                .name("ADD TO CART")
                .tagName("BUTTON").build());
        saveToCartButton.click();

        /*
        * This statement may be problematic, here's why...
        *
        Button checkOutBtnButton = browser.describe(Button.class, new ButtonDescription.Builder()
                .buttonType("submit")
                .name("CHECKOUT  ($89.97)")
                .tagName("BUTTON").build());
        checkOutBtnButton.click();
*/
        Button checkOutBtnButton = browser.describe(Button.class, new ButtonDescription.Builder()
                .buttonType("submit")
                .name(new RegExpProperty("CHECKOUT  .*"))
                .tagName("BUTTON").build());
        checkOutBtnButton.highlight();
        checkOutBtnButton.click();

        Button nextBtnButton = browser.describe(Button.class, new ButtonDescription.Builder()
                .buttonType("submit")
                .name("NEXT")
                .tagName("BUTTON").build());
        nextBtnButton.click();

        WebElement sHIPPINGDETAILS2PAYMENTMETHODShaharUnitedStatesEdiWebElement = browser.describe(WebElement.class, new WebElementDescription.Builder()
                .className("")
                .innerText("1. SHIPPING DETAILS 2. PAYMENT METHOD Shahar United States Edit shipping details SHIPPING BY: NEXT Recipient details First Name- Use 2 character or longer - Use maximum 30 character Last Name- Use 2 character or longer - Use maximum 30 character Phone Number- Use maximum 20 character Address *AfganistanAlbaniaAlgeriaAmerican SamoaAndoraAngolaAnguillaAntigua and BarbudaArgentinaArmeniaArubaAustraliaAustriaAzerbaijanBahamasBahrainBangladeshBarbadosBelarusBelgiumBelizeBeninBermudaBhutanBoliviaBonaireBosnia and HerzegovinaBotswanaBrazilBruneiBulgariaBurkina FasoBurundi CambodiaCameroonCanadaCanary IslandsCape Verde aranelleCayman IslandsCentral African RepublicChadChileChinaColombiaComoro IslandsCongoCook IslandsCosta RicaCroatiaCubaCyprusCzech RepublicDemocratic Republic of CongoDenmarkDjiboutiDominicaDominican RepublicDutch (Netherlands) AntillesEast TimorEcuadorEgyptEl SalvadorEnglandEquatorial GuineaEritrea EstoniaEthiopiaFalkland IslandsFijiFinlandFranceFrench GuyanaFrench PolynesiaGabonaiseGambiaGeorgiaGermanyGhanaGibraltarGreeceGreenlandGrenadaGuadeloupeGuamGuatemalaGuernseyGuineaGuinea BissauGuyanaHaitiHawaiHeard IslandHondurasHong KongHungaryIcelandIndiaIndonesiaIranIraqIrelandIsle of ManIsraelItalyIvory CostJamaicaJapanJerseyJordanKazakhstanKenyaKiribatiKosovoKuwaitKyrgyzstanLaosLatviaLebanonLesothoLiberiaLibyaLiechtensteinLithuaniaLuxembourgMacauMacedoniaMacquarie IslandMadagascarMalawiMalaysiamaldives IslandsMaliMaltaMaroccoMarshal IslandsMartinique MauritaniaMauritiusMayotteMexicoMicronesiaMidway AtolMoldovaMonacoMongoliaMontenegroMontserratMozambiqueMyanmar (Burma)NamibiaNauruNepalNetherlandNew CaledoniaNew ZealandNicaraguaNigerNigeriaNorfolk IslandsNorthen IrelandNorth KoreaNorwayOmanPakistanPalauPalestinian AuthorityPanamaParaguayPeruPhilippinesPolandPortugalPuerto RicoPuerto RicoQatarReunionRomaniaRussiaRwandaSaint Helena IslandSaint Kitts and NevisSaint Vincent and the GrenadinesSamoaSan MarinoSao TomeSaudi ArabiaScotland SenegalSerbiaSeychelles IslandsSierra LeoneSingaporeSlovakiaSloveniaSolomon IslandsSomaliaSouth AfricaSouth GeorgiaSouth KoreaSouth SudanSpainSri LankaSt. LuciaSudanSurinamSwazilandSwedenSwitzerlandSyriaTadzhikistanTaiwanTanzaniaThailandTogo (Togolese)TokelauTongaTrinidad and TobagoTunisiaTurkeyTurkmenistan Turks and Caicos IslandsUgandaUkraineUnited Arab EmiratesUnited KingdomUnited StatesUruguayUzbekistanVanuatuVaticanVaticanVenezuelaVietnamVirgin Islands (UK)Virgin Islands (USA)WalesWallis and Futuna IslandsYemenZambiaZanzibar Zimbabwe Country City- Use maximum 25 character Address- Use maximum 50 character Postal Code- Use maximum 10 character State / Province / Region- Use maximum 10 character Save changes in profile for future use NEXT BACK Choose payment method below Notice This is a demo site. Do not use real data. *SafePay username- Use 5 character or longer - Use maximum 15 character - Use letters, numbers, and the following symbols only: .-_ *SafePay password- Use 4 character or longer - Use maximum 12 character - Including at least one lower letter - Including at least one upper letter - Including at least one number Save changes in profile for future use Back to shipping details PAY NOW MasterCredit Edit Back to shipping details PAY NOW Notice This is a demo site. Do not use real data. *Card number- Use exactly 16 numbers *CVV number- Use exactly 3 digits Expiration date *010203040506070809101112MM *2019202020212022202320242025202620272028YYYY *Cardholder name Save changes in profile for future use Back to shipping details PAY NOW ")
                .tagName("DIV").build());
        sHIPPINGDETAILS2PAYMENTMETHODShaharUnitedStatesEdiWebElement.click();

        EditField safepayPasswordEditField = browser.describe(EditField.class, new EditFieldDescription.Builder()
                .name("safepay_password")
                .tagName("INPUT")
                .type("password").build());
        safepayPasswordEditField.setSecure("5cdc9361b9951065395d841fb68c7bf09f804bbd996b3aef");

        CheckBox saveSafepayCheckBox = browser.describe(CheckBox.class, new CheckBoxDescription.Builder()
                .name("save_safepay")
                .tagName("INPUT")
                .type("checkbox").build());
        saveSafepayCheckBox.set(false);

        Button payNowBtnSAFEPAYButton = browser.describe(Button.class, new ButtonDescription.Builder()
                .accessibilityName("")
                .buttonType("button")
                .name("PAY NOW")
                .role("button")
                .tagName("BUTTON")
                .index(0).build());
        payNowBtnSAFEPAYButton.click();

        WebElement thankYouForBuyingWithAdvantageWebElement = browser.describe(WebElement.class, new WebElementDescription.Builder()
                .innerText("Thank you for buying with Advantage")
                .tagName("SPAN").build());
        Verify.areEqual("Thank you for buying with Advantage", thankYouForBuyingWithAdvantageWebElement.getInnerText(), "Verification", "Verify property: innerText");

        Link shaharMyAccountMyOrdersSignOutLink = browser.describe(Link.class, new LinkDescription.Builder()
                .innerText("Shahar My account My orders Sign out ")
                .tagName("A").build());
        shaharMyAccountMyOrdersSignOutLink.click();

        Link signOutLink = browser.describe(Link.class, new LinkDescription.Builder()
                .innerText("Sign out")
                .tagName("LABEL").build());
        signOutLink.click();

    }

}