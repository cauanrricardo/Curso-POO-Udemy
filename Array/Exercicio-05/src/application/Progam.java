package application;

import java.util.Scanner;

import entities.Pessoa;

public class Progam {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Quantas pessoas serao digitadas? ");
        int n = sc.nextInt();
        Pessoa[] vetor = new Pessoa[n];

        for (int i = 0; i < vetor.length; i++) {
            System.out.println("Dados da " + (i + 1) + "ª pessoa:");

            sc.nextLine(); // consumir quebra de linha pendente
            System.out.print("Nome: ");
            String name = sc.nextLine();

            System.out.print("Idade: ");
            int idade = sc.nextInt();

            System.out.print("Altura: ");
            float altura = sc.nextFloat();

            vetor[i] = new Pessoa(name, altura, idade);
        }
        float soma_altura = 0;

        int menor_16 = 0;

        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i].getIdade() < 16) {
                menor_16++;
            }
            soma_altura += vetor[i].getAltura();
        }

        float media = soma_altura / n;
        System.out.println("Altura media: " + media);
        float porcentagem = ((float) menor_16 / n) * 100;
        System.out.println("Pessoas com menos de 16 anos: " + porcentagem + "%");
        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i].getIdade() < 16) {
                System.out.println(vetor[i].getName());
            }
        }
    }

}