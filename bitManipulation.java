import java.util.*;
public class bitManipulation {
    
    public static void oddorEven(int number){
        int n = 1;
        int k = number & n;
        if(k == 0){
            System.out.println("Even");
        }
        else{
            System.out.println("Odd");
        }
    }


// method 1
    public static int getIthBit(int number , int i){
        int bit = 1 << i;
        if((number & bit) == 0){
            return 0;
        }
        return 1;
    }

// method 2 -->my own code
    public static int getIthBit_1(int number , int i){
        int bit = number >> i;
        if((bit & 1) == 1){
            return 1;
        }
        return 0;
    }


    public static int setIthBit(int number , int i) {
        int bit = 1 << i ;
        return (number | bit);
    }

    public static int clearIthBit(int number , int i) {
        int bit = ~(1 << i) ;
        return (number & bit);
    }

    public static int updateIthBit(int number ,int i , int bit){
        if(bit == 0){
            return clearIthBit(number, i);
        }
        else{
          return  setIthBit(number, i);
        }
    }

    public static int clearIBits(int number , int i) {
        int bit = -1 << i;
        return number & bit ;
    }

     public static int clearBitsInRange(int number , int i , int  j) {
        int a = (~(0) << (j+1));
        int b = ( 1 << i ) - 1 ;
        int bitmask = a | b ;
        return number & bitmask;

    }

    public static boolean checkPower(int number) {
        if((number & (number - 1)) == 0){
            return true;
        }
        return false;
    }

    public static int countSetBits(int number) {
        int count = 0 ;
        while(number > 0){
            if( (number & 1) != 0){
                count++;
            }
            number = number>>1;
        }
        return count;
    }

    public static int fastExponentiation(int a ,int n) {
        int ans = 1;
        while(n > 0){
            if((n & 1) != 0){
                ans = ans * a;
            }
            a *= a;
            n = n>>1;
        }
        return ans;
    }
    public static void main(String[] args) {
        System.out.println(5 & 6);  //-->And Operator
        System.out.println(5 | 6);  //-->or Operator
        System.out.println(5 ^ 6);  //-->xor Operator
        System.out.println(~-1);  //-->one's Compliment / not Operator
        System.out.println(5 << 2);  //-->Left Shift Operator
        System.out.println(5 >> 2);  //-->Right Shift Operator

        oddorEven(0);
        oddorEven(5);
        
        System.out.println(getIthBit(10, 2));
        System.out.println(getIthBit_1(10, 2));
        System.out.println(setIthBit(10, 2));
        System.out.println(clearIthBit(10, 1));
        System.out.println(updateIthBit(10, 2, 1));
        System.out.println(clearIBits(15 ,2));
        System.out.println(clearBitsInRange(10 ,2,4));
        System.out.println(checkPower(6));
        System.out.println(countSetBits(16));
        System.out.println(fastExponentiation(5,3));

        // Swap two numbers without using any third variable.
        int a = 3;
        int b = 4;
        System.out.println("before Swapping a = "+ a);
        System.out.println("before Swapping b = "+ b);
        a = a ^ b;
        b = a ^ b;
        a = a ^ b;
        System.out.println("After Swapping a = "+ a);
        System.out.println("After Swapping b = "+ b);

    //   Add 1 to an integer using Bit Manipulation.(use ~ not operator)
       int x =  6;
       System.out.println(x + " + " + 1  + " is " + -(~x));
       x = -4;
       System.out.println(x + " + " + 1  + " is " + -(~x));
       x = 0;
       System.out.println(x + " + " + 1  + " is " + -(~x));


        //  Convert uppercase characters to lowercase using bits.
        for(char i = 'A' ; i <= 'Z' ; i++){
            System.out.print((char)((i) | ' '));
        }
    }

}
