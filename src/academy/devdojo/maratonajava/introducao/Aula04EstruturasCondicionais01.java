package academy.devdojo.maratonajava.introducao;

public class Aula04EstruturasCondicionais01 {
    public static void main(String[] args) {

        int idade = 27;
        boolean isAutorizadoComprarBebida = idade >= 18 && idade <= 70; // idade entre 18 e 70 anos

        if(isAutorizadoComprarBebida) {
            System.out.println("Autorizado a comprar bebida alcoólica");
        } else {
            System.out.println("Não autorizado a comprar bebida alcoólica");
        }
    }
}
