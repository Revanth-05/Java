import java.util.*;
public class strings {
    
    // public static void printletters(String str) {
    //     System.out.println(str.charAt(7));
    //     for(int i = 0 ; i < str.length();i++){
    //         System.out.print(str.charAt(i) + " ");
    //     }
    //     System.out.println();
    // }


    // // Method 1;
    // public static boolean checkPalindrome(String str) {
    //     int start = 0 ; 
    //     int end = str.length()-1;
    //     for(int i = 0 ; i < str.length() ; i++ ){
    //         if(str.charAt(start) != str.charAt(end)){
    //             return false;
    //         }
    //         start++;
    //         end--;
    //     }
    //     return true;
    // }

//  // // Method 2;
//  public static boolean palindrome(String str) {
//     int n = str.length();
//     for(int i = 0 ; i < n/2 ; i++){
//         if(str.charAt(i) != str.charAt(n-1-i)){
//             return false;
//         }
//     }
//     return true;
//  }



    // public static float direction(String way){
    //     int x_Axis = 0 , y_Axis = 0;
    //     for(int i = 0; i<way.length() ; i++){
        
    //         // north
    //         if(way.charAt(i) == 'N'){
    //             y_Axis += 1;
    //         }

    //         // South
    //         if(way.charAt(i) == 'S'){
    //             y_Axis -= 1;
    //         }

    //         // East
    //         if(way.charAt(i) == 'E'){
    //             x_Axis += 1;
    //         }

    //         // West
    //         if(way.charAt(i) == 'W'){
    //             x_Axis -= 1;
    //         }
    //     }
    //    return (float)Math.sqrt(x_Axis*x_Axis + y_Axis*y_Axis);
    // }


    // public static String subString(String str, int si , int ei){
    //    String sub = "";
    //     for(int i = si ; i < ei ; i++ ){
    //         sub += str.charAt(i);
    //     }
    //     return sub;
    // }



    // public static String upperCase(String str) {
    //     StringBuilder s = new StringBuilder("");
    //     char c = Character.toUpperCase(str.charAt(0));
    //     s.append(c);
    //     for(int i = 1 ; i < str.length() ; i++){
    //         if(str.charAt(i) == ' ' && i < str.length()-1){
    //             s.append(str.charAt(i));
    //             i++;
    //             s.append(Character.toUpperCase(str.charAt(i)));
    //         }
    //         else{
    //             s.append(str.charAt(i));
    //         }
    //     }
    //     return s.toString();
    // }


    // public static String compression(String str){
    //     String newstr = "";
    //     for(int i = 0 ; i < str.length() ; i++){
    //         Integer count  = 1 ;
    //         while(i < str.length()-1  && str.charAt(i) == str.charAt(i+1)){
    //             count++;
    //             i++;
    //             }
    //             newstr += str.charAt(i);
    //             if(count > 1){
    //                 newstr += count.toString();
    //             }
    //     }
    //     return newstr;
    // }


    // public static String compressionUsingBuilder(String str){
    //     StringBuilder s = new StringBuilder("");
    //     for(int i = 0 ; i < str.length() ; i++){
    //         Integer count = 1;
    //         while(i < str.length()-1 && str.charAt(i) == str.charAt(i+1)){
    //             count++;
    //             i++;
    //         }
    //         s.append(str.charAt(i));
    //         if(count > 1){
    //             s.append(count.toString());
    //         }
           
    //     }
    //     return s.toString();
    // }


        // public static int getVowels(String str) {
        //   int count = 0;
        //   for(int i = 0 ; i < str.length() ; i++){
        //    char c = str.charAt(i);
        //     if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' ){
        //         count++;
        //     }
        //     else{
        //         count += 0;
        //     }
        //   }
        //     return count;
        // }

    public static void main(String[] args) {
Scanner sc = new Scanner(System.in); 

// // *** Concatenate
        // System.out.println("Enter firstname");
        // String firstname = sc.nextLine();
        // System.out.println("Enter lasttname");
        // String lastname = sc.nextLine();
        // String fullname = firstname + " " + lastname ; //--> using Concatenate
        // System.out.println(fullname);

        // printletters(fullname);


//  // *** Palindrome
//  System.out.println("Enter the word");
//         String str = sc.next();
//         boolean ans = checkPalindrome(str) ;//-->Method 1
//     // boolean ans = palindrome(str); //-->Method 2
//       if(ans == true ){
//         System.out.println("It is palindrome");
//       }
//       else{
//         System.out.println("It is not palindrome");
//     }


// // *** Shortest Path
//     String path = "WNEENESENNN";
// System.out.println(direction(path));



// // *** Comparision
// String s1 = "habibi";
// String s2 = "habibi";
// String s3 = new String("habibi");
// // if(s1 == s2){
// //     System.out.println("Both are Equal");
// // }
// // else{
// //     System.out.println("Both are Not Equal");
// // }

// // if(s1 == s3){  // == does not work for all conditions
// //     System.out.println("Both are Equal");
// // }
// // else{
// //     System.out.println("Both are Not Equal");
// // }

// if(s1.equals(s3)){  //-->  .equals compares the value
//     System.out.println("Both are Equal");
// }
// else{
//     System.out.println("Both are Not Equal");
// }


// // *** SubStrings
// String str = "Habibi Welcome to Dubai";
// // System.out.println(subString(str,0 ,10));
// System.out.println(str.substring( 0, 5)); // --> Inbuilt 


// // *** Largest in a String
// String fruits[] = {"apple" , "banana" , "mango"} ;
// String largest = fruits[0] ;
// for(int  i = 1 ; i < fruits.length;i++){
// if(largest.compareToIgnoreCase(fruits[i]) < 0){
//     largest = fruits[i];
// }
// }
// System.out.println("largest = " + largest);


// // // *** String builder
// StringBuilder name  = new StringBuilder("revi");

// name.toString();
// System.out.println(name);

// StringBuilder a = new StringBuilder("");
// for(char c = 'a' ; c <= 'z' ; c++){
//     a.append(c);
// }
// System.out.println(a);
// System.out.println(a.length());
// System.out.println(a.charAt(17));


// // *** convert each first letter of each word to Uppercase
// System.out.println("enter the words");
// String words = sc.nextLine() ;
// System.out.println(upperCase(words));


// // ***String Compression
//  String s =  "aaabbcdddd";
//  System.out.println(compression(s));


// //  *** String Compression using StringBuilder
//  String s =  "aaabbcdddd";
//  System.out.println(compressionUsingBuilder(s));



// // *** Count how many times lowercase vowels occurred in a String entered by the user
// System.out.println("Enter the words ");
// String words = sc.nextLine();
// System.out.println(getVowels(words));


// // **check the output for the following code
// String str="ShradhaDidi";
// String str1="ApnaCollege";
// String str2="ShradhaDidi";
// System.out.println(str.equals(str1) +" "+str.equals(str2));
   
// // **check the output for the following code
// String str="ApnaCollege".replace("l","");
// System.out.println(str);


// // *** Check if strings are anagrams
// String one = "race";
// String two = "care";

// one = one.toLowerCase();
// two = two.toLowerCase();


// if(one.length() == two.length()){
// char a[]= one.toCharArray();
//  char b[] = two.toCharArray();

//  Arrays.sort(a);
//  Arrays.sort(b);

//  boolean result = Arrays.equals(a,b);
//  if(result){
//     System.out.println("They areAnagrams");
//  }
//  else {System.out.println("They are not Anagrams");}
// } 
// else {
//     System.out.println("They are not Anagrams");}



    }
}
