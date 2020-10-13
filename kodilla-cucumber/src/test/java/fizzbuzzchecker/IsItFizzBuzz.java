package fizzbuzzchecker;

import io.cucumber.java8.En;
import org.junit.Assert;

public class IsItFizzBuzz implements En {

    private int number;
    private String result;

    public IsItFizzBuzz(){
        Given("Number is {int}", (Integer int1) -> {
            this.number = int1;
        });

        When("I ask if it's FizzBuzz", () -> {
            FizzBuzzChecker fizzBuzzChecker = new FizzBuzzChecker();
            this.result = fizzBuzzChecker.checkIfFizzBuzz(this.number);
        });

        Then("I should be told {string}", (String string) -> {
            Assert.assertEquals(string, this.result);
        });
    }

}