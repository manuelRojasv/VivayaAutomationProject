package VivayaTests;

import Page_Obj.TopBar;
import Page_Obj.WhatWeOfferPage;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
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

    @Test (priority = 0, enabled = true)
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

    @Test (priority = 1, enabled = true)
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
    }

    @Test (priority = 2, enabled = true)
    public void Verify_CoachingLinks(){
        WhatWeOfferPage objWhatWeOffer = new WhatWeOfferPage(driver);
        TopBar objTop = new TopBar(driver);
        objTop.Press_WhatWeOfferLink();
        objWhatWeOffer.Press_HealthCoaching();
        String PageName1=objWhatWeOffer.Verify_PageName();
        Assert.assertEquals(PageName1, "Health Coaching");
        System.out.println("Health Coaching: " + PageName1);
        objTop.Press_WhatWeOfferLink();
        objWhatWeOffer.Press_LifeCoaching();
        String PageName2=objWhatWeOffer.Verify_PageName();
        Assert.assertEquals(PageName2, "Life Coaching");
        System.out.println("Life Coaching: " + PageName2);
        objTop.Press_WhatWeOfferLink();
        objWhatWeOffer.Press_ProfessionalCoaching();
        String PageName3=objWhatWeOffer.Verify_PageName();
        Assert.assertEquals(PageName3, "Professional Coaching");
        System.out.println("Professional Coaching: " + PageName3);
        objTop.Press_WhatWeOfferLink();
        objWhatWeOffer.Press_TraumaCoaching();
        String PageName4=objWhatWeOffer.Verify_PageName();
        Assert.assertEquals(PageName4, "Trauma Coaching");
        System.out.println("Trauma Coaching: " + PageName4);
        objTop.Press_WhatWeOfferLink();
        objWhatWeOffer.Press_WorkLifeBalanceCoaching();
        String PageName5=objWhatWeOffer.Verify_PageName();
        Assert.assertEquals(PageName5, "Work-Life Balance Coaching");
        System.out.println("Work-Life Balance Coaching: " + PageName5);

    }

    @Test (priority = 3, enabled = true)
    public void Verify_RestorativeFitnessLinks(){
        WhatWeOfferPage objWhatWeOffer = new WhatWeOfferPage(driver);
        TopBar objTop = new TopBar(driver);
        objTop.Press_WhatWeOfferLink();
        objWhatWeOffer.Press_Calisthenics();
        String PageName1=objWhatWeOffer.Verify_PageName();
        Assert.assertEquals(PageName1, "Calisthenics");
        System.out.println("Calisthenics: " + PageName1);
        objTop.Press_WhatWeOfferLink();
        objWhatWeOffer.Press_Pilates();
        String PageName2=objWhatWeOffer.Verify_PageName();
        Assert.assertEquals(PageName2, "Pilates");
        System.out.println("Pilates: " + PageName2);
        objTop.Press_WhatWeOfferLink();
        objWhatWeOffer.Press_Stretching();
        String PageName3=objWhatWeOffer.Verify_PageName();
        Assert.assertEquals(PageName3, "Stretching");
        System.out.println("Stretching: " + PageName3);
    }

    @Test (priority = 4, enabled = true)
    public void Verify_NutritionLinks(){
        WhatWeOfferPage objWhatWeOffer = new WhatWeOfferPage(driver);
        TopBar objTop = new TopBar(driver);
        objTop.Press_WhatWeOfferLink();
        objWhatWeOffer.Press_AyurvedaNutrition();
        String PageName1=objWhatWeOffer.Verify_PageName();
        Assert.assertEquals(PageName1, "Ayurveda Nutrition");
        System.out.println("Ayurveda Nutrition: " + PageName1);
        objTop.Press_WhatWeOfferLink();
        objWhatWeOffer.Press_DetoxNutrition();
        String PageName2=objWhatWeOffer.Verify_PageName();
        Assert.assertEquals(PageName2, "Detox Nutrition");
        System.out.println("Detox Nutrition: " + PageName2);
        objTop.Press_WhatWeOfferLink();
        objWhatWeOffer.Press_MiscellaneousNutrition();
        String PageName3=objWhatWeOffer.Verify_PageName();
        Assert.assertEquals(PageName3, "Miscellaneous Nutrition");
        System.out.println("Miscellaneous Nutrition: " + PageName3);
        objTop.Press_WhatWeOfferLink();
        objWhatWeOffer.Press_PrenatalNutrition();
        String PageName4=objWhatWeOffer.Verify_PageName();
        Assert.assertEquals(PageName4, "Prenatal Nutrition");
        System.out.println("Prenatal Nutrition: " + PageName4);
        objTop.Press_WhatWeOfferLink();
        objWhatWeOffer.Press_SportsAndEnergyNutrition();
        String PageName5=objWhatWeOffer.Verify_PageName();
        Assert.assertEquals(PageName5, "Sports And Energy Nutrition");
        System.out.println("Sports And Energy Nutrition: " + PageName5);
        objTop.Press_WhatWeOfferLink();
        objWhatWeOffer.Press_WeightManagementNutrition();
        String PageName6=objWhatWeOffer.Verify_PageName();
        Assert.assertEquals(PageName6, "Weight Management Nutrition");
        System.out.println("Weight Management Nutrition: " + PageName6);
    }
    @Test (priority = 5, enabled = true)
    public void Verify_HealingArtsLinks(){
        WhatWeOfferPage objWhatWeOffer = new WhatWeOfferPage(driver);
        TopBar objTop = new TopBar(driver);
        objTop.Press_WhatWeOfferLink();
        objWhatWeOffer.Press_EnergyHealing();
        String PageName1=objWhatWeOffer.Verify_PageName();
        Assert.assertEquals(PageName1, "Energy Healing");
        System.out.println("Energy Healing: " + PageName1);
        objTop.Press_WhatWeOfferLink();
        objWhatWeOffer.Press_HypnosisHealing();
        String PageName2=objWhatWeOffer.Verify_PageName();
        Assert.assertEquals(PageName2, "Hypnosis Healing");
        System.out.println("Hypnosis Healing: " + PageName2);
        objTop.Press_WhatWeOfferLink();
        objWhatWeOffer.Press_Reiki();
        String PageName3=objWhatWeOffer.Verify_PageName();
        Assert.assertEquals(PageName3, "Reiki");
        System.out.println("Reiki: " + PageName3);
        objTop.Press_WhatWeOfferLink();
        objWhatWeOffer.Press_ShamanicHealing();
        String PageName4=objWhatWeOffer.Verify_PageName();
        Assert.assertEquals(PageName4, "Shamanic Healing");
        System.out.println("Shamanic Healing: " + PageName4);
        objTop.Press_WhatWeOfferLink();
        objWhatWeOffer.Press_SoundHealing();
        String PageName5=objWhatWeOffer.Verify_PageName();
        Assert.assertEquals(PageName5, "Sound Healing");
        System.out.println("Sound Healing: " + PageName5);
        objTop.Press_WhatWeOfferLink();
        objWhatWeOffer.Press_ThetaHealing();
        String PageName6=objWhatWeOffer.Verify_PageName();
        Assert.assertEquals(PageName6, "Theta Healing");
        System.out.println("Theta Healing: " + PageName6);
    }

    @Test (priority = 6, enabled = true)
    public void Verify_AstrologyLinks(){
        WhatWeOfferPage objWhatWeOffer = new WhatWeOfferPage(driver);
        TopBar objTop = new TopBar(driver);
        objTop.Press_WhatWeOfferLink();
        objWhatWeOffer.Press_Astrology();
        String PageName1=objWhatWeOffer.Verify_PageName();
        Assert.assertEquals(PageName1, "Astrology");
        System.out.println("Astrology: " + PageName1);
        objTop.Press_WhatWeOfferLink();
        objWhatWeOffer.Press_Numerology();
        String PageName2=objWhatWeOffer.Verify_PageName();
        Assert.assertEquals(PageName2, "Numerology");
        System.out.println("Numerology: " + PageName2);
        objTop.Press_WhatWeOfferLink();
        objWhatWeOffer.Press_PsychicReadings();
        String PageName3=objWhatWeOffer.Verify_PageName();
        Assert.assertEquals(PageName3, "Psychic Readings");
        System.out.println("Psychic Readings: " + PageName3);
        objTop.Press_WhatWeOfferLink();
        objWhatWeOffer.Press_SpiritualCounseling();
        String PageName4=objWhatWeOffer.Verify_PageName();
        Assert.assertEquals(PageName4, "Spiritual Counseling");
        System.out.println("Spiritual Counseling: " + PageName4);
        objTop.Press_WhatWeOfferLink();
        objWhatWeOffer.Press_Tarot();
        String PageName5=objWhatWeOffer.Verify_PageName();
        Assert.assertEquals(PageName5, "Tarot");
        System.out.println("Tarot: " + PageName5);
    }

    @AfterClass
    public void close(){
        driver.close();
    }

}
