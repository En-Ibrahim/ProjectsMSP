/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package task3;

/**
 *
 * @author Future
 */
public class Employee extends Person{
    
    
   private String workingTime;
   private float salary;

    
    
    public Employee( String name, String numPhone, String gender,String workingTime, float salary) {
        super(name, numPhone, gender);
        this.workingTime = workingTime;
        this.salary = salary;
        
    }

    
    
    public String getWorkingTime() {
        return workingTime;
    }

    public void setWorkingTime(String workingTime) {
        this.workingTime = workingTime;
    }
    
    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +super.toString() + " workingTime= " + workingTime + ", salary= " + salary + '}';
    }
    
    public void print(){
        System.out.println(toString());
    }
    
}
