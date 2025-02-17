package com.voya.sample;

import org.junit.platform.runner.JUnitPlatform;
import org.junit.platform.suite.api.ExcludePackages;
import org.junit.platform.suite.api.ExcludeTags;
import org.junit.platform.suite.api.IncludePackages;
import org.junit.platform.suite.api.IncludeTags;
import org.junit.platform.suite.api.SelectClasses;
import org.junit.platform.suite.api.SelectPackages;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import com.voya.testcase.CalculatorTest;

//@RunWith(JUnitPlatform.class)
@RunWith(Suite.class)
@SuiteClasses({CalculatorTest.class})
@SelectPackages({"com.voya.testcase"})
//@IncludePackages({"com.voya.testcase.greet"})
//@ExcludePackages({"com.voya.testcase.greet"})
//@SelectClasses(CalculatorTest.class)
//@IncludeTags({"First","Simple","Neg"})
@ExcludeTags({"First"})
public class AllTests {

}
