import java.util.*;
import java.util.stream.IntStream;
public class functionsandmethods{
    
    // // // Print Hello World Using functions ?
    // public static void HelloWorld(){
    //     System.out.println("Hello World");
    //     System.out.println("Hello World");
    //     System.out.println("Hello World");
    //     System.out.println("Hello World");
    // }

    // // //  Find Sum ?
    // public static void CalculateSum(){
    //     Scanner sc = new Scanner(System.in);
    //     int a = sc.nextInt();
    //     int b = sc.nextInt();
    //     int Sum = a + b;
    //     System.out.println(Sum);

    // }
    // public static int sum(int a , int b){
    //     int Sum = a + b;
    //     return Sum;
    // }


    // // // // Find Product ?
    // public static int product(int num1 , int num2 ){
    //     return num1*num2;
    // }


    // // // Find Factorial ?
    // public static void getfactorail(int number){
    //     int fact = 1;
    //     for(int i = 1 ; i <= number ; i++ ){
    //         fact *= i ;
    //     }
    //         System.out.println(fact);
    // }
      


    // // // Find Binomial Factorial of a number
    // public static int BinomialFactorial(int number){
    //     int fact = 1 ;
    //     for( int i = 1 ; i <= number ; i++ ){
    //         fact *= i;
    //     }

    //     return fact;
    // }


//     // // // Check if a number is prime or not 
//         public static void PrimeorNot(int n){

//             for(int i = 2 ; i <= n ; i++ ){
//                 // if( i == 2 ){
//                 //    System.out.println("Number is Prime");
//                 //    break;
//                 // }
//                 if ( n % i == 0 ) {
//                     System.out.println("Number is not  Prime"); 
//                     break;
//                 }
                 
                   
//             }
//             System.out.println("Number is Prime");
//         }

        
// // // Print all Primes in range
// // public static void PrimesinRange(int n){
// //     for(int i = 2 ; i <= n;i++){
// //         if(PrimeorNot(i) == 0 ){
// //             continue;
// //         }
// //         else{
// //             System.out.println(i);
// //         }
// //     }
// // }


// // // Write a Java method to compute the average of three numbers
// public static int average(int a , int b ,int c) {
//     int Average = (a + b + c) / 3;
//     return Average;
// }


// // //  Write a method / Function named isEven that accepts an int argument . The method should return true if the argument is even , or false otherwise . Also write a program to test your method / function.
// public static boolean isEven(int n) {
//     if( n % 2 == 0){
//         return true;
//     }
//     else{
//         return false;
//     }
// } 



// // // Write a Java program to check if a number is a palindrome in Java
// public static void palindrome(int n ) {
//     int newvalue = 0;
//     int oldvalue = n ;
//     while( n > 0){
//         int lastdigit = n % 10;
//         newvalue = newvalue * 10 + lastdigit;
//         n /= 10 ;
//     }
//     if( newvalue == oldvalue){
//         System.out.println("It is a palindrome");
//     }
//     else{
//         System.out.println("It is not a palindrome");
//     }
// }



// // // Some  methods of the Math class in Java:
// public static void someimportantMethods(int num1 , int num2 ) {
//     int minimum = Math.min(num1,num2);
//     System.out.println(" Minimum of 2 numbers is " + minimum );

//     int maximum = Math.max(num1,num2);
//     System.out.println(" Maximum of 2 numbers is " + maximum );

//     int squareroot = (int) Math.sqrt(num1);
//     System.out.println(" squareroot of "+ num1  + " = " + squareroot );

//     int Power = (int) Math.pow(num1,num2);
//     System.out.println(num1 + " Power " + num2 + " = " + Power );

//     // int Average =  Math.avg( maximum );
//     // System.out.println(" Average of 2 numbers is " + Average );

//     int Absolute = Math.abs(num2);
//     System.out.println(" Absolute value of  number 2 is " + Absolute );
// }

// Write a Java method to compute the sum of the digits in an integer
public static int SumofDigits(int n) {
    
    int sumofdigits = 0;
    while(n > 0 ){
        int lastdigit = n % 10;
        sumofdigits += lastdigit ;
        n /= 10;

    }
    return sumofdigits;
}

public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        // System.out.println("Enter number 1");
        // int a = sc.nextInt();
        // System.out.println("Enter number 2");
        // int b = sc.nextInt();

        // HelloWorld();

        // CalculateSum();

        // System.out.println("Sum of num1 + num 2 = " + sum(a, b));

        // System.out.println("Product of num1 * num 2 = " + product(a, b));

        // getfactorail(b);


        // System.out.println("Enter n");
        // int a = sc.nextInt();
        // System.out.println("Enter f");
        // int b = sc.nextInt();
        // int n   = BinomialFactorial(a);
        // int f = BinomialFactorial(b);
        // int c = a - b;
        // int nmf = BinomialFactorial( c );
        // int d = f * nmf;
        // int binomialFactorial = n / d ;
        // System.out.println(binomialFactorial);


       //  // PrimeorNot( a );


        // // PrimesinRange(12);

//    System.out.println("Enter number 1");
// int a = sc.nextInt();
// System.out.println("Enter number 2");
// int b = sc.nextInt();
// System.out.println("Enter number 3");
// int c = sc.nextInt();
// System.out.println("Average of 3 numbers = " + average(a, b, c));



// System.out.println("Enter the number ");
// int number =  sc.nextInt();
// if(isEven(number) == true){
//     System.out.println("It is Even Number");
// }
// else{
//     System.out.println("It is not Even Number");
// }
        



// System.out.println("Enter the number ");
// int number =  sc.nextInt();
// palindrome(number);



// System.out.println("Enter number 1");
// int a = sc.nextInt();
// System.out.println("Enter number 2");
// int b = sc.nextInt();
// someimportantMethods(a,b);


System.out.println("Enter an integer");
int digits = sc.nextInt();
System.out.println(SumofDigits(digits));


    }
}