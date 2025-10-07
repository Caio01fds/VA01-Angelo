package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CalculadoraTest {
    @Test
    void deveSomarCorretamente() {
        Calculadora calc = new Calculadora(80, 1.74);
        double resultado = calc.calcularIMC();
        assertEquals(26.42, resultado, 0.01, "A soma deve ser igual a 26.42");
    }
}
