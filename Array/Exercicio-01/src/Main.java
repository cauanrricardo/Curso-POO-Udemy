import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
      
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double soma = 0;
        double[] vetor = new double[n];
        for(int i = 0; i < n; i++){
            vetor[i] = sc.nextDouble();
            soma += vetor[i];     
           }
        double resultado = soma/n;
        System.out.printf("AVEREGE HEIGHT: %.2f", resultado);

    }
}
