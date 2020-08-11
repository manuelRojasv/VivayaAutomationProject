package VivayaTests;

import Page_Obj.TopBar;
import Page_Obj.WhatWeOfferPage;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class WhatWeOfferLinks {
    WebDriver driver;

    @BeforeClass
    @Parameters({"URL", "BrowserType"})
    public void initial_Setup(String url, String browserType) {

        if (browserType.equalsIgnoreCase("Chrome")) {
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
            driver.get(url);
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

        }

        System.out.println("Opening" + browserType);
    }

    @Test
    public void Verify_YogaLinks(){
        WhatWeOfferPage objWhatWeOffer = new WhatWeOfferPage(driver);
        TopBar objTop = new TopBar(driver);
        objTop.Press_WhatWeOfferLink();
        objWhatWeOffer.Press_AnusaraYoga();
        String PageName1=objWhatWeOffer.Verify_PageName();
        Assert.assertEquals(PageName1, "Anusara Yoga");
        System.out.println("Anusara Yoga: " + PageName1);
        objTop.Press_WhatWeOfferLink();
        objWhatWeOffer.Press_AshtangaYoga();
        String PageName2=objWhatWeOffer.Verify_PageName();
        Assert.assertEquals(PageName2, "Ashtanga Yoga");
        System.out.println("Ashtanga Yoga: " + PageName2);
        objTop.Press_WhatWeOfferLink();
        objWhatWeOffer.Press_FamilyYoga();
        String PageName3=objWhatWeOffer.Verify_PageName();
        Assert.assertEquals(PageName3, "Family Yoga");
        System.out.println("Family Yoga: " + PageName3);
        objTop.Press_WhatWeOfferLink();
        objWhatWeOffer.Press_HathaYoga();
        String PageName4=objWhatWeOffer.Verify_PageName();
        Assert.assertEquals(PageName4, "Hatha Yoga");
        System.out.println("Hatha Yoga: " + PageName4);
        objTop.Press_WhatWeOfferLink();
        objWhatWeOffer.Press_IyengarYoga();
        String PageName5=objWhatWeOffer.Verify_PageName();
        Assert.assertEquals(PageName5, "Iyengar Yoga");
        System.out.println("Iyengar Yoga: " + PageName5);
        objTop.Press_WhatWeOfferLink();
        objWhatWeOffer.Press_JivamuktiYoga();
        String PageName6=objWhatWeOffer.Verify_PageName();
        Assert.assertEquals(PageName6, "Jivamukti Yoga");
        System.out.println("Jivamukti Yoga: " + PageName6);
        objTop.Press_WhatWeOfferLink();
        objWhatWeOffer.Press_KatonahYoga();
        String PageName7=objWhatWeOffer.Verify_PageName();
        Assert.assertEquals(PageName7, "Katonah Yoga");
        System.out.println("Katonah Yoga: " + PageName7);
        objTop.Press_WhatWeOfferLink();
        objWhatWeOffer.Press_KulaYoga();
        String PageName8=objWhatWeOffer.Verify_PageName();
        Assert.assertEquals(PageName8, "Kula Yoga");
        System.out.println("Kula Yoga: " + PageName8);
        objTop.Press_WhatWeOfferLink();
        objWhatWeOffer.Press_KundaliniYoga();
        String PageName9=objWhatWeOffer.Verify_PageName();
        Assert.assertEquals(PageName9, "Kundalini Yoga");
        System.out.println("Kundalini Yoga: " + PageName9);
        objTop.Press_WhatWeOfferLink();
        objWhatWeOffer.Press_NidraYoga();
        String PageName10=objWhatWeOffer.Verify_PageName();
        Assert.assertEquals(PageName10, "Nidra Yoga");
        System.out.println("Nidra Yoga: " + PageName10);
        objTop.Press_WhatWeOfferLink();
        objWhatWeOffer.Press_ParaYoga();
        String PageName11=objWhatWeOffer.Verify_PageName();
        Assert.assertEquals(PageName11, "ParaYoga® Yoga");
        System.out.println("Para Yoga: " + PageName11);
        objTop.Press_WhatWeOfferLink();
        objWhatWeOffer.Press_PowerYoga();
        String PageName12=objWhatWeOffer.Verify_PageName();
        Assert.assertEquals(PageName12, "Power Yoga");
        System.out.println("Power Yoga: " + PageName12);
        objTop.Press_WhatWeOfferLink();
        objWhatWeOffer.Press_PrenatalYoga();
        String PageName13=objWhatWeOffer.Verify_PageName();
        Assert.assertEquals(PageName13, "Prenatal Yoga");
        System.out.println("Prenatal Yoga: " + PageName13);
        objTop.Press_WhatWeOfferLink();
        objWhatWeOffer.Press_RestorativeYoga();
        String PageName14=objWhatWeOffer.Verify_PageName();
        Assert.assertEquals(PageName14, "Restorative Yoga");
        System.out.println("Restorative Yoga: " + PageName14);
        objTop.Press_WhatWeOfferLink();
        objWhatWeOffer.Press_VinyasaYoga();
        String PageName15=objWhatWeOffer.Verify_PageName();
        Assert.assertEquals(PageName15, "Vinyasa Yoga");
        System.out.println("Vinyasa Yoga: " + PageName15);
        objTop.Press_WhatWeOfferLink();
        objWhatWeOffer.Press_YinYoga();
        String PageName16=objWhatWeOffer.Verify_PageName();
        Assert.assertEquals(PageName16, "Yin Yoga");
        System.out.println("Yin Yoga: " + PageName16);
    }

    @Test
    public void Verify_MeditationLinks(){
        WhatWeOfferPage objWhatWeOffer = new WhatWeOfferPage(driver);
        TopBar objTop = new TopBar(driver);
        objTop.Press_WhatWeOfferLink();
        objWhatWeOffer.Press_BreathingMeditation();
        String PageName1=objWhatWeOffer.Verify_PageName();
        Assert.assertEquals(PageName1, "Breathing Meditation (Pranayama)");
        System.out.println("Breathing Meditation (Pranayama): " + PageName1);
        objTop.Press_WhatWeOfferLink();
        objWhatWeOffer.Press_ChakraMeditation();
        String PageName2=objWhatWeOffer.Verify_PageName();
        Assert.assertEquals(PageName2, "Chakra Meditation");
        System.out.println("Chakra Meditation: " + PageName2);
        objTop.Press_WhatWeOfferLink();
        objWhatWeOffer.Press_GuidedVisualizationMeditation();
        String PageName3=objWhatWeOffer.Verify_PageName();
        Assert.assertEquals(PageName3, "Guided Visualization Meditation");
        System.out.println("Guided Visualization Meditation: " + PageName3);
        objTop.Press_WhatWeOfferLink();
        objWhatWeOffer.Press_MantraMeditation();
        String PageName4=objWhatWeOffer.Verify_PageName();
        Assert.assertEquals(PageName4, "Mantra Meditation");
        System.out.println("Mantra Meditation: " + PageName4);
        objTop.Press_WhatWeOfferLink();
        objWhatWeOffer.Press_MindfulnessMeditation();
        String PageName5=objWhatWeOffer.Verify_PageName();
        Assert.assertEquals(PageName5, "Mindfulness (Awareness) Meditation");
        System.out.println("Mindfulness (Awareness) Meditation: " + PageName5);
        objTop.Press_WhatWeOfferLink();
        objWhatWeOffer.Press_VipassanaMeditation();
        String PageName6=objWhatWeOffer.Verify_PageName();
        Assert.assertEquals(PageName6, "Vipassana Meditation");
        System.out.println("Vipassana Meditation: " + PageName6);
        objTop.Press_WhatWeOfferLink();
        objWhatWeOffer.Press_ZenMeditation();
        String PageName7=objWhatWeOffer.Verify_PageName();
        Assert.assertEquals(PageName7, "Zen (Zazen) Meditation");
        System.out.println("Zen (Zazen) Meditation: " + PageName7);
        objTop.Press_WhatWeOfferLink();

    }
}
