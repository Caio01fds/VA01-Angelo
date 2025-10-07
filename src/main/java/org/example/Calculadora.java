package org.example;

public class Calculadora {

    public double peso;
    public double altura;

    public Calculadora(double peso, double altura) {
        this.peso = peso;
        this.altura = altura;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double calcularIMC (){
        return peso / (altura * altura);
    }
}
