package com.quickstart.application.testSuites;

import com.quickstart.application.examples.ApplicationTest;
import com.quickstart.application.examples.MainTest;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses({ApplicationTest.class, MainTest.class})
public class MainSuiteTest {
}
