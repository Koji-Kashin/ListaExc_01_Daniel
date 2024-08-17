/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.exc_13_daniel;

import java.util.Scanner;

/**
 *
 * @author d.rodrigues
 */
public class Exc_13_DANIEL {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.println("Digite o ano desejado, veremos se eh bissexto: ");
        int ano = ler.nextInt();
        if (ano%4==0 && ano%100 !=0) {
            System.out.println("O ano de "+ano+ " eh um ano bissexto!!");
            
        }
        else{
            System.out.println("O ano de "+ano+ " nao eh um ano bissexto!!");
    }

}
}
