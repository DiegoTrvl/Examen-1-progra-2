/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.calcularedad;

import java.util.Scanner;
import java.time.Year;

public class CalcularEdad {
    public static void main(String[] args) {
        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Pedir al usuario que ingrese su año de nacimiento
        System.out.print("Por favor, ingresa tu year de nacimiento: ");
        int anioNacimiento = scanner.nextInt();

        // Obtener el año actual
        int anioActual = Year.now().getValue();

        // Calcular la edad del usuario
        int edad = anioActual - anioNacimiento;

        // Verificar si el usuario es mayor de 30 años
        if (edad > 30) {
            System.out.println("Tienes " + edad + " years. Eres mayor de 30 years old.");
        } else {
            System.out.println("Tienes " + edad + " years. No eres mayor de 30 years old.");
        }
        // puse años en ingles porque suena raro de otra forma :)
        // Cerrar el objeto Scanner
        scanner.close();
    }
}
