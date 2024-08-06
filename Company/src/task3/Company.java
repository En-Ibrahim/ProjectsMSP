/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package task3;
import java.util.ArrayList;
import java.util.Scanner;
/**
 *
 * @author Future
 */
public class Company {
    
    private ArrayList<Product> products=new ArrayList<Product>();
    private ArrayList<Person> persons=new ArrayList<Person>();
    private ArrayList<Order> orders=new ArrayList<Order>();
    
    Scanner input=new Scanner(System.in);
    
    public void add_product(Product p ){
    products.add(p);
    }
    public void add_product(ArrayList<Product> product ){
    this.products=product;
    }
    
    
    public void add_person(Person person){
    
    this.persons.add(person);
    
    }
    public void add_oreder(Order order){
    
    this.orders.add(order);
    }
    public void remove_product(int id){
        try{
            this.products.remove(id-1);
        }
        catch(Exception e){
            System.out.println("Don't found it, Pleace cheack the right option\n"+e);
        }
    }
    public void remove_person(int id){
    
     try{
    this.persons.remove(id-1);
        }
        catch(Exception e){
            System.out.println("Don't found it, Pleace cheack the right option\n"+e);
        }
        
    }
    public void remove_oreder(int id){
        try{
            this.orders.remove(id-1);
        }
        catch(Exception e){
            System.out.println("Don't found it, Pleace cheack the right option\n"+e);
        }
    }
    public void print_person_info(int id){
    
        System.out.println(this.persons.get(id-1));
    }    
    
    public void print_product_details(int id){
       System.out.println(products.get(id-1));
    }
    public void printAllProductDetails(int size){
        for (int i = 0; i < size; i++) {
          if(products.get(i)==null){
              continue;
          }
          else
                System.out.println(products.get(i));
        }
    }
    
    
    public void print_order_details(int id){
        System.out.println(this.orders.get(id-1));
    
    }
    public void print_person_orders(int id){
        try{
            System.out.println(orders.get(id-1).toString());
    } 
    catch(Exception e){
        System.out.println("Don't found \n" +e);
    }
    }
    
}
