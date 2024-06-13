package dominos.runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
@RunWith(Cucumber.class)
@CucumberOptions(features ="C:\\Users\\seenu\\eclipse-workspace\\domisos"+"\\src\\test\\java\\com\\dominosFeature\\dominosFeature",
                 glue = {"com.Stepdef"},
                 publish = true,
                 dryRun = false,
                 monochrome = true,
                 plugin = {"pretty","json:target/JSONReport/report.json"})


public class Test_runner {

	

}
