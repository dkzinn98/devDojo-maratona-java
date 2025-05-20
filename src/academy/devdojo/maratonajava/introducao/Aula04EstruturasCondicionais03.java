package academy.devdojo.maratonajava.introducao;

public class Aula04EstruturasCondicionais03 {
    public static void main(String[] args) {
        // doar se salário for maior que 5000

        double salario = 5000;
        String mensagemDoar = "Eu irei doar 500,00 R$ para o Eje este ano";
        String mensagemNaoDoar = "Eu não poderei doar 500,00 R$ para o Eje este ano";

        // como funciona o operador ternário
        // (condição) ? verdadeiro : falso

        String resultado = (salario > 5000) ? mensagemDoar : mensagemNaoDoar;
        System.out.println(resultado);
        // poderia utilizar String resultado = (salario > 500) ? "Eu irei doar 500,00 R$ para o Eje este ano" : "Eu não poderei doar 500,00 R$ para o Eje este ano";
        // mas teria que remover as Strings mensagemDoar e mensagemNaoDoar!!
        // ou poderia também imprimir direto System.out.println((salario > 5000) ? "Eu irei doar 500,00 R$ para o Eje este ano" : "Eu não poderei doar 500,00 R$ para o Eje este ano");
        // mas o ideal é utilizar as variáveis mensagemDoar e mensagemNaoDoar, para não ficar tão poluído
        // o código, e também para facilitar a leitura do código, e também para facilitar a manutenção do código
        // e também para facilitar a alteração do código, caso precise alterar a mensagem

    }
}
