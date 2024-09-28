import javax.swing.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Revisando");
        try (Scanner ler = new Scanner(System.in)) {

            System.out.println("Insira o valor de X: ");
            int x = ler.nextInt();
            System.out.println("Insisra o valor de Y; ");
            int y = ler.nextInt();

            System.out.println("O valor de x é: " + x);
            System.out.println("O valor de y é: " + y);
            int result = subtracao(x, y);
            System.out.println("O resultado da subtração é: " + result);

            Main main = new Main();
            Janela janela = main.new Janela();
            janela.janela(result);
        }

    }

    public static int subtracao(int x, int y) {
        return x - y;
    }

    public class Janela {
        public void janela(int result) {
            String resulString = Integer.toString(result);

            JFrame frame = new JFrame();
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setSize(400, 400);
            frame.setLayout(null);

            JPanel panel = new JPanel();
            panel.setLayout(null);
            panel.setBounds(0, 0, 200, 200);

            JLabel label = new JLabel("Seu resultado é " + resulString);
            label.setBounds(0, 0, 100, 100);

            panel.add(label);

            frame.add(panel);
            frame.setVisible(true);
        }
    }
}
