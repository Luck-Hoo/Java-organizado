package com.example.Calculadora;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

public class JDBC {

    private static final String URL = "jdbc:mysql://localhost:3306/calculadora";
    private static final String USER = "root";
    private static final String PASSWORD = "root";

    // Método para conectar ao banco de dados
    private static Connection connect() throws SQLException {
        return DriverManager.getConnection(URL, USER, PASSWORD);
    }

    // Método para inserir um valor na tabela
    public static void inserirValor(String valor) {
        String query = "INSERT INTO calculos (calculosString) VALUES (?)"; // Ajuste conforme necessário

        try (Connection connection = connect(); 
             PreparedStatement statement = connection.prepareStatement(query)) {
             
            statement.setString(1, valor);
            statement.executeUpdate();
            System.out.println("Valor inserido com sucesso: " + valor);
        } catch (SQLException e) {
            System.err.println("Erro ao inserir valor: " + e.getMessage());
        }
    }

    // Método para consultar dados da tabela
    public static void printTableData(String tableName) {
        String query = "SELECT * FROM " + tableName;

        try (Connection connection = connect();
             Statement statement = connection.createStatement();
             ResultSet resultSet = statement.executeQuery(query)) {
             
            // Obter metadados para imprimir os nomes das colunas
            int columnCount = resultSet.getMetaData().getColumnCount();
            for (int i = 1; i <= columnCount; i++) {
                System.out.print(resultSet.getMetaData().getColumnName(i) + "\t");
            }
            System.out.println();

            // Imprimir os resultados
            while (resultSet.next()) {
                for (int i = 1; i <= columnCount; i++) {
                    System.out.print(resultSet.getString(i) + "\t");
                }
                System.out.println();
            }
        } catch (SQLException e) {
            System.err.println("Erro ao consultar a tabela " + tableName + ": " + e.getMessage());
        }
    }

    // Método para conectar e imprimir valores
    public static void connectToDatabase() {
        try {
            // Registrar o driver JDBC
            Class.forName("com.mysql.cj.jdbc.Driver"); // Adicionei a linha para carregar o driver
            System.out.println("Conexão bem-sucedida!");

            // Consultar a tabela aulas
            System.out.println("Valores da tabela aulas:");
            printTableData("calculos"); // Ajuste conforme necessário
        } catch (ClassNotFoundException e) {
            System.err.println("Driver JDBC não encontrado: " + e.getMessage());
        }
    }
}
