package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturaDeRepeticao01 {
    public static void main(String[] args) {
        // while, do while, for
        int count = 0;
        while(count < 10) {
            count += 1; // count = count + 1; | Não importa a ordem
            System.out.println(count);
        } do {
            System.out.println("Executando do while");
        } while (count < 10);

        for(count = 0; count < 10; count++) {  // a mesma coisa que acima, porém com FOR
        System.out.println("For "+count);
    }

    }
}
