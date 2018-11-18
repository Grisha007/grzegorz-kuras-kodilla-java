package com.kodilla.testing2.facebook;

import com.kodilla.testing2.config.WebDriverConfig;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class FacebookTestingApp {
    public static final String XPATH_WAIT_FOR = "//select";
    public static final String XPATH_DAY_SELECT = "//div[contains(@class, \"_5k_5\")]/span/span/select[1]";
    public static final String XPATH_MONTH_SELECT = "//div[contains(@class, \"_5k_5\")]/span/span/select[2]";
    public static final String XPATH_YEAR_SELECT = "//div[contains(@class, \"_5k_5\")]/span/span/select[3]";

    public static void main(String[] args) {
        WebDriver driver = WebDriverConfig.getDriver(WebDriverConfig.CHROME);
        driver.get("https://www.facebook.com/");

        while (!driver.findElement(By.xpath(XPATH_WAIT_FOR)).isDisplayed());

        WebElement selectComboDay = driver.findElement(By.xpath(XPATH_DAY_SELECT));
        Select selectDay = new Select(selectComboDay);
        selectDay.selectByIndex(7);

        WebElement selectComboMonth = driver.findElement(By.xpath(XPATH_MONTH_SELECT));
        Select selectMonth = new Select(selectComboMonth);
        selectMonth.selectByIndex(7);

        WebElement selectComboYear = driver.findElement(By.xpath(XPATH_YEAR_SELECT));
        Select selectYear = new Select(selectComboYear);
        selectYear.selectByIndex(42);
    }
}
