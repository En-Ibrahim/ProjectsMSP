/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package task3;

/**
 *
 * @author Future
 */
public class Client extends Person {
    
    
   private String email;

   

    public Client(int emID, String name, String numPhone, String gender) {
        super(name, numPhone, gender);
       
    }
    
        
    public Client( String name, String numPhone, String gender,String email) {
        super(name, numPhone, gender);
        this.email = email;
        
    }

    
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    

    @Override
    public String toString() {
        return "Client{" +super.toString() + " email= " + email + '}';
    }
    
    public void print(){
        System.out.println(toString());
    }
    
    
}
