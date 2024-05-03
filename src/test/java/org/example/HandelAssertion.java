package org.example;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class HandelAssertion extends BrowserSetup{

    @Test
    public void testElement() throws InterruptedException {
        browser.get("https://rahulshettyacademy.com/AutomationPractice/");

        getElement(By.cssSelector("input[value='radio1']")).click();
        getElement(By.xpath("//input[@id='autocomplete']")).sendKeys("Hello");
        String optionName = getElement(By.xpath("//label[@for='bmw']")).getText();
        SoftAssert softAssert = new SoftAssert();
        Assert.assertEquals(optionName, "Option1");
        softAssert.assertEquals(optionName, "Option1");
        Assert.assertEquals(1, 1);
        getElement(By.xpath("//input[@id='autocomplete']")).clear();
        getElement(By.xpath("//input[@id='autocomplete']")).sendKeys("Hi");
        String placeholder = getElement(By.xpath("//input[@id='name']")).getAttribute("placeholder");
        System.out.println(placeholder);

        String fontSize = getElement(By.xpath("//a[@id='opentab']")).getCssValue("background-color");
        System.out.println(fontSize);
        Boolean isSelect = getElement(By.xpath("//input[@id='checkBoxOption2']")).isSelected();
        Assert.assertFalse(isSelect);
        getElement(By.xpath("//input[@id='checkBoxOption2']")).click();
        isSelect = getElement(By.xpath("//input[@id='checkBoxOption2']")).isSelected();

        Assert.assertTrue(isSelect);

        Boolean isDisplay = displayStatus(By.xpath("//input[@id='displayed-text']"));
        Assert.assertTrue(isDisplay);

        getElement(By.id("hide-textbox")).click();
        isDisplay = displayStatus(By.xpath("//input[@id='displayed-text']"));
        Assert.assertFalse(isDisplay);
        browser.get("https://www.google.com");
        System.out.println("-----------------------------------------");
        Boolean isEnable = getElement(By.xpath("//textarea[@id='APjFqb']")).isEnabled();
        Assert.assertTrue(isEnable);
        softAssert.assertAll();
    }

}
