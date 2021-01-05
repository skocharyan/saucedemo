package org.example.factories;

import org.example.enums.DRIVERS;
import org.example.exceptions.DriverNotFoundException;
import org.example.listeners.WebDriverListener;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;

public class WebDriverFactory implements Factory{
    @Override
    public EventFiringWebDriver create(DRIVERS drivers) throws DriverNotFoundException {
        WebDriver driver ;
        switch (drivers){
            case CHROME: driver = new ChromeDriver(); break;
            case GECKO: driver = new FirefoxDriver(); break;
            case SAFARI: driver  = new SafariDriver() ; break;
            default: throw  new DriverNotFoundException();
        }
        EventFiringWebDriver eventFiringWebDriver =  new EventFiringWebDriver(driver);

        WebDriverListener webDriverListener = new WebDriverListener();
        eventFiringWebDriver.register(webDriverListener);
        return eventFiringWebDriver;

    }
}
