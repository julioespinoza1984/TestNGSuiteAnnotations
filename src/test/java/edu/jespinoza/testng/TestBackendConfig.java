package edu.jespinoza.testng;

import org.apache.log4j.Logger;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class TestBackendConfig {
    private static final Logger logger = Logger.getLogger(TestBackendConfig.class);

    @BeforeSuite
    public void beforeSuite() {
        logger.info("@BeforeSuite\n");
    }

    @AfterSuite
    public void afterSuite() {
        logger.info("@AfterSuite");
    }

    @BeforeTest
    public void beforeTest() {
        logger.info("@BeforeTest in TestBackendConfig");
    }

    @AfterTest
    public void afterTest() {
        logger.info("@AfterTest in TestBackendConfig\n");
    }
}