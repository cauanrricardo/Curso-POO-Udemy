import java.util.Scanner;

//probelmas negativos
public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.print("Quantos numeros voce vai digitar: ");
        int n = sc.nextInt();
        int[] vetor = new int[n];


        for(int i = 0; i < vetor.length; i++){
          //  sc.nextInt();
            System.out.print("Digite um numero: ");
            vetor[i] = sc.nextInt();
        }
        System.out.println("NUMEROS NEGATIVOS: ");
      //  int[] negativo = new int[];
        for(int i = 0; i < vetor.length; i++){
            if(vetor[i] < 0){
                System.out.println(vetor[i]);
            }
        }

      
    }
}
