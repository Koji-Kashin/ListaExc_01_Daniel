/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.exc_02_daniel;
import java.util.Scanner;
import java.util.Random;



/**
 *
 * @author d.rodrigues
 */
public class Exc_02_Daniel {

    public static void main(String[] args) {
        
        Scanner ler = new Scanner(System.in);
        int num_sorteado, guess, tentativas;
        
        Random gerador_random = new Random(100); 
        num_sorteado = gerador_random.nextInt(100) + 1;   
                
        tentativas = 0;
        
        while (tentativas < 20){
        System.out.print("Pensei em um numero entre 0 e 100, tente adivinhar :) : ");
        guess = ler.nextInt();
        
        if (guess < num_sorteado){
            System.out.println("Ops ainda nao, tente um numero maior ;) : ");
            
        }
        else if(guess > num_sorteado){
            System.out.println("Ops not yet, tente um numero menor ;) ");
            
        }   
        else{
            System.out.println("Parabens, voce acertou!!");
            
            
        }
        }
                
        
        
                
        
        
        
    }
}
