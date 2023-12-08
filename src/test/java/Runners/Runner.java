package Runners;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


    @CucumberOptions(


            features = {
                    "src/test/java/FeatureFiles/US1.feature",
                    "src/test/java/FeatureFiles/US2.feature",
                    "src/test/java/FeatureFiles/US3.feature",
                    "src/test/java/FeatureFiles/US5.feature",
                    "src/test/java/FeatureFiles/US7.feature",
                    "src/test/java/FeatureFiles/US8.feature",
                    "src/test/java/FeatureFiles/US9.feature",

            },
            glue = "StepDefinitions",
            plugin = {"pretty", "json:target/cucumber.json",},
            dryRun = false
    )

    public class Runner extends AbstractTestNGCucumberTests {

    }

