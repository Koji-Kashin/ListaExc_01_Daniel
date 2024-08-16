/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.exc_07_daniel;

import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class Exc_07_DANIEL {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        int num_Par = 0, num_Impar = 0;

        System.out.print("Digite um numero: ");
        int num = ler.nextInt();

        for (int i = 1; i <= num; i++) {
            if (i % 2 == 0) {
                num_Par++;
            } else {
                num_Impar++;

            }

        }
        System.out.println("Os numeros pares entre 1 e " + num + " é: " + num_Par);
        System.out.println("Os numeros impares entre 1 e " + num + " é: " + num_Impar);

    }
}
