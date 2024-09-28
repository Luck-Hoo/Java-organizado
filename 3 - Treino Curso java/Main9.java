

public class Main9 {
    public static void main(String[] args){

        Main9 main9Instance = new Main9(); //Método construtor que instnacia o objeto

        FunçõesCalc funçõesCalc = main9Instance.new FunçõesCalc(); //Método construtor que instnacia o objeto

        int resultado = funçõesCalc.soma(5, 5); //Chamada de método do Objeto

        System.out.println(resultado);
    }


    public class FunçõesCalc {
       public int soma(int n1, int n2){
           int res = n1+n2;
            return res;
        }
       public int Sub(int n1, int n2){
           int res = n1-n2;
            return res;
        }
       public int Mult(int n1, int n2){
           int res = n1*n2;
            return res;
        }
       public int Div(int n1, int n2){
           int res = n1/n2;
            return res;
        }
       public int Rest(int n1, int n2){
           int res = n1%n2;
            return res;
        }
       public int Exp(int n1, int n2){
           int res = (int) Math.pow(n1, n2);
            return res;
        }
    } 
}
