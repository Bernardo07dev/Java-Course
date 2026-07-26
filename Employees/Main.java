package Employees;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        Employee joao = new Employee(1, "João", 1200.00);
        Employee bruno = new Employee(2, "Bruno", 1900.00);
        Employee pedro = new Employee(3, "Pedro", 1600.00);

        List<Employee> Empresa = new ArrayList<>();
        Empresa.add(joao);
        Empresa.add(bruno);
        Empresa.add(pedro);

        System.out.println("Enter the employee id you want to salary raise:");
        int emp_id = scanner.nextInt();
        
        Employee emp = Empresa.stream().filter(x -> x.getId() == emp_id).findFirst().orElse(null);

        if (emp != null){
            System.out.println("De quanto sera o aumento");
            double raise = scanner.nextDouble();
            emp.salaryRaise(raise);

        } else{
            System.out.println("User nao encontrado");
        }

        for (Employee e : Empresa){
            System.out.printf("Id: %d%n", e.id);
            System.out.printf("Name: %s%n", e.name);
            System.out.printf("Salary: %.2f%n%n", e.salary);
        }

    }    
} 