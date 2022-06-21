package org.example;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;


public class Hooks extends Utils {

    //Before and After methods from cucumber package
    DriverManager driverManager = new DriverManager();

    @Before //come from cucumber
    public void setUp(){
        driverManager.openBrowser();
    }

    @After //come from cucumber
    public void tearDown(Scenario scenario){

        if (scenario.isFailed()) {
            final byte[] screenshot = ((TakesScreenshot) driver)
                    .getScreenshotAs(OutputType.BYTES);

            //giving the name to screenshot
            //it will replace space with _
            String screenshotName = scenario.getName().replaceAll(" ", "_");

            //it will stick Screenshot with report if scenario fails
            scenario.attach(screenshot, "image/png", screenshotName); //stick it in the report
        }

        //Browser closed
        driverManager.closeBrowser();
    }

}
