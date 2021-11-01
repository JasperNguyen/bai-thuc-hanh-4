package bai4.d;

import bai4.entities.Employee;



public class Manager extends Employee{

    public Manager(Employee assistant, Double salary, String name, Integer birthday) {
        super(salary, name, birthday);
        this.assistant = assistant;
    }

    public Manager(Employee assistant) {
        this.assistant = assistant;
    }
    
    public Manager() {
        super();
        this.assistant = null;
    }
    
    @Override
    public String toString() {
        return String.format(
                "%s"
                + "\nSssistant: "
                + "\n%s"
                , super.toString(), assistant);
    }
    
    private Employee assistant;

    public Employee getAssistant() {
        return assistant;
    }

    public void setAssistant(Employee assistant) {
        this.assistant = assistant;
    }
}
