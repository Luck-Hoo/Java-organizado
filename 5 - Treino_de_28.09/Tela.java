import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Stack;

class RoundedButton extends JButton {
    private int radius;

    public RoundedButton(String label, int radius) {
        super(label);
        this.radius = radius;
        setFocusPainted(false);
        setContentAreaFilled(false);
        setBorderPainted(false);
        setForeground(Color.WHITE);
        setFont(new Font("Arial", Font.PLAIN, 16));
    }

    @Override
    protected void paintComponent(Graphics g) {
        if (getModel().isPressed()) {
            g.setColor(getBackground().darker());
        } else {
            g.setColor(getBackground());
        }
        g.fillRoundRect(0, 0, getWidth(), getHeight(), radius, radius);
        super.paintComponent(g);
    }

    @Override
    public void setBackground(Color color) {
        super.setBackground(color);
        repaint();
    }
}

public class Tela {
    private static JTextField textField;

    public static void main(String[] args) {
        criaTela();
    }

    static void criaTela() {
        JFrame frame = new JFrame("Tela");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 500);
        frame.getContentPane().setBackground(new Color(33, 33, 33));
        frame.setLayout(new GridBagLayout());

        GridBagConstraints gbc = new GridBagConstraints();
        gbc.gridx = 0; // Posição da célula na coluna
        gbc.gridy = 0; // Posição da célula na linha
        gbc.weightx = 1; // Ajuste horizontal
        gbc.weighty = 1; // Ajuste vertical
        gbc.fill = GridBagConstraints.BOTH; // O componente ocupa todo o espaço da célula

        textField = new JTextField("");
        textField.setHorizontalAlignment(JTextField.RIGHT);
        textField.setBackground(new Color(33, 33, 33));
        textField.setForeground(Color.WHITE);
        textField.setFont(new Font("Arial", Font.PLAIN, 36));
        gbc.gridwidth = 4;
        frame.add(textField, gbc);

        // Cor comum para botões
        Color buttonBackgroundColor = new Color(128, 128, 128);
        Color buttonTextColor = Color.WHITE;

