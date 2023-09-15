package com.kevinthegreat.kahootspam;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;

public class Kahoot {
    private final String tab;

    public Kahoot(WebDriver driver) {
        driver.switchTo().newWindow(WindowType.TAB);
        tab = driver.getWindowHandle();
    }
}
