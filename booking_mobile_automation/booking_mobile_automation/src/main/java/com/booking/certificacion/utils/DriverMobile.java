package com.booking.certificacion.utils;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

public class DriverMobile {

    public static WebDriver booking() {
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("deviceName", "Galaxy A31");
        capabilities.setCapability("platformName", "Android");
        capabilities.setCapability("platformVersion", "11");
        capabilities.setCapability("appPackage", "com.booking");
        capabilities.setCapability("appActivity", "com.booking.identity.guest.AuthGuestActivity");
        capabilities.setCapability("noReset", false);
        try {
            return new AndroidDriver<>(new URL("http://localhost:4723/wd/hub"), capabilities);
        } catch (MalformedURLException e) {
            e.printStackTrace();
            return null;
        }
    }
}
