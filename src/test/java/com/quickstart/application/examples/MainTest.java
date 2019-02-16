package com.quickstart.application.examples;

import com.quickstart.application.Main;
import org.junit.Test;

import java.io.IOException;

import static org.junit.Assert.*;

public class MainTest {
    /** */
    private static final String[] ARGS = {"src/test/resources/app.properties"};

    /** */
    @Test
    public void testBasic() throws IOException {
        final String testKey = "message";

        assertNull(new Main(null, null).configure());

        assertNull(new Main(null, null).configure(testKey));

        assertNull(new Main(MainTest.class, null).configure(testKey));

        assertNull(new Main(null, new String[] {}).configure(testKey));

        assertNull(new Main(null, new String[] {"src/test/resources/app.test.properties"})
            .configure(testKey));

        assertEquals("test property by key [" + testKey + "]", "Test Hello World",
            new Main(MainTest.class, new String[] {"src/test/resources/app.test.properties"})
                .configure(testKey).getProperty(testKey));
    }
}
