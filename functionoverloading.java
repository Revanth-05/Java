import java.util.*;
public class functionoverloading{

    // // function to calculate sum of 2 number 
    // public static int sum(int a , int b){
    //     return a + b;
    // }

    //     // function to calculate sum of 3 number 
    // public static int sum(int a , int b ,int c){
    //     return a + b + c ;
    // }

            // function to calculate int sum  
public static int sum(int a , int b ){
    return a + b ;
}
 // function to calculate float sum  
 public static float sum(float a , float b ){
    return a + b ;
}
 
    public static void main(String args[]){
        System.out.println(sum(5, 3));
        // System.out.println(sum(5, 2, 1));
        System.out.println(sum(5.2f, 2.8f));

    }
}