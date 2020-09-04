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
    //coaching links
    By Health_link=By.linkText("Health Coaching");
    By Life_link=By.linkText("Life Coaching");
    By Professional_link=By.linkText("Professional Coaching");
    By Trauma_link=By.linkText("Trauma Coaching");
    By Work_life_link=By.linkText("Work-Life Balance Coaching");
    //Restorative Fitness links
    By Calisthenics_link=By.linkText("Calisthenics");
    By Pilates_link=By.linkText("Pilates");
    By Stretching_link=By.linkText("Stretching");
    //Nutrition Links
    By Ayurveda_link=By.linkText("Ayurveda Nutrition");
    By Detox_link=By.linkText("Detox Nutrition");
    By Miscellaneous_link=By.linkText("Miscellaneous Nutrition");
    By Prenatal_link=By.linkText("Prenatal Nutrition");
    By Sports_link=By.linkText("Sports And Energy Nutrition");
    By Weight_link=By.linkText("Weight Management Nutrition");
    //Healing arts and reiki Links
    By Energy_link=By.linkText("Energy Healing");
    By Hypnosis_link=By.linkText("Hypnosis Healing");
    By Reiki_link=By.linkText("Reiki");
    By Shamanic_link=By.linkText("Shamanic Healing");
    By Sound_link=By.linkText("Sound Healing");
    By Theta_link=By.linkText("Theta Healing");
    //Astrology and spiritual counseling
    By Astrology_link=By.linkText("Astrology");
    By Numerology_link=By.linkText("Numerology");
    By Psychic_link=By.linkText("Psychic Readings");
    By Spiritual_link=By.linkText("Spiritual Counseling");
    By Tarot_link=By.linkText("Tarot");
    By Dance_link=By.linkText("Dance");
    By QiGong_link=By.linkText("Qi Gong");
    By SacredMovement_link=By.linkText("Sacred Movement");
    By Zumba_link=By.linkText("Zumba");

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

    public void Press_HealthCoaching(){driver.findElement(Health_link).click(); }
    public void Press_LifeCoaching(){driver.findElement(Life_link).click();}
    public void Press_ProfessionalCoaching(){driver.findElement(Professional_link).click();}
    public void Press_TraumaCoaching(){driver.findElement(Trauma_link).click();}
    public void Press_WorkLifeBalanceCoaching(){driver.findElement(Work_life_link).click();}

    public void Press_Calisthenics(){driver.findElement(Calisthenics_link).click();}
    public void Press_Pilates(){driver.findElement(Pilates_link).click();}
    public void Press_Stretching(){driver.findElement(Stretching_link).click();}

    public void Press_AyurvedaNutrition(){driver.findElement(Ayurveda_link).click();}
    public void Press_DetoxNutrition(){driver.findElement(Detox_link).click();}
    public void Press_MiscellaneousNutrition(){driver.findElement(Miscellaneous_link).click();}
    public void Press_PrenatalNutrition(){driver.findElement(Prenatal_link).click();}
    public void Press_SportsAndEnergyNutrition(){driver.findElement(Sports_link).click();}
    public void Press_WeightManagementNutrition(){driver.findElement(Weight_link).click();}

    public void Press_EnergyHealing(){driver.findElement(Energy_link).click();}
    public void Press_HypnosisHealing(){driver.findElement(Hypnosis_link).click();}
    public void Press_Reiki(){driver.findElement(Reiki_link).click();}
    public void Press_ShamanicHealing(){driver.findElement(Shamanic_link).click();}
    public void Press_SoundHealing(){driver.findElement(Sound_link).click();}
    public void Press_ThetaHealing(){driver.findElement(Theta_link).click();}

    public void Press_Astrology(){driver.findElement(Astrology_link).click();}
    public void Press_Numerology(){driver.findElement(Numerology_link).click();}
    public void Press_PsychicReadings(){driver.findElement(Psychic_link).click();}
    public void Press_SpiritualCounseling(){driver.findElement(Spiritual_link).click();}
    public void Press_Tarot(){driver.findElement(Tarot_link).click();}

    public void Press_Dance(){driver.findElement(Dance_link).click();}
    public void Press_QiGong(){driver.findElement(QiGong_link).click();}
    public void Press_SacredMovement(){driver.findElement(SacredMovement_link).click();}
    public void Press_Zumba(){driver.findElement(Zumba_link).click();}

}
