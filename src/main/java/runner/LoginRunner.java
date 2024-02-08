package runner;

import base.ProjectSpecificMethod;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = "src/main/java/features", glue = "pages", monochrome = true, publish = true)
public class LoginRunner extends ProjectSpecificMethod {

}
