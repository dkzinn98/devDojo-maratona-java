package academy.devdojo.maratonajava.introducao;

public class Aula02TiposPrimitivos {
    public static void main(String[] args) {
        // Tipos primitivos => int, double, float, char, byte, short, long, boolean
        // para criar uma variavel em Java, é necessário declarar o tipo dela e depois escolher um nome e atribuir um valor a ela
        int age = 27;
        long numeroGrande = 1000000000000L; // o L no final é para indicar que é um long
        double salarioDouble = 2150;
        float salarioFloat = 2500;
        byte idadeByte = 127; // o byte é um tipo de dado que pode armazenar valores de -128 a 127
        short idadeShort = 32000;
        boolean verdadeiro = true;
        boolean falso = false;
        char caractere = '\u0041';
        String nome = "Déryk Silva";


        System.out.println("My name is "+ nome +", i have "+ age + " years old and i am a Java developer");
        System.out.println(verdadeiro);
        System.out.println(falso);
        System.out.println("char"+caractere);

        // _________________________ KEVEN TEST ___________________________________ \\


        int newAge = age - 7;
        String newName = "Keven";
        System.out.println("Eu tenho "+age+" anos e meu nome é "+ newName);

    // _________________________ 1° EXERCÍCIO ___________________________________ \\

    String nomeExercicio = "Déryk Silva";
    String endereco = "Sobradinho 2";
    String dataDePagamento = "05/05/2025";
    Double salarioVert = 2150.00;
    String relatorio = "Eu, "+nomeExercicio+", morador de "+endereco+", confirmo que recebi o salário de "+salarioVert+" na data = "+dataDePagamento+"!";

    System.out.println(relatorio);

    }


}
