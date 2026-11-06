package br.pucrs.gcs;

public class App {
    public static void main(String[] args) {
        Calculadora calc = new Calculadora();
        System.out.println("2 + 3 = " + calc.somar(2, 3));
        System.out.println("10 / 2 = " + calc.dividir(10, 2));
    }
}
