/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.cuentabancaria;

import java.util.Scanner;

public class CuentaBancaria {
    // Atributos
    private String titular;
    private double saldo;

    // Constructor
    public CuentaBancaria(String titular, double saldoInicial) {
        this.titular = titular;
        this.saldo = saldoInicial;
    }

    // Método para depositar una cantidad en la cuenta
    public void depositar(double cantidad) {
        if (cantidad > 0) {
            saldo += cantidad;
            System.out.println("Se han depositado " + cantidad + " unidades. Saldo actual: " + saldo);
        } else {
            System.out.println("La cantidad a depositar debe ser positiva.");
        }
    }

    // Método para retirar una cantidad de la cuenta
    public void retirar(double cantidad) {
        if (cantidad > 0) {
            if (cantidad <= saldo) {
                saldo -= cantidad;
                System.out.println("Se han retirado " + cantidad + " unidades. Saldo actual: " + saldo);
            } else {
                System.out.println("No se puede realizar la operacion. Saldo insuficiente.");
            }
        } else {
            System.out.println("La cantidad a retirar debe ser positiva.");
        }
    }

    // Método para consultar el saldo actual de la cuenta
    public void consultar_saldo() {
        System.out.println("El saldo actual es: " + saldo);
    }

    // Método principal para interactuar con el usuario
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Crear una cuenta bancaria con un saldo inicial
        System.out.print("Ingresa el nombre del titular de la cuenta: ");
        String titular = scanner.nextLine();
        System.out.print("Ingresa el saldo inicial de la cuenta: ");
        double saldoInicial = scanner.nextDouble();
        CuentaBancaria cuenta = new CuentaBancaria(titular, saldoInicial);

        // Menú de opciones
        int opcion;
        do {
            System.out.println("\nMenu de opciones:");
            System.out.println("1. Depositar");
            System.out.println("2. Retirar");
            System.out.println("3. Consultar saldo");
            System.out.println("4. Salir");
            System.out.print("Elige una opcion: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    System.out.print("Ingresa la cantidad a depositar: ");
                    double cantidadDepositar = scanner.nextDouble();
                    cuenta.depositar(cantidadDepositar);
                    break;
                case 2:
                    System.out.print("Ingresa la cantidad a retirar: ");
                    double cantidadRetirar = scanner.nextDouble();
                    cuenta.retirar(cantidadRetirar);
                    break;
                case 3:
                    cuenta.consultar_saldo();
                    break;
                case 4:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opcion no valida. Por favor, elige una opcion del 1 al 4.");
            }
        } while (opcion != 4);

        // Cerrar el objeto Scanner
        scanner.close();
    }
}
