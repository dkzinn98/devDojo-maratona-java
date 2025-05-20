package academy.devdojo.maratonajava.introducao;

public class Aula04EstruturasCondicionais05 {
    public static void main(String[] args) {
        // imprima o dia da semana, considerando 1 como domingo!
        byte diaSemana = 1;

        switch (diaSemana) {
            // o switch só aceita => char, int, short, byte, enum, String

            case 1:
                System.out.println("Domingo");
                break;

            case 2:
                System.out.println("Segunda");
                break;

            case 3:
                System.out.println("Terça");
                break;

            case 4:
                System.out.println("Quarta");
                break;

            case 5:
                System.out.println("Quinta");
                break;

            case 6:
                System.out.println("Sexta");
                break;

            case 7:
                System.out.println("Sabado");
                break;

            default:
                System.out.println("Dia da semana inexistente"); // o default pode estar em qualquer lugar dentro do switch
                break; // no default também é necessário o break
        }

        // exercício prático: Algorítmo/Código que imprima se a pessoa é HOMEM ou MULHER baseado se a letra for M ou F

        char sexo = 'S';

        switch (sexo) {
            case 'M':
                System.out.println("Homem");
                break;

            case 'F':
                System.out.println("Mulher");
                break;

            default:
                System.out.println("Sexo inválido");
                break;
        }
    }
}
