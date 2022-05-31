package ru.ValentinaKarnaukh.utils;

import org.openqa.selenium.WebDriver;

import java.util.ArrayList;

public class TabUtils {
    public static void switchToTheNextTab(WebDriver driver) {
        ArrayList<String> tabs = new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(tabs.get(1));
    }
}
