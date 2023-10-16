
  package testRunner;
  
  import org.junit.runner.RunWith;
  
  import io.cucumber.junit.Cucumber; import io.cucumber.junit.CucumberOptions;
  
  
  @RunWith(Cucumber.class)
  
  @CucumberOptions(
		  plugin={"pretty", "html:target/MyReports/report.html",
				  "junit:target/MyReports/report.junit",
				  "io.qameta.allure.cucumber7jvm.AllureCucumber7Jvm",
				  "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"},
  
 
  monochrome=false,  
  features= {"src/test/resource/features"}, 
  glue= "stepDefinitions",
  dryRun= false)
  
   public class TestRunner {
  
  }
 


	/*
	 * package testRunner;
	 * 
	 * import org.junit.runner.RunWith;
	 * 
	 * import io.cucumber.junit.Cucumber; import io.cucumber.junit.CucumberOptions;
	 * 
	 * 
	 * @RunWith(Cucumber.class)
	 * 
	 * @CucumberOptions(
	 * 
	 * 
	 * plugin={"pretty", "html:target/MyReports/report.html",
	 * "junit:target/MyReports/report.junit",
	 * "io.qameta.allure.cucumber7jvm.AllureCucumber7Jvm",
	 * "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"},
	 * monochrome=false, tags ="@DataStructure" , features=
	 * {"src/test/resource/features"}, glue= "stepdefinitions", dryRun= false)
	 * 
	 * public class TestRunner {
	 * 
	 * }
	 * 
	 * 
	 */