/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package task3;

import java.util.ArrayList;

/**
 *
 * @author Future
 */
public class Task3 {
    

    public static void main(String[] args) {
        Company c=new Company();
        Company c1=new Company();
//        
        Person client1=new Client("Ibrahim","1204520","male","Ibrahim@gmail.com");
        Person client2=new Client("Mohamed","1204520","male","Mohamed@gmail.com");
        c.add_person(client1);
        c.add_person(client2);

        // add product for client 1
        ArrayList<Product> product=new ArrayList<Product>();
        product.add(new Product("tafd", 200));
        product.add(new Product("dall",500));
        product.add(new Product("tcar", 2500));
        product.add(new Product("Flaier", 2500));
        product.add(new Product("Dapoo", 200));
        product.add(new Product("Race",500));
        
        
        c.add_product(product);
        
        c.print_product_details(1);
        c.print_product_details(2);
        c.print_product_details(3);

        System.out.println("\n------  -------\n");
        c.printAllProductDetails(product.size());
        
        c.remove_product(3);
        System.out.println("\n------ after remove product_id -> 3 -------\n");
        c.printAllProductDetails(product.size());

        System.out.println("\n------  -------\n");

        c.add_oreder(new Order("10/2/2022", true,client1 , product));
        c.print_order_details(1);
        System.out.println("\n------  -------\n");
        
        //add products for client 2
        ArrayList<Product> product2=new ArrayList<Product>();
        product2.add(new Product("Flaier", 2500));
        product2.add(new Product("Dapoo", 200));
        product2.add(new Product("Race",500));
        product2.add(new Product("tafd", 200));
        product2.add(new Product("dall",500));
        product2.add(new Product("tcar", 2500));
        
        c.add_oreder(new Order("10/2/2022", true,client2 , product2));
        
        c.print_order_details(2);
        
        System.out.println("\n------  -------\n");
        c.print_person_orders(1);
        
        
        
        
        
        
        
        
//        c.print_person_orders(1);
//        c.remove_oreder(0);
//        c.remove_product(1);
       


        }
    }