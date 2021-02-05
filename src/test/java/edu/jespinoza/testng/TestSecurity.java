package edu.jespinoza.testng;

import org.apache.log4j.Logger;
import org.testng.annotations.Test;

public class TestSecurity {
    private static final Logger logger = Logger.getLogger(TestSecurity.class);

    @Test(groups= "security")
    public void accessHomePage() {
        logger.info("accessHomePage()");
    }

    @Test(groups= "security")
    public void accessAdminPage() {
        logger.info("accessAdminPage()");
    }
}