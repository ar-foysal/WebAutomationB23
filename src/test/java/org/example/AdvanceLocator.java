package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.List;

public class AdvanceLocator extends BrowserSetup{

    @Test
    public void testPageLocator() throws InterruptedException {
        browser.get("https://rahulshettyacademy.com/AutomationPractice/");
        browser.findElement(By.cssSelector("input[value='radio2']")).click();
        Thread.sleep(1000);
        browser.findElement(By.xpath("//input[@value='radio3']")).click();
        Thread.sleep(1000);
        browser.findElement(By.cssSelector("#checkBoxOption1")).click();
        Thread.sleep(1000);
        browser.findElement(By.cssSelector(".radioButton")).click();
        Thread.sleep(2000);

        String h1TexT_CSS = browser.findElement(By.cssSelector("h1")).getText();
        System.out.println("GET BY CSS SELECTOR: " +h1TexT_CSS);
        String h1TexT_XPATH = browser.findElement(By.xpath("//h1")).getText();
        System.out.println("GET BY XPATH: "+h1TexT_XPATH);

        browser.findElement(By.xpath("//*[@value='radio3']")).click();
        Thread.sleep(1000);
        String text = browser.findElement(By.cssSelector("div[id='checkbox-example'] > fieldset > legend")).getText();
        System.out.println(text);

        text = browser.findElement(By.xpath("//div[@id='checkbox-example'] /fieldset /legend")).getText();
        System.out.println(text);

        browser.findElement(By.cssSelector("input[name='radioButton'][value='radio1']")).click();
        Thread.sleep(1000);
        browser.findElement(By.xpath("//input[@name='radioButton' and @value='radio2']")).click();
        Thread.sleep(1000);
        browser.findElement(By.cssSelector("input[placeholder^=\"Enter Your\"]")).sendKeys("Hello");
        Thread.sleep(1000);
        browser.findElement(By.xpath("//input[starts-with(@placeholder,\"Enter Your\")]")).sendKeys("Hello XPATH");
        Thread.sleep(1000);
        browser.findElement(By.cssSelector("input[placeholder*=\"Your Name\"]")).sendKeys("Hello");
        Thread.sleep(1000);
        browser.findElement(By.xpath("//input[contains(@placeholder,\"Your Name\")]")).sendKeys("Hello XPATH");
        Thread.sleep(1000);

        text = browser.findElement(By.xpath("//table[@name='courses'] //tr /th[1]")).getText();
        System.out.println(text);
        text = browser.findElement(By.xpath("//table[@name='courses'] //tr /th[2]")).getText();
        System.out.println(text);
        text = browser.findElement(By.xpath("//table[@name='courses'] //tr /th[last()]")).getText();
        System.out.println(text);

        text = browser.findElement(By.cssSelector("table[name='courses'] > tbody> tr > th:first-child")).getText();
        System.out.println(text);
        text = browser.findElement(By.cssSelector("table[name='courses'] > tbody> tr > th:nth-child(2)")).getText();
        System.out.println(text);
        text = browser.findElement(By.cssSelector("table[name='courses'] > tbody> tr > th:last-child")).getText();
        System.out.println(text);
        text = browser.findElement(By.xpath("//th[text()='Course'] /preceding-sibling::th")).getText();
        System.out.println(text);
        text = browser.findElement(By.xpath("//th[contains(text(),'Instructor')] /following-sibling::th[last()]")).getText();
        System.out.println(text);

        List<WebElement> tableData = browser.findElements(By.xpath("//table[@name='courses'] //td"));
        System.out.println(tableData.size());
        for (WebElement e : tableData){
            System.out.println(e.getText());
        }
    }
}
