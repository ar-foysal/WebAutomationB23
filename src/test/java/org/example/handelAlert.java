package org.example;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class handelAlert extends BrowserSetup {

    @Test
    public void test_Alert() throws InterruptedException {
        browser.get("https://the-internet.herokuapp.com/javascript_alerts");
        clickOnElemt(By.xpath("//button[@onclick='jsAlert()']"));
        Thread.sleep(2000);
        Alert alert = browser.switchTo().alert();
        System.out.println(alert.getText());
        alert.accept();
        Thread.sleep(2000);
        clickOnElemt(By.xpath("//button[@onclick='jsConfirm()']"));
        alert = browser.switchTo().alert();
        System.out.println(alert.getText());
        alert.accept();
        System.out.println(getElement(By.xpath("//p[@id='result']")).getText());

        clickOnElemt(By.xpath("//button[@onclick='jsConfirm()']"));
        alert = browser.switchTo().alert();
        System.out.println(alert.getText());
        alert.dismiss();
        System.out.println(getElement(By.xpath("//p[@id='result']")).getText());

        clickOnElemt(By.xpath("//button[@onclick='jsPrompt()']"));
        alert = browser.switchTo().alert();
        System.out.println(alert.getText());
        alert.dismiss();
        System.out.println(getElement(By.xpath("//p[@id='result']")).getText());

        clickOnElemt(By.xpath("//button[@onclick='jsPrompt()']"));
        alert = browser.switchTo().alert();
        System.out.println(alert.getText());
        alert.sendKeys("Hello");
        alert.accept();
        System.out.println(getElement(By.xpath("//p[@id='result']")).getText());
    }

}
