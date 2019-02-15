package com.quickstart.application.testSuites;

import com.quickstart.application.examples.ApplicationTest;
import com.quickstart.application.examples.MainTest;
import java.util.Arrays;
import java.util.Collection;
import org.junit.jupiter.api.DynamicTest;
import org.junit.jupiter.api.TestFactory;
import org.junit.platform.runner.JUnitPlatform;
import org.junit.platform.suite.api.SelectClasses;
import org.junit.runner.RunWith;

import static org.junit.jupiter.api.DynamicTest.dynamicTest;

@RunWith(JUnitPlatform.class)
@SelectClasses({ApplicationTest.class, MainTest.class})
class MainSuiteTest {
//    @TestFactory
//    Collection<DynamicTest> testMain() {
//        MainTest mainTest = new MainTest();
//        return Arrays.asList(
//            dynamicTest("test basic", () -> mainTest.testBasic()),
//            dynamicTest("test main", () -> mainTest.testMain())
//        );
//    }
}
