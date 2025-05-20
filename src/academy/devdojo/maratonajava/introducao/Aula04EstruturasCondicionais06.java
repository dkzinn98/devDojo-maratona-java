package academy.devdojo.maratonajava.introducao;

public class Aula04EstruturasCondicionais06 {
    public static void main(String[] args) {
        // Exercício DevDojo
        // dado os valores de 1 a 7, imprima se é dia util ou final de semana (utilizando switch)
        // caso o valor seja menor que 1 ou maior que 7, imprima uma mensagem de erro
        // considerando 1 como domingo e 7 como sabado

        byte diaSemana = 0;

        switch (diaSemana) {
            case 1:
                System.out.println("Domingo - Final de semana");
                break;
            case 2:
                System.out.println("Segunda - Dia útil");
                break;
            case 3:
                System.out.println("Terça - Dia útil");
                break;
            case 4:
                System.out.println("Quarta - Dia útil");
                break;
            case 5:
                System.out.println("Quinta - Dia útil");
                break;
            case 6:
                System.out.println("Sexta - Dia útil");
                break;
            case 7:
                System.out.println("Sabado - Final de semana");
                break;
            default:
                System.out.println("Erro: Dia da semana inválido");
                break;
        }


    }
}
