/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.exc_06_daniel;

import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class Exc_06_DANIEL {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.print("Calculo de IMC, primeiro digite o seu peso: ");
        float peso = ler.nextFloat();

        System.out.println();

        System.out.print("Agora digite a sua altura: ");
        float altura = ler.nextFloat();
        
        float imc = peso / (altura * 2);
        
        System.out.println();
        
        System.out.println("Seu imc eh: " + imc);
        
        if (imc < 18.5){
            System.out.println("Voce esta abaixo do peso ideal");
        }
        else if (imc <= 24.99){
            System.out.println("Voce esta no peso ideal");
        }
        else if (imc <= 30){
            System.out.println("Voce esta acima do peso");
        }
        else if (imc <= 35){
            System.out.println("Voce esta com obesidade Grau I");
        }
        else if (imc <= 40){
            System.out.println("Voce esta com obesidade Grau II");
        }
        else if (imc > 40)
            System.out.println("Voce esta com obesidade Grau II");
    }
}
