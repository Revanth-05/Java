import java.util.*;

 class binaryanddecimal{


    // // // Binary to Decimal 
    public static void binarytodecimal(int n) {
        int power = 0 ;
    int number = n ;
         int decimal = 0;
        while(n > 0){
            int lastDigit = n%10;
            decimal = decimal + (int) Math.pow(2, power) * lastDigit ;
            n /= 10;
            power++ ;
        }
        System.out.println("decimal of " +  number + " = " + decimal);
    }



      // // //  Decimal to Binary
      public static void decimaltobinary(int n) {
        int power = 0 ;
         int binary = 0;
         int number = n ;
        while(n > 0){
            int remainder = n%2;
            binary = binary +   remainder * (int) Math.pow(10, power) ;
            n /= 2;
            power++ ;
        }
        System.out.println("binary of " +  number + " = " + binary);
    }
    public static void main(String[] args) {
        binarytodecimal(1000);
        decimaltobinary(11);
    }
}