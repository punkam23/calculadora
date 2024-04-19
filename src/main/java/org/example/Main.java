package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Bienvenidos a la calculadora!");
        Calculadora calculadora = new Calculadora();
        Scanner scanner = new Scanner(System.in);
        int userInput = iniciarOperacion(scanner);
        switch (userInput){
            case 1:
                sumatoria(scanner, calculadora);
                iniciarOperacion(scanner);
                break;
            case 2:
                scanner.close();
                break;
            default:
                iniciarOperacion(scanner);
                break;
        }

    }

    private static int iniciarOperacion(Scanner scanner) {
        System.out.println("Seleccione la operacion que desea hacer");
        System.out.println("1. Sumar");
        System.out.println("2. Salir");
        return scanner.nextInt();
    }

    private static void sumatoria(Scanner scanner, Calculadora calculadora) {
        System.out.println("Digite el primer numero que desea sumar");
        String primerDigito = scanner.nextLine();
        System.out.println("Digite el segundo numero que desea sumar");
        String segundoDigito = scanner.nextLine();
        int resultado = calculadora.add(Integer.parseInt(primerDigito),Integer.parseInt(segundoDigito));
        System.out.println("El resultado de la sumatoria es: " + resultado);
    }
}