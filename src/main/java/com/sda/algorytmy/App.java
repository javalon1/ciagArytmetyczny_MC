package com.sda.algorytmy;


import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Podaj pierwszy wyraz ciągu: ");
        int a = scan.nextInt();
        System.out.println("Podaj stały przyrost; ");
        int d = scan.nextInt();
        System.out.println("Podaj numer wyrazu do wygenerowania: ");
        int n = scan.nextInt();

       for(int i=a; i<=n; i++){
           System.out.print(a + (i - 1)*d);
       }
    }
}
