/*
 * This source file was generated by the Gradle 'init' task
 */
package treinos.esparsos;

import java.awt.*;
import javax.swing.*;

import treinos.esparsos.App4.App6;

public class App {
    private int x = 5;

    public void construindoVisão() {
        JFrame frame = new JFrame("Construindo Visão");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800, 600);

        JPanel jPanel = new JPanel();
        jPanel.setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();

        frame.add(jPanel);

        frame.setVisible(true);
    }

    public class Pai {
        int x = 5;
        int y = 10;
    }

    public static void main(String[] args) {
        App app = new App();
        // app.construindoVisão();
        System.out.println(app.x);

        App2 app2 = new App2();
        System.out.println(app2.var1);

        App3 app3 = new App3(); // primeiro eu intancio a classe pai
        App3.Filho filho = app3.new Filho(); // Depois eu instancio a classe filho, diretamente
        System.out.println(filho.teste);

        filho.mostrarX();

        App4 app4 = new App4();
        App4.App5 app5 = app4.new App5();
        app5.pegarX();

        App4.App6 app6 = app4.new App6();
        System.out.println(app6.y);
    }
}