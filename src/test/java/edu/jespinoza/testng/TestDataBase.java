package edu.jespinoza.testng;

import org.apache.log4j.Logger;
import org.testng.annotations.Test;

public class TestDataBase {
    private static final Logger logger = Logger.getLogger(TestDataBase.class);

    @Test(groups= "database")
    public void testInsert(){
        logger.info("testInsert()");
    }

    @Test(groups= "database")
    public void testUpdate(){
        logger.info("testUpdate()");
    }

    @Test(groups= "database")
    public void testDelete(){
        logger.info("testDelete()");
    }
}