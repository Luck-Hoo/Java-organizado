import javax.swing.*;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.*;
import java.util.Stack;

public class Tela {
    private static JTextField textField;

    public static void main(String[] args) {
        criaTela();
    }

    static void criaTela() {
        JFrame frame = new JFrame("Tela");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 500);
        frame.setLayout(new GridBagLayout());

        GridBagConstraints gbc = new GridBagConstraints();
        gbc.gridx = 0; // Posição da célula na coluna
        gbc.gridy = 0; // Posição da célula na linha
        gbc.weightx = 1; // Ajuste horizontal
        gbc.weighty = 1; // Ajuste vertical
        gbc.fill = GridBagConstraints.BOTH; // O componente ocupa todo o espaço da célula

        textField = new JTextField("");
        gbc.gridwidth = 4;
        frame.add(textField, gbc);

        // Primeira linha de botões
        JButton button1 = new JButton("1");
        gbc.gridx = 0;
        gbc.gridy = 1;
        gbc.gridwidth = 1;
        button1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                incrementarChar('1');
            }
        });

        frame.add(button1, gbc);

        JButton button2 = new JButton("2");
        gbc.gridx = 1;
        gbc.gridy = 1;
        button2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                incrementarChar('2');
            }
        });
        frame.add(button2, gbc);

        JButton button3 = new JButton("3");
        gbc.gridx = 2;
        gbc.gridy = 1;
        button3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                incrementarChar('3');
            }
        });
        frame.add(button3, gbc);

        JButton buttonMais = new JButton("+");
        gbc.gridx = 3;
        gbc.gridy = 1;
        buttonMais.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                incrementarChar('+');
            }
        });
        frame.add(buttonMais, gbc);

        // Segunda linha de botões
        JButton button4 = new JButton("4");
        gbc.gridx = 0;
        gbc.gridy = 2;
        button4.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                incrementarChar('4');
            }
        });
        frame.add(button4, gbc);

        JButton button5 = new JButton("5");
        gbc.gridx = 1;
        gbc.gridy = 2;
        button5.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                incrementarChar('5');
            }
        });
        frame.add(button5, gbc);

        JButton button6 = new JButton("6");
        gbc.gridx = 2;
        gbc.gridy = 2;
        button6.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                incrementarChar('6');
            }
        });
        frame.add(button6, gbc);

        JButton buttonMenos = new JButton("-");
        gbc.gridx = 3;
        gbc.gridy = 2;
        buttonMenos.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                incrementarChar('-');
            }
        });
        frame.add(buttonMenos, gbc);

        // Terceira Linha de botões
        JButton button7 = new JButton("7");
        gbc.gridx = 0;
        gbc.gridy = 3;
        button7.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                incrementarChar('7');
            }
        });
        frame.add(button7, gbc);

        JButton button8 = new JButton("8");
        gbc.gridx = 1;
        gbc.gridy = 3;
        button8.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                incrementarChar('8');
            }
        });
        frame.add(button8, gbc);

        JButton button9 = new JButton("9");
        gbc.gridx = 2;
        gbc.gridy = 3;
        button9.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                incrementarChar('9');
            }
        });
        frame.add(button9, gbc);

        JButton buttonMulti = new JButton("*");
        gbc.gridx = 3;
        gbc.gridy = 3;
        buttonMulti.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                incrementarChar('*');
            }
        });
        frame.add(buttonMulti, gbc);

        // Quarta linha de botões
        JButton buttonIgual = new JButton("=");
        gbc.gridx = 0;
        gbc.gridy = 4;
        gbc.gridwidth = 2;
        buttonIgual.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                resultado();
            }
        });
        frame.add(buttonIgual, gbc);

        JButton buttonLimpar = new JButton("C");
        gbc.gridx = 2;
        gbc.gridy = 4;
        gbc.gridwidth = 1;
        buttonLimpar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                limpar();
            }
        });
        frame.add(buttonLimpar, gbc);

        JButton buttonDivi = new JButton("/");
        gbc.gridx = 3;
        gbc.gridy = 4;
        buttonDivi.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                incrementarChar('/');
            }
        });
        frame.add(buttonDivi, gbc);

        frame.setVisible(true);
    }

    static void incrementarChar(char num) {
        String textoCorrente = textField.getText();
        String newText = textoCorrente + Character.toString(num);
        textField.setText(newText);
    }

    static void resultado() {
        int result = 0;
        String textoCorrente = textField.getText();
        // char[] equacao = textoCorrente.toCharArray(); Tinha pensado nisso
        Stack<Character> pilCharacters = new Stack<>();

        // adiciona na colection
        for (char c : textoCorrente.toCharArray()) {
            pilCharacters.push(c);
        }
        // Variáveis auxiliares
        int valorAtual = 0;
        char operacao = '+';

        // Processa a pilha
        while (!pilCharacters.isEmpty()) {
            char c = pilCharacters.pop();

            // Se for um número, converte para inteiro
            if (Character.isDigit(c)) {
                valorAtual = Character.getNumericValue(c);
            }

            // Se for um operador, processa a operação anterior e define a nova
            if (!Character.isDigit(c) || pilCharacters.isEmpty()) {
                switch (operacao) {
                    case '+':
                        result = valorAtual + result;
                        break;
                    case '-':
                        result -= valorAtual;
                        break;
                    case '*':
                        result *= valorAtual;
                        break;
                    case '/':
                        result = valorAtual / result;
                        System.out.println("O valor atual é" + valorAtual);
                        System.out.println("O resultado é" + result);
                        break;
                }
                // Atualiza a operação e reinicializa o valorAtual

                operacao = c;
                valorAtual = 0;
            }
        }
        String resultadoFinal = String.valueOf(result);
        textField.setText(resultadoFinal);
    }

    static void limpar() {
        String newText = "";
        textField.setText(newText);
    }
}
