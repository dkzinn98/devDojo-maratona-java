package academy.devdojo.maratonajava.introducao;

/**
 * 1° Exercício
 *
 * Crie um código que imprima na tela o seu nome, endereço, data de pagamento e o valor do salário.
 *
 * Exemplo:
 * Eu, Déryk Silva, morador de Sobradinho 2, confirmo que recebi o salário de 2150.00 na data = 05/05/2025!
 */

public class ExercicioAula02 {
    public static void main(String[] args) {
        String nomeExercicio = "Déryk Silva";
        String endereco = "Sobradinho 2";
        String dataDePagamento = "05/05/2025";
        Double salarioVert = 2150.00;
        String relatorio = "Eu, "+nomeExercicio+", morador de "+endereco+", confirmo que recebi o salário de "+salarioVert+" na data = "+dataDePagamento+"!";
        System.out.println(relatorio);

        // Poderia usar também assim, imprimindo direto sem puxar a váriável relatorio => System.out.println("Eu, " + nomeExercicio + ", morador de " + endereco + ", confirmo que recebi o salário de " + salarioVert + " na data = " + dataDePagamento);
    }
}
