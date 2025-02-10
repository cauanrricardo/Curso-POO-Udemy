import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println("Quantos numeors voce vai digitar? ");
        int n = sc.nextInt();
        double[] vetor = new double[n];
        double soma = 0;

        for(int i = 0; i < vetor.length; i++){
        System.out.println("Digite um numero: ");
        vetor[i] = sc.nextDouble();
        soma +=vetor[i];
        
        }
        System.out.println("VALORES: ");
        for(int i = 0; i < vetor.length; i++){
            System.out.println(vetor[i]);
        }
        System.out.println("SOMA: " + soma);
        double media = soma / n;

        System.out.println("MEDIA: " + media);


    }
}
