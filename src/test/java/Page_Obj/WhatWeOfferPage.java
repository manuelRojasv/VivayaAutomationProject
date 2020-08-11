package Page_Obj;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class WhatWeOfferPage {
    WebDriver driver;
    By Page_name=By.xpath("//h1");
    //yoga links
    By Anusara_yoga_link=By.linkText("Anusara Yoga");
    By Ashtanga_yoga_link=By.linkText("Ashtanga Yoga");
    By Family_yoga_link=By.linkText("Family Yoga");
    By Hatha_yoga_link=By.linkText("Hatha Yoga");
    By Iyengar_yoga_link=By.linkText("Iyengar Yoga");
    By Yin_yoga_link=By.linkText("Yin Yoga");
    By Jivamukti_yoga_link=By.linkText("Jivamukti Yoga");
    By Katonah_yoga_link=By.linkText("Katonah Yoga");
    By Kula_yoga_link=By.linkText("Kula Yoga");
    By Kundalini_yoga_link=By.linkText("Kundalini Yoga");
    By Nidra_yoga_link=By.linkText("Nidra Yoga");
    By Para_yoga_link=By.linkText("ParaYoga® Yoga");
    By Power_yoga_link=By.linkText("Power Yoga");
    By Prenatal_yoga_link=By.linkText("Prenatal Yoga");
    By Restorative_yoga_link=By.linkText("Restorative Yoga");
    By Vinyasa_yoga_link=By.linkText("Vinyasa Yoga");
    //meditation links
    By Breathing_link=By.linkText("Breathing Meditation (Pranayama)");
    By Chakra_link=By.linkText("Chakra Meditation");
    By Guided_visualization_link=By.linkText("Guided Visualization Meditation");
    By Mantra_link=By.linkText("Mantra Meditation");
    By Mindfulness_link=By.linkText("Mindfulness (Awareness) Meditation");
    By Vipassana_link=By.linkText("Vipassana Meditation");
    By Zen_link=By.linkText("Zen (Zazen) Meditation");


    public WhatWeOfferPage(WebDriver driver){this.driver = driver;}

    public String Verify_PageName(){
        return driver.findElement(Page_name).getText();
    }

    public void Press_AnusaraYoga(){driver.findElement(Anusara_yoga_link).click();}
    public void Press_AshtangaYoga(){driver.findElement(Ashtanga_yoga_link).click();}
    public void Press_FamilyYoga(){driver.findElement(Family_yoga_link).click();}
    public void Press_HathaYoga(){driver.findElement(Hatha_yoga_link).click();}
    public void Press_IyengarYoga(){driver.findElement(Iyengar_yoga_link).click();}
    public void Press_YinYoga(){driver.findElement(Yin_yoga_link).click();}
    public void Press_JivamuktiYoga(){driver.findElement(Jivamukti_yoga_link).click();}
    public void Press_KatonahYoga(){driver.findElement(Katonah_yoga_link).click();}
    public void Press_KulaYoga(){driver.findElement(Kula_yoga_link).click();}
    public void Press_KundaliniYoga(){driver.findElement(Kundalini_yoga_link).click();}
    public void Press_NidraYoga(){driver.findElement(Nidra_yoga_link).click();}
    public void Press_ParaYoga(){driver.findElement(Para_yoga_link).click();}
    public void Press_PowerYoga(){driver.findElement(Power_yoga_link).click();}
    public void Press_PrenatalYoga(){driver.findElement(Prenatal_yoga_link).click(); }
    public void Press_RestorativeYoga(){driver.findElement(Restorative_yoga_link).click();}
    public void Press_VinyasaYoga(){driver.findElement(Vinyasa_yoga_link).click();}

    public void Press_BreathingMeditation(){driver.findElement(Breathing_link).click();}
    public void Press_ChakraMeditation(){driver.findElement(Chakra_link).click();}
    public void Press_GuidedVisualizationMeditation(){driver.findElement(Guided_visualization_link).click();}
    public void Press_MantraMeditation(){driver.findElement(Mantra_link).click();}
    public void Press_MindfulnessMeditation(){driver.findElement(Mindfulness_link).click();}
    public void Press_VipassanaMeditation(){driver.findElement(Vipassana_link).click();}
    public void Press_ZenMeditation(){driver.findElement(Zen_link).click();}

}
