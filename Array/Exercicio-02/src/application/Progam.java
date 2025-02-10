package application;

import java.util.Scanner;

import entities.Product;
/*Quando você faz vetor[i] = new Product(name, price),
 a variável vetor[i] não armazena o objeto em si,
  mas um endereço na memória (referência) que aponta para o objeto real na heap. */

public class Progam {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Product[] vetor = new Product[n];

            for(int i = 0; i < vetor.length; i++){
                sc.nextLine();//consumir quebra de linha pedente
                String name = sc.nextLine();
                double price = sc.nextDouble();
                vetor[i] = new Product(name, price);//armazena no vetor
            }
            double soma = 0;
            for(int i = 0; i < vetor.length; i++){
                soma += vetor[i].getPrice();
            }
            double media = soma / n;

            System.out.printf("AVERAGE PRICE = %.2f\n", media);
    }
    
}
