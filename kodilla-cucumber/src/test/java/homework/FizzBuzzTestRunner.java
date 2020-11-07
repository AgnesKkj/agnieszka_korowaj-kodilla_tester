package homework;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"src/test/resources/fizzBuzz/fizzBuzz.feature"}
)

public class FizzBuzzTestRunner {

}
