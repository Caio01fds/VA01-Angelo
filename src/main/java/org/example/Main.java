package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Calculadora calc = new Calculadora(80, 1.74);
        double resultado = calc.calcularIMC();

        System.out.print("O seu IMC é: " + String.format("%.2f", resultado));
    }
}