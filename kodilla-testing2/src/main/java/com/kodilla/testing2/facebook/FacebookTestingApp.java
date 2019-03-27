package com.kodilla.testing2.facebook;

import com.kodilla.testing2.config.WebDriverConfig;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class FacebookTestingApp {
    public static final String XPATH_WAIT_FOR_DAY = "//select[1]";
    public static final String XPATH_SELECT_DAY = "//div[contains(@class, \"_5k_5\")]/span/span/select[1]";
    public static final String XPATH_WAIT_FOR_MONTH = "//select[2]";
    public static final String XPATH_SELECT_MONTH = "//div[contains(@class, \"_5k_5\")]/span/span/select[2]";
    public static final String XPATH_WAIT_FOR_YEAR = "//select[3]";
    public static final String XPATH_SELECT_YEAR = "//div[contains(@class, \"_5k_5\")]/span/span/select[3]";

    public static void main(String[] args) {
        WebDriver driver = WebDriverConfig.getDriver(WebDriverConfig.CHROME);
        driver.get("https://pl-pl.facebook.com/");


        while (!driver.findElement(By.xpath(XPATH_WAIT_FOR_DAY)).isDisplayed()) ;

        WebElement selectCombo = driver.findElement(By.xpath(XPATH_SELECT_DAY));
        Select selectDay = new Select(selectCombo);
        selectDay.selectByIndex(2);

       while (!driver.findElement(By.xpath(XPATH_WAIT_FOR_MONTH)).isDisplayed()) ;

        WebElement selectCombo2 = driver.findElement(By.xpath(XPATH_SELECT_MONTH));
        Select selectMonth = new Select(selectCombo2);
        selectMonth.selectByIndex(11);

       while (!driver.findElement(By.xpath(XPATH_WAIT_FOR_YEAR)).isDisplayed()) ;

        WebElement selectCombo3 = driver.findElement(By.xpath(XPATH_SELECT_YEAR));
        Select selectYear = new Select(selectCombo3);
        selectYear.selectByValue("1999");
    }
}
