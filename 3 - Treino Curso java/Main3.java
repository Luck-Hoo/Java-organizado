import java.util.Scanner;

public class Main3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);


        int n1,n2,n3;
        // For é usado quando se sabe quantas vezes executado
        /* 
        for (int cont1=0; cont < 3 ; cont1++) {
            System.err.println(cont1 + " - Repetição FOR");
        }
        */
        System.out.print("Digite quantas repetições:");
        int max=scan.nextInt();
        int cont2 = 0;
        while (cont2<max) {
            System.out.println(cont2 + " - Repetição while");
            cont2++;
        }
        scan.close();
    }
}
