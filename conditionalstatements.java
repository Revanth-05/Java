import java.util.*;
public class conditionalstatements {
    public static void main(String args[]){
        Scanner sc = new Scanner (System.in);


// // // Check your Age Category ? (using if else)
//    int age = sc.nextInt();
//    if( age >= 14 && age < 18 ){
//     System.out.println("You are a teenager");
//    }
//    else if( age >= 18 ){
//     System.out.println("You are a adult");
//    }
//    else{
//     System.out.println("You are a kid");
//    }

// // // Print the Largest of 2 numbers 
// int num1 = sc.nextInt();
// int num2 = sc.nextInt();
// if(num1 > num2){
//     System.out.println(" num1 is Greater than num2 ");
// }
// else if(num1 < num2){
//     System.out.println(" num2 is Greater than num1 ");
// }
// else{
//     System.out.println(" num1 is equals to num2 ");
// }


// // // Print if a number is Odd or Even 
// int number = sc.nextInt();
// if( number % 2 ==  0 ){
//     System.out.println(" Given Number is Even ");
// }
// else {
//     System.out.println(" Given Number is Odd ");
// }

// // // Income tax calculator using java 
// System.out.println(" Enter your Income/Salary ");
// int income = sc.nextInt();
// if(income < 500000){
//     System.out.println("No tax / Free tax ,0%");
// }else if(income >= 500000 && income < 1000000){
//     System.out.println("20% Income Tax = " + income *0.2);
// }
// else{
//     System.out.println("30% Income Tax = " + income * 0.3);
// }

// // // print the largest of 3 numbers 
// int num1 = sc.nextInt();
// int num2 = sc.nextInt();
// int num3 = sc.nextInt();
// if(num1 >= num2){
//     if(num1 >= num3){
//   System.out.println(" num1 is Greatest ");
//     }
//     else{
//         System.out.println(" num3 is Greatest ");
//     }
// }
// else  if(num2 >= num1){
//     if(num2 >= num3){
//     System.out.println(" num2 is Greatest ");
//       }
//       else{
//           System.out.println(" num3 is Greatest ");
//       }
//     }

// // // Check if a Student will Pass or Fail
// int marks = sc.nextInt();
// String result = (marks >= 40) ? "Pass" : "Fail";
// System.out.println(result);





// // //  **** Switch Case Statements ****

// int number  = sc.nextInt();
// switch(number){
// case 1 : System.out.println("Eat");
// break;
// case 2 : System.out.println("Sleep");
// break;
// case 3 : System.out.println("Play");
// break;
// default : System.out.println("Study");
// }

// // // Make calculator using java
// System.out.println("Enter number 1");
// int num1 = sc.nextInt();
// System.out.println("Enter number 2");
// int num2 = sc.nextInt();
// System.out.println("Enter the operator");
// char operator = sc.next().charAt(0);
// switch(operator){
//     case '+' : System.out.println(num1 + num2);
//     break;
//     case '-' : System.out.println(num1 - num2);
//     break;
//     case '*' : System.out.println(num1 * num2);
//     break;
//     case '/' : System.out.println(num1 / num2);
//     break;
//     case '%' : System.out.println(num1 % num2);
//     break;

//     default : System.out.println("Enter proper operator");
// }


// // // Write a Java program to get a number from the user and print whether it is positive or negative.
// int number = sc.nextInt();
// if( number < 0 ) {
//     System.out.println("Number is Negative ");
// }
// else if ( number > 0 ){
//     System.out.println("Number is Positive ");
// }
// else {
//     System.out.println("Number is zero ");
// }

// // // Write Java code that  prints , You have fever ,if your temperature is above 100 and otherwise prints , You don't have a fever.
// System.out.println(" Enter the Temperature "); 
// double temp = sc.nextDouble();
//  if(temp > 100 ){
//     System.out.println(" You have fever ");
//  }
//  else{
//     System.out.println(" You don't have fever ");
//  }

// // // Write a Java program to input week number (1-7) and print day of week name using switch case
// System.out.println(" Enter Day Number ");
// int Weeknumber = sc.nextInt();
// switch(Weeknumber){
//     case 1 : System.out.println(" Sunday ");
//     break;
//     case 2 : System.out.println(" Monday ");
//     break;
//     case 3 : System.out.println(" Tuesday ");
//     break;
//     case 4 : System.out.println(" Wednesday ");
//     break;
//     case 5 : System.out.println(" Thursday ");
//     break;
//     case 6 : System.out.println(" Friday ");
//     break;
//     case 7 : System.out.println(" Saturday ");
//     break;
//     default : System.out.println(" Day does not exist ");
// }

// // // Write a Java program that takes a year from the user and print whether that year is a leap year or not.
// System.out.println(" Enter year ");
// int year = sc.nextInt();
// if( (year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0)){
//     System.out.println(year + " is a Leap year ");
// }
// else{
//     System.out.println(year + " is not a Leap Year ");
// }
}
    }

