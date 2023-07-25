import java.util.*;
public class RecursionBasics {
    static String digits[] = {"zero" , "one" , "two" , "three" , " four" , "five" , "six" , "seven" , "eight" , "nine"};
    public static void decreasingOrder(int n){
        if( n == 1 ){
            System.out.print(n);
            return ;
        }
        System.out.print(n + " ");
        decreasingOrder(n-1);
    }

    public static void increasingOrder(int n){
        if(n == 1){
            System.out.print(n + " ");
            return;
        }
        increasingOrder(n-1);
        System.out.print(n+" ");
    }

    public static int factorial(int n){
        if( n == 0 ){
            return 1;
        }
        int fnm1 = factorial(n-1);  
        int fn = n * fnm1 ;
        return fn;
    }

    public static int sum(int n){
        if( n == 1 ){
            return n;
        }
        int sumOfn =  n + sum(n-1);
        return sumOfn;
    }


    public static int fibonacci(int n){
        if( n == 0 || n == 1 ){
            return n;
        } 
        return (fibonacci(n-1) + fibonacci(n-2));
    }


     public static boolean isSorted(int arr[], int i){
        if(i == arr.length - 1){
            return true;
        }
            if(arr[i] > arr[i+1]){
                return false;
            }
            return isSorted(arr, i+1);
        }

        public static int firstOccurence(int arr[] , int i , int key) {
            if( i == arr.length){
                return -1;
            }

            if(arr[i] == key){
                return i;
            }
            return firstOccurence(arr , i+1 , key);
        }

        public static int lastOccurence(int arr[], int key, int i){
            if(i == 0){
                return -1;
            }
            if(arr[i] == key){
                return i ;
            }
            return lastOccurence(arr, key, i-1);
        }


        public static int power(int x , int n){
            if(n == 0 ){
                return 1 ;
            }
            return x * power(x, n-1);
        }
 public static int optimisedPower(int x , int n){
            int a = optimisedPower(x, n/2);
            
            if(n == 0 ){
                return 1 ;
            }      
            int halfpow = a*a;      
            if(n%2 != 0){
                halfpow = x * halfpow;
            }
            return halfpow;
        }

     public static int tilingProblem(int n){
        // base case
        if(n == 0 || n == 1){
            return 1;
        }

        // kaam
        // vertical choice
        // int fnm1 = tilingProblem(n-1);
        // // Horizontal choice
        // int  fnm2 = tilingProblem(n-2);
        // int totalways = fnm1 + fnm2 ;
        // return totalways;

        return tilingProblem(n-1) + tilingProblem(n-2);
     }

     public static void removeDuplicates(String str , int idx , StringBuilder newStr , boolean track[]){
        // base case
        if(idx == str.length()){
            System.out.println(newStr);
            return;
        }

        // kaam
        char currChar = str.charAt(idx);
        if(track[currChar-'a'] == true){
            // duplicate
            removeDuplicates(str, idx+1, newStr, track);
        }
        else{
            track[currChar-'a'] = true;
            removeDuplicates(str, idx+1, newStr.append(currChar), track);
        }
     }

     public static int friendsPairing(int n){
        int totalways = 0;
        if( n == 1 || n == 2){
            return n ;
        }
        // choice 
        // single
        int fnm1 = friendsPairing(n-1);
        // Pair
        int fnm2 = friendsPairing(n-2);
        int pairWays =  (n-1) * fnm2 ;

         totalways = fnm1 + pairWays;
        return totalways;

        // return friendsPairing(n-1) + ((n-1) * friendsPairing(n-2));
     }

     public static void printBinStrings(int n , int lastPlace , String str){
        // base 
        if( n == 0 ){
            System.out.println(str);
            return ;
        }
        // // kaam 
        // method - 1 :
        // if ( lastPlace == '0' ){
        //     printBinStrings(n-1, 0, str+"0");
        //     printBinStrings(n-1, 1, str+"1");
        // }
        // else{
        //     printBinStrings(n-1, 0, str+"0");
        // }

        // Method - 2 :
        printBinStrings(n-1, 0, str+"0");
        if(lastPlace == 0){
            printBinStrings(n-1, 1, str+"1");
        }
     }

     public static void findIndices(int arr[],int key ,int idx){
        if(idx == arr.length){
            return;
        } 
        if(arr[idx] == key){
            System.out.print(idx + " ");
        }
        findIndices(arr, key, idx+1);
     }

     
     public static void stringDigit(int n){
        if(n == 0){
            return;
        }
        int lastDigit = n % 10;
        stringDigit(n/10);
        System.out.print(digits[lastDigit] +" ");
     }

     public static int length(String str){
        if(str.length() == 0 ){
            return 0;
        }
        return length(str.substring(1))+1;
     }

