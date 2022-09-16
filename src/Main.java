import org.w3c.dom.ls.LSOutput;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.TextStyle;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {

        // ----------------------------------------------------------
        // AULA 02 - SETUP
        // ----------------------------------------------------------

        /*System.out.println("Hello, World!");*/

        // ----------------------------------------------------------
        // AULA 03 - VARIAVEIS
        // ----------------------------------------------------------

        /*

        // Variaveis String
        
        String nome = "Lets Code";
        nome = "Hebert";
        
        String sobrenome;
        sobrenome = "do Nascimento";
        System.out.println("Olá, " + nome + " " + sobrenome + "!");

        // Variáveis numericas
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
        */

        // ----------------------------------------------------------
        // AULA 04 - OPERADORES BOOLEANOS
        // ----------------------------------------------------------

        // Operadores
        // && = and, e
        // || = or, ou

        // Operador Ternário
        // Condicao ? se verdadeiro : se falso

        /*
        boolean vamosAPraia = fimDeSemana || fazendoSol; // && = and "e"
        System.out.println(vamosAPraia);

        String mensagem = fimDeSemana ? "É fim de semana" : "Não é fim de semana";
        System.out.println(mensagem);
        */

        // ----------------------------------------------------------
        // AULA 05 - ESTRUTURAS CONDICIONAIS
        // ----------------------------------------------------------
        /*
        int nota = -2;

        //se nota maior ou igual a 70, aluno esta aprovado
        //if-else

        *//*
        if (nota >= 70) {
            System.out.println("Aluno Aprovado!");
        } else {
            System.out.println("Não aprovado!");
        }
        *//*

        String graduacao;
        // A 80, B 70, C 60, D 0
        if (nota >= 80) {
            System.out.println("Graduação A!");
            graduacao = "A";
        } else if (nota < 80 && nota >= 70) {
            System.out.println("Graduação B!");
            graduacao = "B";
        } else if (nota < 70 && nota >= 60) {
            System.out.println("Graduação C!");
            graduacao = "C";
        } else if (nota < 60 && nota >= 0) {
            System.out.println("Graduação D!");
            graduacao = "D";
        } else {
            System.out.println("Nota inválida!");
            graduacao = "";
        }

        switch (graduacao) {
            case "A":
            case "B":
                System.out.println("Aluno Aprovado!");
                break;
            case "C":
            case "D":
                System.out.println("Não aprovado!");
                break;
            default:
                System.out.println("Graduação inválida!");
        }
        */

        // ----------------------------------------------------------
        // AULA 06 - MANIPULAÇÃO DE STRINGS E DATAS
        // ----------------------------------------------------------

        /*
        String nome = "Hebert";
        System.out.println(nome.toUpperCase()); // converte para MAIÚSCULAS
        System.out.println(nome.toLowerCase()); // converte para minúsculas
        System.out.println(nome.length()); // retorna tamanho

        String nomeOutro = "hebert";
        System.out.println(nome.equals(nomeOutro)); // compara strings
        System.out.println(nome.equalsIgnoreCase(nomeOutro)); //compara strings ignorando maiusc/min
        */

        /*
        //Objetivo:
        //imprimir msg "Olá, {nome}. Hoje é {diaDaSemana}, {SAUDACAO}!

        String nome = "Hebert";
        LocalDate hoje = LocalDate.now();
        Locale brasil = new Locale("pt","BR");
        String diaDaSemana = hoje.getDayOfWeek().getDisplayName(TextStyle.FULL, brasil);

        LocalDateTime agora = LocalDateTime.now();
        String saudacao;
        if (agora.getHour() >= 0 && agora.getHour() < 12) {
            saudacao = "bom dia!";
        } else if (agora.getHour() >= 12 && agora.getHour() < 18) {
            saudacao = "boa tarde!";
        } else if (agora.getHour() >= 18 && agora.getHour() < 24) {
            saudacao = "boa noite!";
        } else {
            saudacao = "bem vindo!";
        }

        System.out.printf("Olá, %s. Hoje é %s, %s%n", nome, diaDaSemana, saudacao.toUpperCase());
        */

        // ----------------------------------------------------------
        // AULA 07 - LAÇOS NUMÉRICOS
        // ----------------------------------------------------------

        /*
        // Criação tabuada

        //variavel de controle; condicao de parada; incremento
        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= 10; j++) {
                if (j < 10)
                    System.out.printf("%s X %s = %s%n", j,i, j*i);
                else //se for 10 pula uma linha a mais
                    System.out.printf("%s X %s = %s%n%n", j,i, j*i);

            }
        }
        */

        // ----------------------------------------------------------
        // AULA 08 - VETORES
        // ----------------------------------------------------------

        /*
        int[] numeros = { 2,5,10,1,3};

        int maior = numeros[0];
        int menor = numeros[0];
        int soma = numeros[0];

        for (int i = 1; i < numeros.length; i++) {
            if (numeros[i] > maior)
                maior = numeros[i];

            if (numeros[i] < menor)
                menor = numeros[i];

            soma += numeros[i];
        }

        System.out.printf("O maior número é %s%n",maior);
        System.out.printf("O menor número é %s%n", menor);
        System.out.printf("A média dos números é %s%n", (float) soma / numeros.length);
        */

        // ----------------------------------------------------------
        // AULA 09 - FUNÇÕES
        // ----------------------------------------------------------

        String nome = "Hebert";
        saudacao(nome);
        saudacao();

        System.out.println(soma(2,3));

        int num1 = 7;
        int num2 = 3;
        System.out.printf("%s + %s = %s", num1, num2, soma(num1, num2));
    }

    public static void saudacao(String nome) {
        System.out.printf("Olá, %s!%n", nome);
    }

    //sobrecarga de metodos (parametros opcionais)
    public static void saudacao() {
        System.out.println("Olá, amigo!");
    }

    public static int soma(int a, int b) {
        return a + b;
    }
}