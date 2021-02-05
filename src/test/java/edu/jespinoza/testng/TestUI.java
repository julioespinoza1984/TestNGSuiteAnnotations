package edu.jespinoza.testng;

import org.apache.log4j.Logger;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestUI {
    private static final Logger logger = Logger.getLogger(TestUI.class);

    @BeforeTest
    public void beforeTest() {
        logger.info("@BeforeTest in TestUI");
    }

    @AfterTest
    public void afterTest() {
        logger.info("@AfterTest in TestUI\n");
    }

    @Test(groups= "ui")
    public void openConfirmationDialog() {
        logger.info("openConfirmationDialog()");
    }

    @Test(groups= "ui")
    public void openFileDialog() {
        logger.info("openFileDialog()");
    }
}