     public static int findSubStrings(String s , int i , int j ,int n) {
        if(n == 1){
            return 1;
        }
        if(n <= 0){
            return 0;
        }
        int substring = findSubStrings(s, i+1, j, n-1)+
                        findSubStrings(s,i,j-1,n-1) - 
                        findSubStrings(s, i+1, j-1, n-2);

                        if(s.charAt(i) == s.charAt(j) ){
                            substring++;
                        }
                       return substring;
     }

     public static void towerOfHanoi(int n,String src , String help , String dest){
        if( n == 1 ){
        System.out.println("Transfer Disks "+ n + " from " + src + " to "+ dest);
        return;
        }
        towerOfHanoi(n-1,src, dest, help);
        System.out.println("Transfer Disks "+ n + " from " + src + " to "+ dest);
        towerOfHanoi(n-1,help, src, dest);
     }


     public static void printReverseString(String str , int idx){
        if(idx == 0){
            System.out.print(str.charAt(idx));
            return;
        }
        
        System.out.print(str.charAt(idx));
        printReverseString(str,idx-1);
     }

     public static void moveAllX(String str , int idx , int count ,String newString ){
        if(idx == str.length()){
            for(int i = 0 ; i < count ; i++){
                newString += 'x';
            }
            System.out.println(newString);
            return;
        }
        if(str.charAt(idx) == 'x'){
            count++;
            moveAllX(str, idx+1, count, newString);
        }
        else{
            newString += str.charAt(idx);
            moveAllX(str, idx+1, count, newString);
        }
     }

        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    // // *** Print Numbers in Decreasing Order *** 
    int n = 10;
    decreasingOrder(n);
    System.out.println();

    // // *** Print Numbers in Increasing Order *** 
    increasingOrder(n);
    System.out.println();

    // // *** Factorial of a number ***
    System.out.println("Enter the number");
    n = sc.nextInt();
        System.out.println("Factorial of " + n + " is " + factorial(n));
    
    // // *** Print Sum of n natural Numbers ***
        System.out.println("Enter the number");
        n = sc.nextInt();
        System.out.println("Sum of " + n + " natural Numbers = " + sum(n));

// // *** Print nth Fibonacci Numbers ***
        System.out.println("Enter the number");
        n = sc.nextInt();
        System.out.println("Fibonacci Number of " + n + " is " + fibonacci(n));  
        
        
// // *** Print if a Array is Sorted or Not ***
       int arr[] = {1,2,3,5,4};
       System.out.println("Array is Sorted = " + isSorted(arr, 0));

       // // *** Print First Occurence of an element in an Array ***
       int a[] = {8,2,4,1,5,6,7};
       System.out.println("First Occurence = " + firstOccurence(a, 0,5));

    // // *** Print Last Occurence of an element in an Array ***
       int ar[] = {8,2,4,1,5,6,7,5,8,9};
       System.out.println("Last Occurence = " + lastOccurence(ar,5, ar.length-1));       

    // // Print x to the Power n
     System.out.println("x to the Power n = " + power(2,10));       

     // // Print x to the Power n(optimized Solution)
     System.out.println("optimized x to the Power n = " + power(2,10));

    // // Tiling Problem
    n = 3;
    System.out.println("Total ways = " + tilingProblem(n));

    // // Remove Duplicates in a String
                String s = "apnnacollege";
                removeDuplicates(s, 0,new StringBuilder(""), new boolean[26]);

    // // Friends Pairing Problem
    System.out.println(friendsPairing(5));

    // Print all Binary Strings without consecutive 1's
            printBinStrings(3, 0, "");


    // Question 1 : For a given integer array of size N. You have to find all the occurrences(indices) of a given element(Key) and print them.
    int array[] = {3, 2, 4, 5, 6, 2, 7, 2, 2};
    int key = 2;
    findIndices(array,key,0);
    System.out.println();

    // Question 2 :You are given a number (eg -  2019), convert it into a String of english like“two zero one nine”.
             n = 2005;
             stringDigit(n);
                 System.out.println();

                 
    //  Question 3 :Write a program to find Length of a String using Recursion  
    String str = "revi";    
 System.out.println("length of string is " + length(str));
   
//   Question 4 : We are given a string S,we need to find the count of all contiguous sub strings starting and ending with the same character
String st = "abcab";
n = st.length();
System.out.println(findSubStrings(st, 0, n-1, n));

// Question 5 : TOWER OF HANOI (Very Very Important!)
n = 3 ;
towerOfHanoi(n, "A","B", "C");

// // Extra Questions 
// Q1 : Print string in reverse
str = "Habibi";
printReverseString(str , str.length()-1);
System.out.println();

// Q2 : Move all 'x' to the end of the string
str = "axbcxxd";
moveAllX( str , 0 , 0 , "" ); 
}
}
