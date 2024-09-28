

public class Main {
    public static void main(String[] args) {
        int num = 100;
        int num1 = 150;
        int num2 = 200;
        num = 70;
        int result = num + num1 + num2;
        String nome = "Rogério";
        
        System.out.println("Hello World!");
        System.out.println("Curso em Java");
        System.out.printf("Canal:%s - Ano:%d%n","CFB Cursos", 2021);
        System.out.printf("Soma das variiáveis: %d%nNome:%s%nResultado:%d%n", num, nome,result);

        if ((num > 50) && (num < 100)) {
            System.out.println("Numero é maior que 50");
        } else {
            System.out.println("Não é");
        }

        String comparacao;
        comparacao = (num > 50 ? "Numero é maior que 50" : "Não é");
        System.out.println(comparacao);

        switch (num) {
            case 50:
            System.out.println("Não é");
                break;
        
            default:
            System.out.println("Numero é maior que 50");
                break;
        }
    }
    }