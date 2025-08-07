package  runners;

import  io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import  org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features  = "src/main/java/api/client/features/post_api_test.feature",
        glue  =  {"stepdefinitions/PostApiTestSteps"},
        plugin  =  {"pretty",  "html:target/cucumber-html-report"}
)
public  class  TestRunner {
}