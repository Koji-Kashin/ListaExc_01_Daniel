/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.exc_03_daniel;

import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class Exc_03_DANIEL {

    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);

        float n1, n2, resultado;
        int opcao;

        System.out.println("Calculadora Master!!");
        System.out.println("Digite a opcao desejada...");
        System.out.print("1 - Adicao   2 - Subtracao   3 - Multiplicacao");
        System.out.print("   4 - Divisao: ");
        opcao = ler.nextInt();

        System.out.println();

        System.out.print("Agora digite o primeiro numero: ");
        n1 = ler.nextFloat();
        System.out.println();
        System.out.print("Agora digite o segundo numero: ");
        n2 = ler.nextFloat();
        System.out.println();

        if (opcao == 1) {
            System.out.println("O resultado da soma eh: " + (n1 + n2));
        } else if (opcao == 2) {
            System.out.println("O resultado da subtracao eh: " + (n1 - n2));
        } else if (opcao == 3) {
            System.out.println("O resultado da multiplicacao eh: " + (n1 * n2));

        } else if (opcao == 4) {
            System.out.println("O resultado da divisao eh: " + (n1 / n2));
        }

    }

}
