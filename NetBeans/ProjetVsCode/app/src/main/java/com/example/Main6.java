package com.example;
import java.util.Scanner;

public class Main6 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        final int tam = 5;
        char[] gabaritoProva = {'a','b','c','d','e'};
        char[] respostasAluno = new char[tam];

        System.out.println("Digite as respostas de sua prova: ");
        for (int i=0;i<tam;i++){
            System.out.printf("Questão %d: ", i + 1);
            respostasAluno[i] = scan.next().charAt(0);
        }
        int nota = 0;
        String[] notas = new String[tam];
        for (int i=0;i<tam;i++){
            
            if (gabaritoProva[i]==respostasAluno[i]){
                nota++;
                notas[i] = "Certa";
            } else {
                notas[i] = "Errada";
            }
        }
        System.out.printf("Sua nota final é: %d%n", nota);
        System.out.println("Resultado: ");
        for (int i = 0;i<tam;i++){
            System.out.printf("Questão %d foi %s%n", i+1, notas[i]);
        }
        
    scan.close();        

    }
}
