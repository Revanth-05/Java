// input numbers from user and return their sum and multiplication of numbers.
import java.util.*;
public class inputInJava {
    public static void main(String args[]){
        Scanner sc = new Scanner (System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int sum = a+b;
        int multiplication = a*b;
        System.out.println(sum); 
        System.out.println(multiplication); 

    }
}
