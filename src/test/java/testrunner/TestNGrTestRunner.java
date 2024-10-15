package testrunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;

import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features="src/test/java/featurefiles",glue="stepdefinitions",monochrome=true)
public class TestNGrTestRunner extends AbstractTestNGCucumberTests{

}
 