package com.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        int number;

        Scanner inputScanner = new Scanner(System.in);

        System.out.println("Escolha um número:");

        number = inputScanner.nextInt();

        inputScanner.close();

        System.out.println("====================");

        System.out.println("Fatorial de " + number + ":");

        int factorial = number;

        System.out.print("\n" + number + " ");
        for (int i = number - 1; i > 0; i--) {
            factorial = factorial * i;
            System.out.print("* " + i + " ");
        }

        System.out.print(" = " + factorial + "\n");

        System.out.println("====================");


    }
}