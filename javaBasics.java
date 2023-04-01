import java.util.* ;
public class javaBasics{



// // // **** Binary to decimal function .
// public static void Bintodec(int n){
//      int pow = 0;
//      int dec= 0;
//      int mynum = n;

//      while(n>0){
//         int lastdigit = n % 10;
//         dec = dec +(lastdigit * (int)Math.pow( 2 , pow ));
//         pow++;
//          n /= 10;
 
//      }
//      System.out.println( "Decimal of " + mynum + " = " + dec );
// }



// // ****  decimal to  Binary  function .
// public static void dectoBin(int n){
//      int pow = 0;
//      int binary= 0;
//      int mynum = n;

//      while(n>0){
//         int remainder = n % 2;
//         binary += (remainder * (int)Math.pow( 10 , pow )) ;
//         pow++;
//         n /= 2;
 
//      }
//      System.out.println( "binary of " + mynum + " = " + binary );
// }




    public static void main (String args[]) {
            // System.out.print("only Few Days\n") ;
            // System.out.println("only Few Days") ;
            // System.out.println("only Few Days") ;


            // ************ pattern question ************
            // System.out.println("****") ;
            // System.out.println("***") ;
            // System.out.println("**") ;
            // System.out.println("**") ;


            // ************ VARIABLES IN jAVA ************
            //   int a = 10;
            //   int b = 5;
            //   String ans = "tell the value";
            //   System.out.println(a);
            //   System.out.println(b);
            //   System.out.println(ans);
             
            //  a = 50;
            //  System.out.println(a);


            
         // ************ Sum of 2 numbers ***********

        // int a = 10;
        // int b = 5;
        // int sum = a + b;
        // System.out.println(sum);






        //  ******"""""" Operators ******""""""
        // ************ Arithmetic Operators *********** 


        //  ******** 1 . binary Operator
        // int a = 15; 
        // int b = 5;

        //  System.out.println("addition = " +  (a+b));
        //  System.out.println(" Subtraction = " +  (a-b));
        //  System.out.println(" multiplication = " +  (a*b));
        //  System.out.println(" division = " +  (a/b));
        //  System.out.println(" modulo/remainder = " +  (a%b));
    
     //  ******** 2 . unary Operator
    //   int a = 11; 
    //    int b =++a;

    //   System.out.println(a);
    //   System.out.println(b);

    // int a = 11; 
    //    int b =a++;

    //   System.out.println(a);
    //   System.out.println(b);

    //      int a = 11; 
    //    int b =a--;

    //   System.out.println(a);
    //   System.out.println(b);

//    int a = 11; 
//        int b =--a;

//       System.out.println(a);
//       System.out.println(b);




// ************ Relational Operators *********** 
        // int a = 15; 
        //  int b = 15;
        //  System.out.println( a==b );
        //  System.out.println( a!=b );
        //  System.out.println( a<b );
        //  System.out.println( a>b );
        //  System.out.println( a<=b );
        //  System.out.println( a>=b );




// ************ Logical Operators ***********        
    // System.out.println( (5>0) && (2>1) );
    // System.out.println( (5>0) && (2>11) );
    // System.out.println( (5>10) && (2>11) );

    //   System.out.println( (5>0) || (2>1) );
    // System.out.println( (5>0) || (2>11) );
    // System.out.println( (5>10) || (2>11) );

    //     System.out.println( ! (5>10) );



// ************ Assignment Operators ***********   

        // int a = 10;
        // a += 10;
        // System.out.println(a);

        // int b = 15;
        // b -= 10;
        // System.out.println(b);

        // int c = 10;
        // c *= 10;
        // System.out.println(c);

        // int d = 10;
        // d /= 2;
        // System.out.println(d);

        // int e = 10;
        // e %= 2;
        // System.out.println(e); 
         
          




 //  ******"""""" Conditional Statements""""""******

 Scanner sc = new Scanner (System.in);


//  (i). if ,else

//  int age = sc.nextInt();
//          if(age>=18){
//                 System.out.println("Wasted time ,No more time waste");
//          }
//          else if(age>= 14 && age < 18){
//                 System.out.println("Correct time ,Dont wASTE ,Easy Progress ");
//          }
//          else{
//                 System.out.println("Utilize Properly");
//          }



// 2. Print the Largest of 2 numbers

// System.out.println("Enter the num1");
// int num1 = sc.nextInt();
// System.out.println("Enter the num2");
// int num2 = sc.nextInt();

// if( num1 > num2 ){
//         System.out.println("num1 is greater " + num1 );
// }
// else{
//          System.out.println("num2 is greater " + num2 );
// }



// 3. Print if number is Odd or even .

// System.out.println("Enter the number");
// int number = sc.nextInt();

// if( number %2 == 0){
//    System.out.println("number is even ");
// }else {
//          System.out.println("number is Odd ");
// }



// (ii)  4 . else if 
//  int age = sc.nextInt();
//          if(age>=18){
//                 System.out.println("Wasted time ,No more time waste");
//          }
//          else if(age>= 14 && age < 18){
//                 System.out.println("Correct time ,Dont wASTE ,Easy Progress ");
//          }
//          else{
//                 System.out.println("Utilize Properly");
//          }

// 5. Income Tax calculator

// System.out.println("Enter the income to know the Tax ");
// int income = sc.nextInt();
// if( income < 500000 ){
//         System.out.println("No Tax");
// }else if ( income > 500000 && income < 1000000 ){
//          System.out.println("20% Tax should be paid = " + income * 0.2 );
// }
// else{
//          System.out.println( "30% Tax should be paid = " + income * 0.3 );
// }

                                // or

//  System.out.println("Enter the income to know the Tax ");
// int income = sc.nextInt();
// int tax;
// if( income < 500000 ){
//        tax = 0 ;
// }else if ( income > 500000 && income < 1000000 ){
//        tax = (int) (income * 0.2);
// }
// else{
//         tax = (int) (income * 0.3);
// }                  

//  System.out.println( "Your Tax is  = " + tax); 


// 6 . Print the Largest of 3 numbers

//  System.out.println("Enter number 1");
// int a  = sc.nextInt();
//  System.out.println("Enter number 2");
// int b = sc.nextInt();
//  System.out.println("Enter number 3");
// int c = sc.nextInt();

// // //  --method 1;
// if( a >= b && a >= c ){
//  System.out.println("a is greater " + a);

// }
// else if(b >= c){
//         System.out.println("b is greater " + b);
// }
// else{
//  System.out.println("c is greater " + c);
// }

// // //  --method 2;
// if( a >= b && a >= c ){
//  System.out.println("a is greater " + a);

// }
// else if(b >= a && b >= c ){
//         System.out.println("b is greater " + b);
// }
// else{
//  System.out.println("c is greater " + c);
// }


// // // --method 3;
// if(a>=b){
//         if(a>=c){
//          System.out.println("a is greater " + a);
//         }
//         else{
//            System.out.println("c is greater " + c);     
//         }
// }else if(b>=a){
//         if( b >= c ){
//              System.out.println("b is greater " + b);   
//         }
//         else {
//          System.out.println("c is greater " + c);
//         }
// }


// // 7. Ternary Operator
// int number = sc.nextInt();
//  String variable = ((number % 2) == 0)? "even " : "odd" ;
//  System.out.println(variable);

// int marks = sc.nextInt();
// String result = (marks < 33)? "Fail" : "Pass" ;
// System.out.println(result);



//  8. Switch Statements

//  System.out.println("Enter the Number");
//  int number = sc.nextInt();
//  switch(number){
//         case 1 :  System.out.println("samosa");break;
//         case 22 :  System.out.println("Burger");break;
//         case 3 :  System.out.println("mango shake");break;

//         default :
//         System.out.println("Anything as you Wish.");
//  } 


//  9. calculator using switch case

//   System.out.println("Enter the Number 1 ");
//   int a = sc.nextInt();
//   System.out.println("Enter the Number 2 ");
//   int b = sc.nextInt();
//   System.out.println("Enter the Operator ");
//   char Operator = sc.next().charAt(0);
//   switch(Operator){
//         case '+' :   System.out.println( a + b );
//         break;
//            case '-' :   System.out.println( a - b );
//         break;
//            case '*' :   System.out.println( a * b );
//         break;
//            case '/' :   System.out.println( a / b );
//         break;
//            case '%' :   System.out.println( a % b );
//         break;
//         default:
//         System.out.println( "Calculator is not that advanced" );
//   }





 //  ******"""""" Loops """"""******

//   => While Loop

// 1.Print " Hello World " 100 Times using while loop .
// int print = 0;
//         while( print < 100 ){
//                 System.out.println("Hello World");
//                 print ++ ;
//         }
//         System.out.println("Completed printing Hello World 100 times ");


// // 2.Print numbers from 1 to 10 using while loop ;
// int number = 1;
//  while( number <= 10){
//           System.out.println(number);
//           number++;
//  }

// 3.Print numbers from 1 to n using while loop ;
// int number = 1;
// System.out.println( "Enter the range till you want to print ");
// int n = sc.nextInt();
//  while( number <= n){
//           System.out.print(number + " ");
//           number++;
//  }


// 4.Print sum of First n natural Numbers using while loop.
// int number = 1;
// System.out.println( "Enter the range till you want to print ");
// int n = sc.nextInt();
// int sum = 0;
//  while( number <= n){
//         sum += number;
//           number++;
//  }
//   System.out.println(sum);



// => For Loop

// 1. Printing hello World 10 times using For Loop.
// for(int i = 1;i<=10;i++){
//  System.out.println("Hello World");
// }

// 2. Printing Square Pattern using For Loop.
// -- method 1
// for(int i = 1;i<=4;i++){
//         for(int j = 0;j<4;j++){
//                  System.out.print("*");
//         }
//         System.out.println();
// }
// -- method 2
// for(int line = 1 ; line <= 4; line++){
//         System.out.println("****");
// }
//  using while loop
// int line = 1;
// while(line <= 4){
//         System.out.println("****");
//         line++;
// }

// // 3.Print Reverse of a number 
// System.out.println("Enter the number ");
// int number = sc.nextInt();
//  while( number > 0 ){
//         int lastdigit = number % 10;
//          System.out.print(lastdigit);
//        number = number / 10;
//  }

// // 4. Reverse the given number
//  System.out.println("Enter the number ");
//  int n = sc.nextInt();
//  int reverse = 0;
//  while(n>0){
//         int lastdigit = n%10;
//         reverse = (reverse * 10) + lastdigit;
//                 n = n/10;
//   }
//         System.out.print(reverse);


// => do-while loop
// int counter = 1;
// do{
//          System.out.println("Hello World");
//          counter++;
// }while(counter<=10);



// --->  Break Statements
// int n = 5;
// for(int i = 1;i<=n;i++){
//         if(i==3){
//              break;
//         }
//         System.out.println(i);   
// }

// --->  Continue Statements
// int n = 5;
// for(int i = 1;i<=n;i++){
//         if(i==3){
//              continue;
//         }
//         System.out.println(i);   
// }




// // Check if a number is prime or not;
// System.out.println("Enter the number ");
// int n = sc.nextInt();

// boolean isPrime = true;
// if( n== 2){
// System.out.println("is Prime");   
// }
// else {
//         for(int i = 2; i <=Math.sqrt(n);i++){
// if(n % i == 0){
// isPrime = false;
// }
// }
// if( isPrime == true){
// System.out.println("is Prime");   
// }else{
//         System.out.println("not Prime");  
// }
// }


// // // ********** Check if a number is prime or not (Optimized solution)

// if(n==2){
//     return true;
// }
// int n = 7;
// for(int i = 2;i<=Math.sqrt(n);i++){
//         if(n%i==0){
//                System.out.println(false);
//         }

// }
// System.out.println(true);


// // // **** Binary to decimal
//  System.out.println("Enter the number... ");  
// int n = sc.nextInt();
// Bintodec(n);


// // // ****  decimal to Binary
//  System.out.println("Enter the number... ");  
// int n = sc.nextInt();
// dectoBin(n);
 

    }
}