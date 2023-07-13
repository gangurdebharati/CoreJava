package StreamAPI;

import java.util.*; 

class Product
{    
    int id;    
    String name;    
    float price;   
    
    public Product(int id, String name, float price) 
    {    
        this.id = id;    
        this.name = name;    
        this.price = price;    
    }    
}    
public class JavaStreamExample4
{    
    public static void main(String[] args) 
    {    
        List<Product> productsList = new ArrayList<Product>();    
           
        productsList.add(new Product(1,"HP Laptop",25000f));    
        productsList.add(new Product(2,"Dell Laptop",30000f));    
        productsList.add(new Product(3,"Lenevo Laptop",28000f));    
        productsList.add(new Product(4,"Sony Laptop",28000f));    
        productsList.add(new Product(5,"Apple Laptop",90000f));    
            
        Product productA = productsList.stream().max((product1, product2)->product1.price > product2.price ? 1: -1).get();    
        System.out.println(productA.price);    
            
        Product productB = productsList.stream().min((product1, product2)->product1.price > product2.price ? 1: -1).get();    
        System.out.println(productB.price);    
            
    }    
}    