        // Primeira linha de botões
        RoundedButton button1 = new RoundedButton("1", 15);
        button1.setBackground(buttonBackgroundColor);
        button1.setForeground(buttonTextColor);
        button1.setFont(new Font("Arial", Font.PLAIN, 16));
        gbc.gridx = 0;
        gbc.gridy = 1;
        gbc.gridwidth = 1;
        button1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                incrementarChar('1');
            }
        });
        frame.add(button1, gbc);

        RoundedButton button2 = new RoundedButton("2", 15);
        button2.setBackground(buttonBackgroundColor);
        button2.setForeground(buttonTextColor);
        button2.setFont(new Font("Arial", Font.PLAIN, 16));
        gbc.gridx = 1;
        gbc.gridy = 1;
        button2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                incrementarChar('2');
            }
        });
        frame.add(button2, gbc);

        RoundedButton button3 = new RoundedButton("3", 15);
        button3.setBackground(buttonBackgroundColor);
        button3.setForeground(buttonTextColor);
        button3.setFont(new Font("Arial", Font.PLAIN, 16));
        gbc.gridx = 2;
        gbc.gridy = 1;
        button3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                incrementarChar('3');
            }
        });
        frame.add(button3, gbc);

        RoundedButton buttonMais = new RoundedButton("+", 15);
        buttonMais.setBackground(buttonBackgroundColor);
        buttonMais.setForeground(buttonTextColor);
        buttonMais.setFont(new Font("Arial", Font.PLAIN, 16));
        gbc.gridx = 3;
        gbc.gridy = 1;
        buttonMais.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                incrementarChar('+');
            }
        });
        frame.add(buttonMais, gbc);

        // Segunda linha de botões
        RoundedButton button4 = new RoundedButton("4", 15);
        button4.setBackground(buttonBackgroundColor);
        button4.setForeground(buttonTextColor);
        button4.setFont(new Font("Arial", Font.PLAIN, 16));
        gbc.gridx = 0;
        gbc.gridy = 2;
        button4.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                incrementarChar('4');
            }
        });
        frame.add(button4, gbc);

        RoundedButton button5 = new RoundedButton("5", 15);
        button5.setBackground(buttonBackgroundColor);
        button5.setForeground(buttonTextColor);
        button5.setFont(new Font("Arial", Font.PLAIN, 16));
        gbc.gridx = 1;
        gbc.gridy = 2;
        button5.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                incrementarChar('5');
            }
        });
        frame.add(button5, gbc);

        RoundedButton button6 = new RoundedButton("6", 15);
        button6.setBackground(buttonBackgroundColor);
        button6.setForeground(buttonTextColor);
        button6.setFont(new Font("Arial", Font.PLAIN, 16));
        gbc.gridx = 2;
        gbc.gridy = 2;
        button6.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                incrementarChar('6');
            }
        });
        frame.add(button6, gbc);

        RoundedButton buttonMenos = new RoundedButton("-", 15);
        buttonMenos.setBackground(buttonBackgroundColor);
        buttonMenos.setForeground(buttonTextColor);
        buttonMenos.setFont(new Font("Arial", Font.PLAIN, 16));
        gbc.gridx = 3;
        gbc.gridy = 2;
        buttonMenos.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                incrementarChar('-');
            }
        });
        frame.add(buttonMenos, gbc);

        // Terceira linha de botões
        RoundedButton button7 = new RoundedButton("7", 15);
        button7.setBackground(buttonBackgroundColor);
        button7.setForeground(buttonTextColor);
        button7.setFont(new Font("Arial", Font.PLAIN, 16));
        gbc.gridx = 0;
        gbc.gridy = 3;
        button7.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                incrementarChar('7');
            }
        });
        frame.add(button7, gbc);

        RoundedButton button8 = new RoundedButton("8", 15);
        button8.setBackground(buttonBackgroundColor);
        button8.setForeground(buttonTextColor);
        button8.setFont(new Font("Arial", Font.PLAIN, 16));
        gbc.gridx = 1;
        gbc.gridy = 3;
        button8.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                incrementarChar('8');
            }
        });
        frame.add(button8, gbc);

        RoundedButton button9 = new RoundedButton("9", 15);
        button9.setBackground(buttonBackgroundColor);
        button9.setForeground(buttonTextColor);
        button9.setFont(new Font("Arial", Font.PLAIN, 16));
        gbc.gridx = 2;
        gbc.gridy = 3;
        button9.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                incrementarChar('9');
            }
        });
        frame.add(button9, gbc);

        RoundedButton buttonMulti = new RoundedButton("*", 15);
        buttonMulti.setBackground(buttonBackgroundColor);
        buttonMulti.setForeground(buttonTextColor);
        buttonMulti.setFont(new Font("Arial", Font.PLAIN, 16));
        gbc.gridx = 3;
        gbc.gridy = 3;
        buttonMulti.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                incrementarChar('*');
            }
        });
        frame.add(buttonMulti, gbc);

        // Quarta linha de botões
        RoundedButton buttonIgual = new RoundedButton("=", 15);
        buttonIgual.setBackground(buttonBackgroundColor);
        buttonIgual.setForeground(buttonTextColor);
        gbc.gridx = 0;
        gbc.gridy = 4;
        gbc.gridwidth = 2;
        buttonIgual.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                resultado();
            }
        });
        frame.add(buttonIgual, gbc);

        RoundedButton buttonLimpar = new RoundedButton("C", 15);
        buttonLimpar.setBackground(buttonBackgroundColor);
        buttonLimpar.setForeground(buttonTextColor);
        gbc.gridx = 2;
        gbc.gridy = 4;
        gbc.gridwidth = 1;
        buttonLimpar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                limpar();
            }
        });
        frame.add(buttonLimpar, gbc);

        RoundedButton buttonDivi = new RoundedButton("/", 15);
        buttonDivi.setBackground(buttonBackgroundColor);
        buttonDivi.setForeground(buttonTextColor);
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
                        result = valorAtual - result;
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
