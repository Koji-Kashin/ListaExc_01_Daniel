/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.exc_04_daniel;
import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class Exc_04_DANIEL {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        
        String user = "Koji";
        int senha_correta = 5044;
        int attempts = 0;
        boolean autenticador = false;
        
        while (attempts <3 && !autenticador){
            System.out.print("Digite o login: ");
            String login = ler.nextLine();
            
            System.out.print("Digite a senha: ");
            int senha = ler.nextInt();
            
            if(login == user && senha == senha_correta){
                autenticador = true;
                System.out.println("Login efetivado!");
            }
            else{
                attempts++ ;
                if (attempts < 3){
                    System.out.println("Usuario ou senha incorretos, tente novamente");
                    
                }
                    
                }
            }
            if(!autenticador){
                    System.out.println("Numero max. de tentativas, conta bloqueada");
        }
               
        
    }
}
