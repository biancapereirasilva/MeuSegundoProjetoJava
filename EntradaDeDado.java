package br.com.fiap;

import java.util.Scanner;

public class EntradaDeDado {
    public static void main(String[] args) {
        int num1, num2, resultado;
        Scanner scan; // declarando um objeto dessa classe
        try {
            scan = new Scanner(System.in); // instaciação, entrando no sistema com "in"
            System.out.println("Digite um número inteiro: ");
            num1 = scan.nextInt(); // tudo que a gente digita no console é texto
            System.out.println("Digite outro número inteiro: ");
            num2 = scan.nextInt();
            resultado = num1 + num2;
            System.out.println("Valor 1: " + num1 + "\nValor 2: " + num2 + "\nSomatório: " + resultado);
            // para concatenar usa-se () e o símbolo de "+"
        } catch (Exception e) { // mensagem de erro
            System.out.println("Formato de número incorreto.");

        }

    }
}
