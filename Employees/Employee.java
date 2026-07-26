package Employees;

public class Employee {
    public int id;
    public String name;
    public Double salary;
    

    public Employee(int id, String name, Double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public int getId(){
        return this.id;
    }

    public void salaryRaise(double raise){
        this.salary += this.salary * raise;
    }
    
    
}