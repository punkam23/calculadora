package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import org.example.Calculadora;
import static org.junit.Assert.assertEquals;

public class CalculadoraSteps {
    private Calculadora calculadora;
    private int result;

    @Given("que tengo una calculadora")
    public void initializeCalculator() {
        calculadora = new Calculadora();
    }

    @When("sumo el numero {int} y {int}")
    public void addNumbers(int number1, int number2) {

        result = calculadora.add(number1, number2);
    }

    @When("multiplico el numero {int} y {int}")
    public void multiplyNumbers(int number1, int number2) {

        result = calculadora.mult(number1, number2);
    }

    @When("resto el numero {int} y {int}")
    public void subNumbers(int number1, int number2) {

        result = calculadora.sub(number1, number2);
    }

    @When("divido el numero {int} y {int}")
    public void divNumbers(int number1, int number2) {

        result = calculadora.div(number1, number2);
    }

    @Then("proceso el resultado {int}")
    public void processResult(int expected) {
        assertEquals(expected, result);
    }

}
