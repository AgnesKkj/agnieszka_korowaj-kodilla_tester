package fizzBuzz;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"D:\\Kodilla\\kodilla-course\\kodilla-cucumber\\src\\test\\resources\\fizzBuzz\\fizz-buzz.feature"}
)

public class FizzBuzzTestRunner {
}
