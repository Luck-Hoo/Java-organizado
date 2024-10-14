package io.github.lucasNunes;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TicTacToe implements ActionListener {
    // Necessária definição das variáveis iniciais, que serão inicializadas nas
    // funções seguintes
    private JFrame frame;
    private JButton[] buttons;
    private String currentPlayer;
    private boolean gameWon;

    // Cria as 9 teclas e a janela e inicializa as variaveis. Chama o
    // initializeBoard
    public TicTacToe() {

        frame = new JFrame("Tic Tac Toe");
        buttons = new JButton[9];
        currentPlayer = "X";
        gameWon = false;
        initializeBoard();
    }

    // Cria o gridLayout de 3x3, com mesma formatação
    private void initializeBoard() {

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 400);
        frame.setLayout(new GridLayout(3, 3));

        for (int i = 0; i < 9; i++) {
            buttons[i] = new JButton("");
            buttons[i].setFont(new Font("Arial", Font.PLAIN, 60));
            buttons[i].setFocusPainted(false);
            buttons[i].addActionListener(this);
            frame.add(buttons[i]);
        }

        frame.setVisible(true);
    }

    // Verifica se o jogador ganhou e escreve a letra no button e muda de player x
    // para o
    @Override
    public void actionPerformed(ActionEvent e) {
        // Obtém o botão que foi clicado
        JButton buttonClicked = (JButton) e.getSource();
        // Se o botão já foi clicado anteriormente (não está vazio) ou o jogo já foi
        // vencido, sai do método
        if (!buttonClicked.getText().equals("") || gameWon) {
            return;
        }

        buttonClicked.setText(currentPlayer);
        checkForWin();

        currentPlayer = currentPlayer.equals("X") ? "O" : "X";
    }

    private void checkForWin() {
        // São as 8 combinações de índices que podem gerar o ganhador
        int[][] winCombinations = {
                { 0, 1, 2 }, { 3, 4, 5 }, { 6, 7, 8 }, // Rows
                { 0, 3, 6 }, { 1, 4, 7 }, { 2, 5, 8 }, // Columns
                { 0, 4, 8 }, { 2, 4, 6 } // Diagonals
        };
        // // Verifica CADA combinação para ver se todos os 3 botões na combinação têm o
        // mesmo valor (X ou O) e se nenhum dos botoes está vazio
        for (int[] combination : winCombinations) {
            if (buttons[combination[0]].getText().equals(buttons[combination[1]].getText()) &&
                    buttons[combination[1]].getText().equals(buttons[combination[2]].getText()) &&
                    !buttons[combination[0]].getText().equals("")) {

                gameWon = true;
                JOptionPane.showMessageDialog(frame, "Player " + buttons[combination[0]].getText() + " wins!");
                resetGame();
                return;
            }
        }
        // isDraw começa com vdd, se nao tiver nenhum vazio, isDraw é falso
        boolean isDraw = true;
        for (JButton button : buttons) {
            if (button.getText().equals("")) {
                isDraw = false;
                break;
            }
        }
        // Verifica isDraw continuamente
        if (isDraw) {
            JOptionPane.showMessageDialog(frame, "It's a draw!");
            resetGame();
        }
    }

    // reinicia os valores das variaveis e branco nos botoes
    private void resetGame() {
        for (JButton button : buttons) {
            button.setText("");
        }
        gameWon = false;
        currentPlayer = "X";
    }

    public static void main(String[] args) {
        new TicTacToe();
    }
}
