
import java.util.Arrays;

public class Main7 {
    public static void main(String[] args) {
        final int tam=10;
        int[] num={2,65,3,7,8,3,5};
        int[] numeros=new int[tam];
        int[] arrayTransp=new int[tam];
      

        //Organiza o array
        Arrays.sort(num);
        System.out.println(Arrays.toString(num));
        //Preenche o array
        Arrays.fill(numeros, 69);
        //Tranporta uma array para outra
        System.arraycopy(numeros, 0, arrayTransp, 0, tam);
        System.out.println(Arrays.toString(arrayTransp));
        //Comparar um array com outro
        System.out.println(Arrays.equals(numeros, arrayTransp));
        // Verifica se um valor está no array
        
        System.out.println(Arrays.binarySearch(num, 65) > 0? "esta " : "não esta");
        // Sintaxe própria de array, guarda cada um do vetor na variavel n
        for (int n:numeros){
            System.out.printf("%d - ",n);
        }
        
    }
}
