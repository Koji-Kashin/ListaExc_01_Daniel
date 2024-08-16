/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.exc_19_daniel;

import java.util.Scanner;

/**
 *
 * @author The Great Garibaldo
 */
public class Exc_19_DANIEL {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int resultado = 1;

        System.out.println("Escreva a base: ");
        int base = ler.nextInt();
        System.out.println("Escreva o expoente desejado: ");
        int expo = ler.nextInt();

        for (int i = 0; i < expo; i++) {
            resultado = resultado * base;

        }
        System.out.print("O resultado de " + base + " elevado a " + expo + " eh:" + resultado);
    }
}
