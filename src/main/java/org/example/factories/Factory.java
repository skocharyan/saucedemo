package org.example.factories;

import org.example.enums.DRIVERS;
import org.example.exceptions.DriverNotFoundException;
import org.openqa.selenium.support.events.EventFiringWebDriver;

public interface Factory {
  EventFiringWebDriver create(DRIVERS drivers) throws DriverNotFoundException;
}
