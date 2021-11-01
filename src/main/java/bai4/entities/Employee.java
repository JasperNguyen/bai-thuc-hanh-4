/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai4.entities;


public class Employee extends Person{

    public Employee(double salary, String name, Integer birthday) {
        super(name, birthday);
        this.salary = salary;
    }
    
    public Employee(String name, Integer birthday) {
        super(name, birthday);
        this.salary = 0D;
    }
    
    public Employee() {
        super();
        this.salary = 0D; 
    }

    @Override
    public String toString() {
        return String.format(
                "%s"
                + "\nSalary: %s"
                , super.toString(), salary);
    }

    private Double salary;

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }
    
}
