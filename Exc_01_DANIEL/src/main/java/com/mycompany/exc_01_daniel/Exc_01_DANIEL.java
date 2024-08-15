/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.exc_01_daniel;

import java.util.Scanner;

/**
 *
 * @author d.rodrigues
 */
public class Exc_01_DANIEL {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        float n1, n2, n3, media;               
               
        System.out.print("Digite a primeira nota: ");
        n1 = ler.nextFloat();
        System.out.println();
        
        System.out.print("Digite a segunda nota: ");
        n2 = ler.nextFloat();
        System.out.println();
        
        
        System.out.print("Digite a terceira nota: ");
        n3 = ler.nextFloat();
        System.out.println();
        
        media = (n1 + n2 + n3) / 3;
        
        if (media >= 7){
            System.out.println("Parabéns voce esta aprovado!");
        }
        else if (media <7 && media >=5){
            System.out.println("Voce esta de recuperacao");
        }
        else{
            System.out.println("Voce está reprovado!");
        }
         
       
    }
}
