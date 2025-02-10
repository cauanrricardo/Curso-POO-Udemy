package application;

import java.util.Scanner;

import entities.Hospedes;

public class Progam {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Quantos quartos serao alugados ? ");
        int n = sc.nextInt();
        Hospedes[] vetor = new Hospedes[10];

        for(int i = 1; i <= n; i++){
            System.out.println("RENT #"+ i );
            sc.nextLine(); //consumir quebra de linha
            System.out.println("Name: ");
            String name = sc.nextLine();
            System.out.println("Email:  ");
            String email = sc.nextLine();
            System.out.println("Room:  ");
            int room = sc.nextInt();
            vetor[room] = new Hospedes(name, email, room);
        }

        System.out.println("Busy Rooms:");
        for(int i = 0; i < 10; i++){
            if(vetor[i] != null){
            System.out.println(i + " : " + vetor[i]);
            }
        }
        sc.close();

    }
    
}
