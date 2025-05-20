package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturaDeRepeticao04 {
        // Dado o valor de um carro, descubra em quantas X ele pode ser parcelado
        // condição  valorParcela >= 1000
        // desafio pessoal, número máximo de parcelas (caso o valor ultrapasse 30k) = 48x
    public static void main(String[] args) {
        double valorTotalCarro = 101884;
        for (int parcela = 1; parcela <= 48; parcela++) { // aqui eu decido que o numero de parcelas está de 1 a 48 (min - max)
            double valorParcela = valorTotalCarro / parcela; // aqui eu decido que o valor da parcela é o valor total do carro dividido pelo número de parcelas
            if(valorParcela >= 1000) {
                System.out.println("Parcela "+parcela+ " irá custar R$ "+String.format("%.2f", valorParcela)); // valor formatado para duas casas decimais
            }
        }

    }
}
