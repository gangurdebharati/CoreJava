package JUnit;

public class Calculation1 {  
    //method that returns maximum number  
    public static int findMax(int arr[]){  
        int max=0;  
        for(int i=1;i<arr.length;i++){  
            if(max<arr[i])  
                max=arr[i];  
        }  
        return max;  
    }  
    //method that returns cube of the given number  
    public static int cube(int n){  
        return n*n*n;  
    }  
   
}  