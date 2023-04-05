package com.example;

import java.util.Scanner;

public class PalavraInvertida {

    static void start(){
        Scanner input = new Scanner(System.in);
        System.out.print("Digite uma palavra: ");
        String palavra = input.nextLine();
        String palavraInvertida = "";

        for (int i = palavra.length() - 1; i >= 0; i--) {
            palavraInvertida += palavra.charAt(i);
        }

        System.out.println("Palavra invertida: " + palavraInvertida);
    }
    }
    

