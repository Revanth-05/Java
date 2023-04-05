import java.util.*;
public class loops {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        // // // -> while Loop
        
    // //  1. // Print Hello World 100 times using Loops
    //     int counter = 0;
    //   while ( counter < 100 ) {
    //     System.out.println(" Hello World ");
    //     counter++ ;
    //   }
    //   System.out.println(" Printed 100x ");
      
    // // 2. // Print Numbers from 1 to 10 
    // int number = 1;
    // while( number <= 10 ){
    //     System.out.println( number );
    //         number++;
    // }

    // // 3. // Print Numbers from 1 to n
    // int number = 1;
    // int n = sc.nextInt();
    // while (number <= n) {
    //     System.out.println(number);
    //     number++;
    // }
    
    // // 4. // Print Sum of n Natural numbers
    // int number = 1;
    // int n =  sc.nextInt();
    // int sum = 0;
    // while ( number <= n ) {
    //     sum += number;
    //     number++;     
    // }
    // System.out.println(sum);


    // // // -> For Loop

// // 1. // Print hello World 10 times using For Loop
// for( int i = 1 ; i <= 10 ; i++ ){
//     System.out.println("Hello World");
// } 
// System.out.println(" Printed 10x ");

// // 2. // Print Square Pattern using for , while, do-while.
// int row = sc.nextInt();
// int column = sc.nextInt();
// // using "For"
// for(int i = 1 ; i <= row ; i++){
// for(int j = 1;j <= column ; j++){
//     System.out.print("*");
//     }
//     System.out.println();
// }


// // using "While"
// int i = 1;
// int j ;
// while (i <= row ) {
//     j = 1;
//     while (j <= column ) {
//         System.out.print("*");
//         j++;
//     }
//     i++;
//     System.out.println();
// }

// // using " do - While "
// int i = 1;
// int j ;
// do{
// j = 1 ;
// do {
//     System.out.print("*");
//     j++;
// } while (j <= column );
// i++;
// System.out.println();
// }while(i <= row);

// // 3. //  Print Reverse of a number
// int n = 10899;
// for( ; n > 0 ; ){
// int Reverse = n % 10;
// System.out.print(Reverse);
//  n /= 10 ;
// }

// // 4. //  Reverse the given number
//  int n = 10899;
//  int ans = 0;
//  for( ; n != 0 ; ){
//     int remainder = n % 10 ;
//     ans = ans * 10 + remainder ;
     
//         n /= 10;
//  }
//  System.out.println(ans);
 


// // //  -> do-while Loop
// // 1. // Print Hello World 10 Times usind do-while
// int i = 1;
// do{
//     System.out.println("Hello World");
//     i++;
// }while(i <= 10);
// System.out.println(" Printed 10x ");


// // check if a number is Prime or not
// int n = sc.nextInt();
// for( int i = 2 ; i < n ; i++ ){
    
//     if( n == 2 ){
//         System.out.println(" Prime ");
//     break;  
//     }
// if( n % i == 0 ){
//     System.out.println(" It is not prime ");
//     break;
// }
// else{ 
//     System.out.println(" Prime ");
//     break;
// }
// }


// // Write a program that reads a set of integers , and then prints the sum of the even and odd integers
//  int n ;
//  int oddsum = 0;
//  int evensum = 0;
//  int choice ;

//  do{
//     System.out.println(" Enter a Positive Number");
//     n = sc.nextInt();
//     if( n % 2 == 0 ){
//        evensum += n ;
//     }
//     else {
//        oddsum += n ;

//     }
//     System.out.println(" if you want to continue Press 1 , else Press 0 " );
//     choice = sc.nextInt();
//  } while( choice == 1 );

//  System.out.println( "Even Sum is " + ( evensum ) );
//  System.out.println( "Odd Sum is " + ( oddsum ) );



// //  Write a program to find the factorial of any number entered by the user.
// int n ;
// System.out.println(" Enter the number ");
// n = sc.nextInt();
// int fact = 1;
// for(int i = 1 ; i <= n ; i++ ){
//   fact *= i ;
// }
// System.out.println("Factorial of given " + n + " is " + fact);
    

// // Write a program to print the multiplication table of a number N , entered by the user.

System.out.println(" Enter the number ");
int n = sc .nextInt();
// for( int i = 1 ; i <= 10 ; i++ ){
//     System.out.println( n + " * " + i + " = " + ( n * i ) );
// }
int i;
do{
 i = 1 ;
 System.out.println( n + " * " + i + " = " + ( n * i ) );
i++;
}while( i <= 10 );


    }
}
 