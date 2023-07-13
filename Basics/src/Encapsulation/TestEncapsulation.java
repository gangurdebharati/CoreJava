package Encapsulation;

public class TestEncapsulation {  
public static void main(String[] args) {  
      
    Account acc=new Account();  
      
    acc.setAcc_no(6230277600L);  
    acc.setName("Tom Rio");  
    acc.setEmail("tomrio@gmail.com");  
    acc.setAmount(400000f);  
   
    System.out.println(acc.getAcc_no()+" "+acc.getName()+" "+acc.getEmail()+" "+acc.getAmount());  
}  
}  
