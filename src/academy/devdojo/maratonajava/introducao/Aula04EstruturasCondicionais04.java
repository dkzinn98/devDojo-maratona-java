package academy.devdojo.maratonajava.introducao;

public class Aula04EstruturasCondicionais04 {
        // € 0   € 34,712    9.70%
        // € 34,713   € 68,507   37.35%
        // € 68,508   49.50%

    public static void main(String[] args) {
        double salarioAnual = 25000;
        double primeiraFaixa = 9.70 / 100;
        double segundaFaixa = 37.35 / 100;
        double terceiraFaixa = 49.50 / 100;
        double valorImposto;
        if (salarioAnual <= 34712) {
            valorImposto = salarioAnual * primeiraFaixa;
        } else if (salarioAnual <= 68507) {
            valorImposto = salarioAnual * segundaFaixa;
        } else {
            valorImposto = salarioAnual * terceiraFaixa;
        }

        System.out.println("O valor do imposto é: " + valorImposto);
    }

}
