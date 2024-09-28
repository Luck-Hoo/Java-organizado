package treinos.esparsos;

public class App4 {
    private int x = 7;

    public class App5 {
        int y = App4.this.x;

        public void pegarX() {
            int y = App4.this.x; // caso eu nao use o x para nada, devo atribui-lo
            System.out.println("Valor de X é " + App4.this.x); // Se tiver em função ou bloco de codigo, posso colocar
            // direto
        }
    }

    public class App6 extends App5 {
        int z = y + y;
    }
}
