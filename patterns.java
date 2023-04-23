import java.util.*;

public class patterns {
        public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number");
        int n = sc.nextInt();

// // // Star Pattern
// for( int i = 1 ; i <= n ; i++ ){
//         for( int j = 1 ; j <= i ; j++ ){
//                 System.out.print("*");
//         }
//         System.out.println();
// }


// // // Inverted Star Pattern 
// for( int i = 1 ; i <= n ; i++ ){
// for( int j = i ; j <= n ; j++ ){
//         System.out.print("*");
// }
// System.out.println();
// }

// // // Half Pyramid Pattern
// for(int i = 1 ; i <= n ; i++){
// for(int j = 1 ; j <= i ; j++){
//         System.out.print(j);
// }
// System.out.println();
// }

// // // Print Character Pattern
// char ch = 'A';
// for( int i = 1 ; i <= n ; i++ ){
// for( int j = 1 ; j <= i ; j++ ){
//  System.out.print(ch);
//  ch++;
// }
// System.out.println();
// }

// // // Hollow Rectangle 
//  int rows = 4 ;
//  int colums = 5;
//  for(int i = 1 ; i <= rows ; i++){
//  for(int j = 1 ; j <= colums;j++){
//         if( i == 1 || i == rows || j == 1 || j == colums ){
//                 System.out.print("*");
//         }
//         else{
//                 System.out.print(" ");
//         }
//  }
//  System.out.println();
//  }


// // // INVERTED & ROTATED HALF-PYRAMID pattern 

// for(int i = 1 ; i <= n ; i++){
// for(int j = 1 ; j <= n-i;j++){
//         System.out.print(" ");
// }
// for(int j = 1 ; j <= i ; j++ ){
//         System.out.print("*");
// }
// System.out.println("");
// }


// // //  INVERTED HALF-PYRAMID with Numbers pattern 
// int num = 1 ;
// for(int i = 0 ; i < n ; i++){
//         for( int  j = 1 ; j <= n-i ; j++){
//                 System.out.print(num);
//                 num++;
//         }
//         System.out.println();
//         num = 1;
// }

// // //       or

// for (int i = 0; i < n; i++) {
// for (int j  = 1; j <= n-i; j++) {
//         System.out.print(j);
// }
// System.out.println();
// }

// // //       or

// for(int i = 1 ; i <= n; i++ ){
//         for(int j = 1 ; j <= n - i + 1 ; j++ ){
//                 System.out.print(j + " ");
//         }
//         System.out.println("");
// }

// // // FLOYD'S Triangle pattern
// int num = 1 ;
// for( int i = 1 ; i <= n; i++ ){
//         for( int j = 1; j <= i ; j++ ){
//                 System.out.print(num + " " );
//                 num++;
//         }
//         System.out.println();
// }


// // // 0 - 1 Triangle pattern
//  for(int i = 1 ; i <= n ; i++ ){
//  for(int j = 1 ; j <= i ; j++ ){
//         if((((i + j) % 2) == 0)){
//                 System.out.print("1");
//         }
//         else{
//                 System.out.print("0");
//         }
//  }
//         System.out.println();
//  }


// // Butterfly Pattern ----------
// // UP SIde 
// for (int i = 1 ; i <= n ; i++){ 
//         // Left Side
// for (int j = 1 ; j <= i ; j++) {
//         System.out.print("*");
// }
//         // Space
// for(int j = 1 ;j <= 2*(n-i);j++){
//         System.out.print(" ");
// }
//         // Right Side
// for (int j = 1 ; j <= i ; j++) {
//         System.out.print("*");
// }
// System.out.println();
// }

//         // // DownSide
//         // Left Side
// for(int i = 1; i <= n ; i++ ){
// for(int j = i ; j <= n ; j++ ){
//         System.out.print("*");
//       }
// // // Space 
// for(int j = 1; j <= 2* (i - 1) ; j++ ){
//         System.out.print(" ");
// }
// //       Right Side
// for(int j = i ; j <= n ; j++ ){
//         System.out.print("*");
//       }
// System.out.println();
// }


// // // Solid Rhombus Pattern
// for(int i = 1 ;i <= n ; i++ ){
// for (int j = i; j <= n; j++) {
//         System.out.print(" ");
// }
// for (int j = 1; j <= n; j++) {
//         System.out.print("*");
// }
//         System.out.println();
// }


// // // Hollow Rhombus Pattern
// for(int i = 1 ;i<= n ; i++){
// for (int j = 1; j <= n - i ; j++) {
//         System.out.print(" ");
// }
// for(int j = 1 ;j <= n;j++){
//         if( j == 1 || j == n || i == 1 || i == n){
//                 System.out.print("*");
//         }
//         else{
//                 System.out.print(" ");
//         }
// }
// System.out.println();
// }


// // // Diamond Pattern 
// for( int i = 1 ; i<=n;i++){
// for(int j = 1; j <= n - i; j++) {
//         System.out.print(" ");              
//         }
//         for (int j = 1; j <= (2*i )- 1 ; j++) {
//                 System.out.print("*");
//         }
//         System.out.println("");
// }
// for(int i = n ;i >= 1;i--){
//         for(int j = 1; j <= n - i; j++) {
//               System.out.print(" ");              
//               }
//              for (int j = 1; j <= (2*i )- 1 ; j++) {
//                      System.out.print("*");
//              }
//            System.out.println("");
// }


// // // Number Pyramid Pattern
// for(int i = 1 ; i <= n ;i++){
// for(int j = 1 ; j <= n - i ; j++){
//         System.out.print(" ");
// }
// for (int j = 1; j <= i ; j++) {
//         System.out.print(i + " ");
// }
// System.out.println();
// }


// // // PALINDROMIC Pattern with Numbers pattern
// for(int i = 1 ;i <= n ;i++ ){
// for(int j = 1 ; j <= n - i ; j++){
//        System.out.print(" ");
// }
// for(int j = i ; j >= 1 ; j-- ){
// System.out.print(j);
// }
// for(int j = 2 ;j <= i ; j++){
//         System.out.print(j);
// }
//  System.out.println();
// }



// // // Right Arrow Pattern
        // for (int i = 1; i <= n; i++) {
        //     for (int j = 1; j <= n; j++) {
        //         System.out.print(" ");
        //     }
        //       for (int j = 1; j <= i; j++) {
        //         System.out.print("*");
        //     }
        //     System.out.println("");
        // }
        // for (int i = 1; i <= (2*n) + 1; i++) {
        //     System.out.print("*");
        // }
        // System.out.println("");
        //   for (int i = n; i>= 1; i--) {
        //     for (int j = 1; j <= n; j++) {
        //         System.out.print(" ");
        //     }
        //       for (int j = 1; j <= i; j++) {
        //         System.out.print("*");
        //     }
        //     System.out.println("");
        // }
}
} 
