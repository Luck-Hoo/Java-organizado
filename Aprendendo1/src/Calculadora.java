import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculadora {
    public static void main(String[] args) {
        // Cria uma nova instância de JFrame
        JFrame frame = new JFrame("Minha Janela Swing");
        // Define o tamanho da janela (largura, altura)
        frame.setSize(400, 300);
        // Define o comportamento padrão de fechamento da janela
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // Define se a janela será redimensionável ou não
        frame.setResizable(true);



        JTextField firstValue = new JTextField(10);
        JTextField secondValue = new JTextField(10);

        JPanel inputJPanel = new JPanel(new FlowLayout());
        inputJPanel.add(firstValue);
        inputJPanel.add(secondValue);

        // Define o layout da janela
        frame.setLayout(new GridBagLayout());


        GridBagConstraints gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.gridwidth = GridBagConstraints.REMAINDER;// Componente ocupa toda a largura da linha
        gbc.gridheight = 2;
        gbc.fill = GridBagConstraints.HORIZONTAL;// Ocupa todo o espaço horizontal disponível
        gbc.anchor = GridBagConstraints.CENTER;// Componente é centralizado horizontalmente
        gbc.insets = new Insets(10,10,10,10);// Margem externa

        frame.add(inputJPanel, gbc);

        JLabel labelResultadoSoma = new JLabel();
        labelResultadoSoma.setHorizontalAlignment(SwingConstants.CENTER);
        gbc.gridy = 1;
        frame.add(labelResultadoSoma, gbc);

        JButton buttonFazerSoma = new JButton("Soma");
        buttonFazerSoma.setHorizontalAlignment(SwingConstants.CENTER);
        gbc.gridy = 2;
        frame.add(buttonFazerSoma, gbc);

        buttonFazerSoma.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                Soma(labelResultadoSoma, firstValue, secondValue);
            }
        });

        frame.setVisible(true);
    }

    // Método para atualizar a data e hora no JLabel
    private static void Soma(JLabel labelResultadoSoma, JTextField firstValue, JTextField secondValue) {
        try {
            // Obtém os valores dos campos de entrada como Strings
            String strPrimeiroValor = firstValue.getText();
            String strSegundoValor = secondValue.getText();
    
            // Converte os valores para números inteiros
            int primeiroValor = Integer.parseInt(strPrimeiroValor);
            int segundoValor = Integer.parseInt(strSegundoValor);
    
            // Calcula a soma
            int soma = primeiroValor + segundoValor;
    
            // Exibe o resultado na label
            labelResultadoSoma.setText("Resultado da Soma: " + soma);
        } catch (NumberFormatException ex) {
            // Se a entrada não for um número válido, exibe uma mensagem de erro
            labelResultadoSoma.setText("Erro: Insira valores numéricos válidos.");
        }
    }
}