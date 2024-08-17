/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.exc_04_daniel;

import java.util.Scanner;

/**
 *
 * @author d.rodrigues
 */
public class Exc_04_DANIEL {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        int senha_salva = 8004, senha_tentada = 0;
        String login_salvo = "Duck_Dodgers", login_tentado = "";
        int cont = 0;

        System.out.println("Faca login para continuar...");
        System.out.println("Digite seu login: ");
        login_tentado = ler.next();
        System.out.println("Digite sua senha: ");
        senha_tentada = ler.nextInt();

        if (login_tentado == login_salvo && senha_tentada == senha_salva) {
            System.out.println("Login valido bem-vindo!!");

        }

        while (cont < 3 && login_tentado != login_salvo && senha_tentada != senha_salva) {
            cont++;
            System.out.println("Login invalido tente novamente");
            System.out.println("Digite seu usuario: ");
            login_tentado = ler.next();
            System.out.println("Digite a sua senha: ");
            senha_tentada = ler.nextInt();

        }

        /*if (login_tentado == login_salvo && senha_tentada == senha_salva) {
            System.out.println("Login valido");
         */
    }

}
