/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package task3;

/**
 *
 * @author Future
 */
public class Person {
     protected static int ID=0;
    private final int emID;
   
    private String name, numPhone, gender;


    public Person(String name, String numPhone, String gender) {
        this.name = name;
        this.numPhone = numPhone;
        this.gender = gender;
         emID=++ID;
    }
    

   

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getNumPhone() {
        return numPhone;
    }
    public void setNumPhone(String numPhone) {
        this.numPhone = numPhone;
    }
    public String getGender() {
        return gender;
    }
    public void setGender(String gender) {
        this.gender = gender;
    }


    
    
    @Override
    public String toString() {
        return  "ID= "+emID+" name= " + name + ", numPhone= " + numPhone + ", gender= " + gender ;
    }
    
    public void print(){
        System.out.println(toString());
    }
    
    
    
    
    
    
}
