package steps;

import io.cucumber.java.en.Given;
import org.example.Calculadora;

public class CalculadoraSteps {
    private Calculadora calculadora;

    @Given("que tengo una calculadora")
    public void initializeCalculator() {
        calculadora = new Calculadora();
    }
}
