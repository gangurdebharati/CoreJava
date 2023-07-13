package StreamAPI;

import java.util.*; 
import java.util.stream.Collectors;  

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
public class JavaStreamExample1
{  
    public static void main(String[] args) 
    {  
        List<Product> productsList = new ArrayList<Product>();  
          
        productsList.add(new Product(1,"HP Laptop",25000f));  
        productsList.add(new Product(2,"Dell Laptop",30000f));  
        productsList.add(new Product(3,"Lenevo Laptop",28000f));  
        productsList.add(new Product(4,"Sony Laptop",28000f));  
        productsList.add(new Product(5,"Apple Laptop",90000f));  
        
        List<Float> productPriceList2 =productsList.stream()  
                                     .filter(p -> p.price > 30000)  
                                     .map(p->p.price)          
                                     .collect(Collectors.toList());   
        System.out.println(productPriceList2);  
    }  
}  