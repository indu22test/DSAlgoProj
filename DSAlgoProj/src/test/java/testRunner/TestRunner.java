
  package testRunner;

import org.testng.annotations.DataProvider;


import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;



@CucumberOptions(
monochrome = false,
   plugin = { "pretty", "io.qameta.allure.cucumber7jvm.AllureCucumber7Jvm","json:target/cucumber.json"},
   
features = { "src/test/java/features" }, // location of feature files
glue = "stepDefinitions", // location of step definition files

       dryRun = false)
public class TestRunner extends AbstractTestNGCucumberTests {

@DataProvider(parallel = false)
public Object[][] scenarios() {

return super.scenarios();
}


}

