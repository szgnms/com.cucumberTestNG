package runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;



import org.testng.annotations.DataProvider;


@CucumberOptions(
        plugin = {"pretty",
                "html:target/cucumber-reports/cucumber.html",
                "json:target/json-reports/cucumber.json",
                "testng:target/xml-report/cucumber.xml"
        },
        features = "src/test/resources/features",
        glue = "stepDefinitions",
        tags = "(@heroku)",
        dryRun = false
)

public class Runner extends AbstractTestNGCucumberTests {


    @Override
    @DataProvider(parallel = false)
    public Object[][] scenarios() {
        return super.scenarios();
    }




    }



