package com.quickstart.application;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;
import java.util.logging.*;
import org.junit.Test;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class ApplicationTest {
    private static final Logger LOG = Logger.getLogger(ApplicationTest.class.getName());
    
    public ApplicationTest() {
    }

    @Test
    public void testNullProperties() throws Exception {
        LOG.info("test null properties");
        new Application(null).launch();
    }

    @Test
    public void testLoadProperties() throws Exception {
        LOG.info("test small properties");
        final Properties properties = properties("app.test.properties");
        LOG.log(Level.INFO, "properties: [{0}]", properties);
        final String key = "message";
        assertTrue("properties should contain key [" + key + "]", properties.containsKey(key));
        final String expected = "Test Hello World";
        assertEquals(expected, properties.getProperty(key));
    }

    @Test
    public void testBasicUsage() throws Exception {
        LOG.info("test basic usage");
        new Application(properties("app.test.properties")).launch();
    }

    private Properties properties(String fileName) throws IOException {
        final InputStream in = inputStream(fileName);
        assertNotNull("can't open input file [" + fileName + "]", in);
        final Properties properties = new Properties();
        properties.load(in);
        in.close();
        return properties;
    }

    private InputStream inputStream(String fileName) {
        return ApplicationTest.class.getClassLoader().getResourceAsStream(fileName);
    }
}
