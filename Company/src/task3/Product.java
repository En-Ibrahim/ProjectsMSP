/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package task3;

/**
 *
 * @author Future
 */
public class Product {
     protected static int counter=0;
     private final int ID;
    
    private  String name;
    private float price;

    public Product() {
    ID = ++counter;
    }
    

    public Product( String name, float price) {
        this.name = name;
        this.price = price;
        ID = ++counter;
    }

    public int getID() {
        return ID;
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product{" + "ID=" + ID + ", name=" + name + ", price=" + price + '}';
    }
    

   

    
}
