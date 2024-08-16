/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.exc_09_daniel;

import java.util.Scanner;

/**
 *
 * @author The Great Garibaldo
 */
public class Exc_09_DANIEL {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int cont = 0;

        System.out.print("Digite um numero: ");
        int num = ler.nextInt();
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                cont++;
            }

        }
        if (cont == 2) {
            System.out.println("O numero " + num + " eh primo");

        }
        else{
            System.out.println("O numero " +num+ " nao eh primo");
        }

    }
}
