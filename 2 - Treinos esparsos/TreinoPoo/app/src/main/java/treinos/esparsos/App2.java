package treinos.esparsos;

public class App2 {
    public String var1 = "Olá, mundo";
}

class App3 {
    private String x = "Teste";

    class Teste {
        public Teste(App2 obj) {
            String var = obj.var1;
        }
    }

    class Pai {
        int teste = 5;

        // App3 app3 = new App3();
        // app3.x;
        // EU DEVO CRIAR UM MÉTODO PARA ACESSAR
        public String acessaX() {
            return App3.this.x;
        }
    }

    class Filho extends Pai { // a herança faz com que todos métodos e atributos do Pai estejam no Filho
        int teste2 = 10;

        public void mostrarX() {
            System.out.println("O valor de X, pego da classe Pai, que pegou da classe maior, é: " + acessaX());
        }
    }
}
