/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java2016application;

/**
 *
 * @author mhcrnl
 */
public class StaticTest012 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Employee[] staff = new Employee[3];
        staff[0] = new Employee("Cornel", 5000);
        staff[1] = new Employee("Andrei", 6000);
        staff[2] = new Employee("Vasile", 5500);
        
        for(Employee e:staff){
            e.setId();
            System.out.println("Nume="+e.getName()+". Id="+e.getId()+". salary="
                    +e.getSalary());
        }
        int n = Employee.getNextId();
        System.out.println("Noul id valabil este:" +n);
    }
    
}

class Employee {
    private String name;
    public Employee(String n, double s){
        name=n;
        salary=s;
        id=0;
    }
    public static int getNextId(){
        return nextId;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public void setId() {
        id = nextId;
        nextId++;
    }
    private double salary;
    private int id;
    private static int nextId=1;
    
}