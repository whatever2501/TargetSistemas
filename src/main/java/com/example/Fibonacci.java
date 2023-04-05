package com.example;
import java.util.Scanner;

public class Fibonacci {
    static void start(){
        Scanner input = new Scanner(System.in);
        System.out.print("Digite um número inteiro: ");
        int num = input.nextInt();
        boolean pertence = false;
        int anterior = 0;
        int atual = 1;
        while (atual <= num) {
            if (atual == num) {
                pertence = true;
                break;
            }
            int proximo = anterior + atual;
            anterior = atual;
            atual = proximo;
        }
        if (pertence) {
            System.out.println(num + " pertence à sequência de Fibonacci.");
        } else {
            System.out.println(num + " não pertence à sequência de Fibonacci.");
        }

    }
        
}
    

