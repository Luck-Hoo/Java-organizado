package com.example;
import java.util.Scanner;

public class Main4 {
    public static void main(String[] args){
        int n1,n2,n3, Nota;
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Defina o número da nota que você deseja cosultar: ");
        Nota = scan.nextInt();
        // int[] num = new int[5]; //Array é objeto no Java
        // num[0] = 10;
        int[] num = {1,2,3,4,5};
        System.out.printf("O valor da posição %d é: %d",Nota, num[Nota]);
    }
}
