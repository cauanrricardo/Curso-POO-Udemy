package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import entities.Funcionario;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Funcionario> lista = new ArrayList<>();
        System.out.print("How many emplyees will be registered? ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.println("Emplyoee #" + (i + 1) + ":");

            System.out.print("Id:");
            int id = sc.nextInt();

            sc.nextLine();

            System.out.print("Name:");
            String name = sc.nextLine();

            System.out.print("Salary:");
            float salary = sc.nextFloat();

            // Funcionario emp = new Funcionario(id, name, salary);
            // lista.add(emp);
            lista.add(new Funcionario(id, name, salary)); // eu fiz tudo direto

            System.out.println("------------------------");
        }
        System.out.println();
        System.out.print("Enter the employee id that will have salary increase :");
        int idBusca = sc.nextInt();
        for (Funcionario f : lista) {
            if (f.getId() != idBusca) {
                System.out.println("This id does not exist!");
                break;
            } else {
                System.out.print("Enter the percentage: ");
                float percentage = sc.nextFloat();
                if (f.getId() == idBusca) {
                    f.aumentoSalario(percentage);
                    break;
                }

            }
        }
        System.out.println();
        System.out.println("List of employees: ");
        for (Funcionario f : lista) {
            System.out.println(f);
        }

        sc.close();
    }

}
