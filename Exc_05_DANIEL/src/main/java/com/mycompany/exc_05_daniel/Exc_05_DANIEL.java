/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.exc_05_daniel;

import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class Exc_05_DANIEL {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        int num;

        System.out.print("Digite um numero para exibir a sua tabuada: ");
        num = ler.nextInt();

        for (int i = 0; i <= 10; i++) {
            System.out.println(num + " x " + i + " = " + num*i);

        }

    }
}
