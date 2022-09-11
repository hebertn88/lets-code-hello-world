public class Main {
    public static void main(String[] args) {

        //AULA 02 - SETUP
        System.out.println("Hello, World!");

        //AULA 03 - VARIAVEIS

        //Variaveis String
        
        String nome = "Lets Code";
        nome = "Hebert";
        
        String sobrenome;
        sobrenome = "do Nascimento";
        System.out.println("Olá, " + nome + " " + sobrenome + "!");

        //Variáveis numericas
        int a;
        int b = 2;
        a = 3;

        int soma = a + b;
        int subtracao = a - b;
        int multiplicacao = a * b;
        float divisao = (float) a / b; //(float) transforma resultado int em float "Cast"

        System.out.println("Soma: " + soma);
        System.out.println("Subtração: " + subtracao);
        System.out.println("Multiplicação: " + multiplicacao);
        System.out.println("Divisão: " + divisao);
    }
}