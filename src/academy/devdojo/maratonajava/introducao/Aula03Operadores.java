package academy.devdojo.maratonajava.introducao;

public class Aula03Operadores  {
    public static void main(String[] args) {
        // Operadores aritméticos
        // +, -, *, /, %
        int a = 10;
        int b = 20;
        System.out.println("Soma: " + (a + b));
        System.out.println("Subtração: " + (a - b));
        System.out.println("Multiplicação: " + (a * b));
        System.out.println("Divisão: " + (a / b));
        System.out.println("Resto da divisão: " + (a % b));

        // Operadores de comparação
        // ==, !=, >, <, >=, <=
        System.out.println("Igualdade: " + (a == b));
        System.out.println("Diferença: " + (a != b));
        System.out.println("Maior que: " + (a > b));
        System.out.println("Menor que: " + (a < b));
        System.out.println("Maior ou igual a: " + (a >= b));
        System.out.println("Menor ou igual a: " + (a <= b));

        // OPERADORES && (AND) e || (OR)
        // && (AND) - retorna true se ambos os lados forem true
        // || (OR) - retorna true se pelo menos um dos lados for true
        // ! (NOT) - inverte o valor booleano
        boolean isTrue = true;
        boolean isFalse = false;
        System.out.println("AND: " + (isTrue && isFalse)); // false
        System.out.println("OR: " + (isTrue || isFalse)); // true
        System.out.println("NOT: " + (!isTrue)); // false
        System.out.println("NOT: " + (!isFalse)); // true


        // Operador ternário
        // (condição) ? valor_se_verdadeiro : valor_se_falso
        int newIdade = 18;
        String resultado = (newIdade >= 18) ? "Maior de idade" : "Menor de idade";
        System.out.println("Resultado: " + resultado);


        // EXERCÍCIO PESSOAL PRÁTICO 1

        int idade = 27;
        double salario = 2150.00;
        double refeicao = 590.00f;
        boolean isAptoParaEmprestimo = idade >= 24 && salario >= 2100.00 && refeicao <= 700.00;
        System.out.println("Apto para empréstimo: "+isAptoParaEmprestimo);


        // EXERCÍCIO PESSOAL PRÁTICO 2

        double valorTotalContaCorrente = 123.14;
        double valorTotalContaPoupanca = 4883.00;
        float playstationValue = 5000F;
        boolean isPlaystationAprovado = valorTotalContaCorrente + valorTotalContaPoupanca >= playstationValue || valorTotalContaCorrente + valorTotalContaPoupanca <= 4999.99;
        // quando utiliza o "||" (OU) = se tiver alguma condição true e o resto false, retornará true.
        System.out.println("Playstation aprovado: "+isPlaystationAprovado);


        // EXERCÍCIO PESSOAL PRÁTICO 3

        int idadeDesafioGemini = 27;
        double rendaMensal = 3400.00;
        boolean possuiCarteiraDeMotorista = true;
        String nivelDeEducacao = "superior"; // pode ser "superior", "medio" ou "fundamental"
        double valorDoEmprestimoDesejado = 75000.00;
        double taxaDeJuros = nivelDeEducacao.equals("superior") ? 0.05 : 0.08;
        double valorTotalAPagar = valorDoEmprestimoDesejado * (1 + taxaDeJuros);
        boolean emprestimoEstudantilPremium = idadeDesafioGemini >= 18 && idadeDesafioGemini <= 30 && rendaMensal >= 1500.00 && possuiCarteiraDeMotorista == true && (nivelDeEducacao.equals("superior") || nivelDeEducacao.equals("medio"));

        System.out.println("idade: "+idadeDesafioGemini);
        System.out.println("renda mensal: "+rendaMensal);
        System.out.println("possui carteira de motorista: "+possuiCarteiraDeMotorista);
        System.out.println("nivel de educacao: "+nivelDeEducacao);
        System.out.println("perfil se qualifica para o Emprestimo Estudantil Premium: "+emprestimoEstudantilPremium);
        System.out.println("Taxa de juros aplicada: "+taxaDeJuros);
        System.out.println("Valor total a pagar: "+valorTotalAPagar);

    }



}
