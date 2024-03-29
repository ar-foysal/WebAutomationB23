package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class BasicLocatorLearning {
    @Test
    public void testPage() throws InterruptedException {
        WebDriver browser = new ChromeDriver();
        browser.get("https://rahulshettyacademy.com/AutomationPractice/");
        WebElement autocompleteTextBox = browser.findElement(By.id("autocomplete"));
        autocompleteTextBox.sendKeys("Hello");
        WebElement option1 =  browser.findElement(By.name("checkBoxOption1"));
        option1.click();
        WebElement radioBtn =  browser.findElement(By.className("radioButton"));
        radioBtn.click();
        WebElement title = browser.findElement(By.tagName("h1"));
        System.out.println(title.getText());
        Thread.sleep(2000);
        browser.findElement(By.cssSelector("input[value='radio2']")).click();
        Thread.sleep(2000);
        browser.findElement(By.xpath("//input[@value='radio3']")).click();
        Thread.sleep(2000);
//      browser.findElem2ent(By.linkText("Free Access to InterviewQues/ResumeAssistance/Material")).click();
        browser.findElement(By.partialLinkText("Free Access to InterviewQues")).click();
        Thread.sleep(5000);
        browser.quit();
    }
}
