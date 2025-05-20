

        // desafio if, else if, else = imprima na tela a categoria de fútebol de acordo com a idade
        // idade < 11 categoria mirim
        // idade < 15 categoria infantil
        // idade >= 15 && idade < 18 categoria juvenil
        // idade >= 18 categoria adulto

package academy.devdojo.maratonajava.introducao;

// 1° forma
public class Aula04EstruturasCondicionais02 {
    public static void main(String[] args) {
        // 1° forma
        int idadeJogador = 27;
        if (idadeJogador < 12) {
            System.out.println("Categoria Mirim");
        } else if (idadeJogador >= 12 && idadeJogador<= 14) {
            System.out.println("Categoria infantil");
        } else if (idadeJogador >= 15 && idadeJogador < 18) {
            System.out.println("Categoria juvenil");
        } else {
            System.out.println("Categoria adulto");
        }

        // 2° forma
        idadeJogador = 10; // aqui eu alterei o valor da variável idadeJogador para 10, para testar a segunda forma
        String categoria;

        if (idadeJogador < 12) {
            categoria = "Categoria Mirim";
        } else if (idadeJogador >= 12 && idadeJogador <= 14) {
            categoria = "Categoria infantil";
        } else if (idadeJogador >= 15 && idadeJogador < 18) {
            categoria = "Categoria juvenil";
        } else {
            categoria = "Categoria adulto";
        }
        System.out.println(categoria);
    }

}


