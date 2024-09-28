import java.util.Scanner;
public class Main5 {
    public static void main(String[] args) {
        System.out.println("Digite a quantidade de linhas da pirâmide:");
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        for (int i=0;i<num;i++){
            for (int j=0;j<num - i -1;j++){
                System.out.print(" ");
               
            }
            for(int k=0;k<(2*i+1);k++){
                System.out.print("*");
            }
            System.out.println();
        }
        scan.close();
    }
       
}
