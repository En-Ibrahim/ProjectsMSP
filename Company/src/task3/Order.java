/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package task3;

import java.util.ArrayList;

/**
 *
 * @author Future
 */
public class Order {
     protected static int counter=0;
    private final int ID;
   
    private String data;
    private boolean isPaid;
    private Person person;
    private ArrayList<Product> product=new ArrayList<Product>();
    
    
       
    public Order(String data, boolean isPaid, Person person, ArrayList<Product> product) {
        this.data = data;
        this.isPaid = isPaid;
        this.person = person;
        this.product = product;
        this.ID=++counter;
    }

    public boolean isIsPaid() {
        return isPaid;
    }

    public void setIsPaid(boolean isPaid) {
        this.isPaid = isPaid;
    }

    public Person getperson() {
        return person;
    }

    public void setperson(Person person) {
        this.person = person;
    }


    public void getProduct() {
    int i; 
        for(i=0;i<product.size();i++){
            System.out.println( product.get(i));   
         }
        
    }
    

   
    
    @Override
    public String toString() {
        return "Order{" + "ID=" + ID + ", data=" + data + ", isPaid=" + isPaid +
                "}\nperson{" + person + "}\nproduct=" + product + '}';
    }
    
    
    
    
    
    
    
}
