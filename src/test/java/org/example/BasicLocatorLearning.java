package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class BasicLocatorLearning extends BrowserSetup{
    @Test
    public void testPage() throws InterruptedException {
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
        String linkText = browser.findElement(By.partialLinkText("Free Access to InterviewQues")).getText();
        System.out.println(linkText);
        browser.findElement(By.linkText("Free Access to InterviewQues/ResumeAssistance/Material")).click();
        Thread.sleep(2000);

    }
}
