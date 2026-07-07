/*
    Descricao: Algoritmo que pede nome e idade
               para compreensoes iniciais da linguagem JAVA
    Autor: Daniel Benetti
    Data:  07/07/2026
*/


import java.util.Scanner;

public class Main {


    public static void main(String[] args)  {
        Scanner scanner = new Scanner(System.in); //declarando variavel
        System.out.println("Olá, informe seu nome: ");
        //inicializando variavel e pedindo dados
        String name = scanner.next(); 
        System.out.println("Informe sua idade: ");
        int age = scanner.nextInt(); //scanf java
        System.out.println("Olá " + name + " sua idade é " + age);

    }
}
