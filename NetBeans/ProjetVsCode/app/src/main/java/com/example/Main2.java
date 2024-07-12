package com.example;
import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        int n1 = 0;
        int n2 = 0, n3 = 0, res=0;
        String nome ="";

        System.out.print("Digite seu nome: ");
        nome = scan.nextLine();
        System.out.print("Digite a primeira nota: ");
        n1 = scan.nextInt();
        System.out.print("Digite a segunda nota: ");
        n2 = scan.nextInt();
        System.out.print("Digite a terceira nota: ");
        n3 = scan.nextInt();
        res = (n1+n2+n3)/3;
        System.out.printf("%s, a média das notas %d e %d e %d é igual %d %n",nome, n1,n2,n3, res); 
        if (res >= 7){
            System.out.println("Situação: Aprovado");
        } else {
            System.out.println("Situação: Reprovado");
        }
        scan.close();
    }
    
}
