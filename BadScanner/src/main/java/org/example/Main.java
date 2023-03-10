package org.example;


import java.util.Scanner;
public class BadScanner{
    String nextLine() {
        Scanner scanner = new Scanner(System.in);
        String texto = scanner.nextLine();



        return texto;
    }
}






public class Main {
    public static void main(String[] args) {
        BadScanner badScanner = new BadScanner();

        System.out.println("Inbtroc");

        String texto = badScanner.nextLine();

        System.out.println(texto);
    }
}