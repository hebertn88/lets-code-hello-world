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

        //Objetivo:
        //imprimir msg "Olá, {nome}. Hoje é {diaDaSemana}, {SAUDACAO}!

        String nome = "Hebert";
        LocalDate hoje = LocalDate.now();
        Locale brasil = new Locale("pt","BR");
        //System.out.println(hoje.getDayOfWeek().getDisplayName(TextStyle.FULL, brasil));
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
    }
}