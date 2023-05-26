import java.util.*;
public class arrays {
    
    // public static int getIndex(int arr[] , int key) {
    //     for (int i = 0; i < arr.length; i++) {
    //         if(arr[i] == key){
    //             return i;
    //         }
    //     }
    //     return -1;
    // }



    // public static void Check(String arr[] , String key) {
    //    int num = 0;
    //     for( int i =  0 ; i< arr.length;i++){
    //         if(arr[i] == key){
    //            num = i;
    //         }
    //     }
    //     if(num == 0){
    //     System.out.println("Out of Menu");
    //     }
    //     else{
    //         System.out.println("At serial number : " + num  );
    //     }
    // }

      

    // public static int get_Max_Min(int arr[]) {
    //     int max = Integer.MIN_VALUE;
    //     int min = Integer.MAX_VALUE;
    //         for(int i = 0 ; i < arr.length;i ++){
    //             if(arr[i] < min){
    //                 min = arr[i];
    //             }
    //             if(arr[i]>max){
    //                 max = arr[i];
    //             }
                
    //         }
    //         System.out.println("Smallest no. is : "+ min);
    //     return max;
    //     }

        
    
// public static int BinarySearch(int arr[] , int key){
//     int startingIndex = 0;
//     int endingIndex = (arr.length) - 1;
// for(int i = 0 ; i < arr.length ; i++){
//  int mid = (startingIndex + endingIndex)/ 2 ;
//  if(arr[mid] == key){
//     return mid;
//  }
//  else if(arr[mid] < key){
//     startingIndex = mid + 1 ;
//  }
//  else{
//     endingIndex = mid - 1 ;
//  }
// }
// return -1;    
// }



// public static void reverseArray(int arr[]) {
//     int start = 0;
//     int end = arr.length - 1;
//     while(start <= end ) {
//         int temp = arr[start];
//         arr[start] = arr[end];
//         arr[end] = temp;

//         start++;
//         end--;
//     }
// }

// // // // Another Method - but takes extra time (not good time complexity)
// // public static void reverseArray(int arr[]) {
// //     for(int i = arr.length - 1 ; i >= 0 ; i--){
// //         System.out.print(arr[i] + " ");
// //     }
// // }



// public static void getPairs(int arr[]) {
//     for(int i = 0 ; i < arr.length ; i++ ){
//     for (int j = i+1 ; j < arr.length; j++ ) {
//             System.out.print(" ( " + arr[i] + " , " + arr[j] + " ) " );
//         }
//         System.out.println();
//     }
// }



// public static void subArrays(int arr[]) {
//     Scanner sc = new Scanner(System.in);
//     int totalpairs = 0;
//     System.out.println("Enter the Elements of the array");
//     for(int i = 0 ; i<arr.length ;i++){
//         arr[i] = sc.nextInt();
//     }
//     for(int i = 0 ; i < arr.length ; i++){
//         for(int j = i ; j < arr.length ; j++ ){
//             for (int k = i; k <= j; k++) {
//                 System.out.print(arr[k] + " ");
            
//             }
//             System.out.println();
//             totalpairs++;
//         }
//     }
//     System.out.println("totalpairs = " + totalpairs);
// }




// public static void getSubarraySum(int arr[]) {
//     Scanner sc = new Scanner(System.in);
//     int max = Integer.MIN_VALUE;
//     System.out.println("Enter the Elements of the Array");
//     for (int i = 0; i < arr.length; i++) {
//         arr[i] = sc.nextInt();
//     }
//     for(int i = 0 ; i < arr.length ; i++){
//     for(int j = i ; j <arr.length;j++){
//         int sum = 0 ;
//     for(int k = i ; k <= j ; k++ ){
//         sum += arr[k];  
//     }    
//     System.out.println(sum);
//     if(max < sum){
//         max =  sum ;
//     }
//         }
//         System.out.println();
//     }
//     System.out.println("maximum value  = " + max);
// }





// public static void getSubarraySum2(int arr[]) {
//     Scanner sc = new Scanner(System.in);
//     int sum = 0;
//     int tp = 0;
//     int max = Integer.MIN_VALUE;
//     for(int i = 0; i<arr.length;i++){
//         arr[i] = sc.nextInt();
//     }
//     int prefix[] = new int [arr.length];
//     prefix[0] = arr[0];
//     for(int i = 1; i <prefix.length;i++){
//         prefix[i] = prefix[i-1] + arr[i];
//     }

//     for(int i = 0;i<arr.length;i++){
//         int start = i;
//     for(int j = i;j<arr.length;j++){
//         int end = j;
//         tp++;
//         sum = start == 0 ? prefix[end] : prefix[end] - prefix[start - 1];
//         if(sum > max){
//             max = sum;
//         }
//         }
//     }
//     System.out.println("max sum = " + max);
//     System.out.println("total pairs = "+ tp);
// }



// public static void getSubarraySum3(int arr[]) {
//     Scanner sc = new Scanner(System.in);
//     for (int i = 0; i < arr.length; i++) {
//         arr[i] = sc.nextInt();
//     }
  
//     int currentSum = 0;
//     int max = 0;
//     for (int i = 0; i < arr.length; i++) {
//         if(currentSum < 0){
//             currentSum = 0;
//         }
//         currentSum += arr[i];
//         if(max < currentSum){
//             max = currentSum;
//         }
//     }
//     System.out.println("maximum sum = "+ max);
// }



// public static int trappingRainWater(int arr[]) {
//     int n = arr.length;
//     int trappedwater = 0;
//     int width = 1;

// int leftMax[] = new int [n];
// leftMax[0] = arr[0];
// for (int i = 1; i < n; i++) {
//     leftMax[i] = Math.max(arr[i],leftMax[i-1]);
// }

// int rightMax[] = new int [n];
// rightMax[n-1] = arr[n-1];
// for (int i = n-2 ; i >= 0 ;i-- ) {
//     rightMax[i] = Math.max(arr[i],rightMax[i+1]);
// }

// for(int i = 0 ; i< n; i++){
//     int water = Math.min(leftMax[i],rightMax[i]);
//     trappedwater += (water - arr[i]) * width ;
// }
//     return trappedwater ;
// }




// public static int  buyandsellstocks(int arr[]) {
//     int min = Integer.MAX_VALUE;
//     int maxprofit = 0;
//     for(int i = 0;i< arr.length;i++){
//         if(min < arr[i]){
//           int profit = arr[i] - min ;
//         maxprofit = Math.max(maxprofit, profit);
//         }
//         else{
//          min = arr[i];
//                 }
//     }
//     return maxprofit;
// }

//  // My own code (time complexity is bad )0 n2
// public static void buyandsellstocks2(int arr[]) {
//     int profit = 0;
//     int max = Integer.MIN_VALUE;
//     for(int i = 0;i<arr.length;i++){
//         for(int j = i+1;j<arr.length;j++){
//             if(arr[i] < arr[j]){
//                 profit = arr[j] - arr[i] ;
//             }
//             else{
//                 profit = 0;
//             }
//           if(profit > max){
//             max = profit;
//           }    
//         }
//     }
//     System.out.println(max); 
// }




// public static boolean findDuplicates(int arr[]) {
//     for(int i = 0 ; i < arr.length ; i++){
//         for(int j = i+1 ; j < arr.length ; j++){
//             if(arr[i] == arr[j]){
//                 return true;
//             }
//         }
//     }
//     return false;
// }



// public static void getTriplets(int arr[]) {
//     for(int i = 0; i < arr.length ; i++){
//      for(int j = i+1;j < arr.length ; j++){
//       for(int k = i + 2 ;k < arr.length; k++){
//         if((arr[i] != arr[j]) && (arr[j] != arr[k]) && (arr[i] + arr[j] +arr[k] == 0) ){
//             System.out.println("[" + arr[i] +","+ arr[j] +","+ arr[k] +"]");
//         }
//       }
//      }   
//     }
// }


public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

   // // // Linear Search 
    // int numbers[] = {2,3,4,6,8,10,12,14};
    // int key = 10;
    // int Index = getIndex(numbers, key);
    // if(Index == -1 ){
    //     System.out.println("The Number Doesn't exist");
    // }
    // else{
    //     System.out.println("Number is at Index : " + Index);
    // }


    // // // Linear Search 
    // String menu[] = {"Samosa" , "Dosa" , "Sandwich" , "SoftDrinks" , "Juices"};
    // String Key = "Sandwich";
    // Check(menu, Key);


    // // // Largest and Smallest in an Array
    // int arr[] = new int [5];
    // for (int i = 0; i < arr.length; i++) {
    //     arr[i] = sc.nextInt();
    // }
    //    System.out.println("Largest no. is " + get_Max_Min(arr));



    // // // Binary Search method
//     int arr[] = new int[5];
//     System.out.println("Enters the numbers of array");
//     for(int i = 0; i < arr.length ; i++) {
//         arr[i] = sc.nextInt();
//     }
// int key = 20;
// System.out.println(BinarySearch(arr, key));



// // // Reverse an array
// int arr[] = new int [5];
// System.out.println("Enters the numbers of the array");
// for(int i = 0 ; i <arr.length ; i++){
//     arr[i] = sc.nextInt();
// }

//      reverseArray(arr);
//     for (int i = 0; i < arr.length; i++) {
//         System.out.print(arr[i] + " ");
//     }



// // //     Pairs in an Array
// int arr[] = new int [5];
// System.out.println("Enter the numbers of the Array");
// for(int i = 0 ;i < arr.length ; i++){
//     arr[i] = sc.nextInt();
// }
// getPairs(arr);


// // // Print Subarrays
// int arr[] = new int[5];
// subArrays(arr);



// // // Calculate max Subarray Sum - Method 1 (Brute Force)
// int arr[] = new int[5];
// getSubarraySum(arr);



// // // Calculate Max Subarray Sum - Method 2 (Prefix Sum)
// int arr[] = new int[5];
// getSubarraySum2(arr);


// // // Calculate Max Subarray Sum - Method 3 (Kadane's Algorithm)
// int arr[] = new int[8];
// getSubarraySum3(arr);


// // // Trapping Rainwater
//  int arr[] = {4,2,0,6,3,2,5};
//  System.out.println(trappingRainWater(arr));


// // // Best Time to Buy and Sell Stocks


// int arr[] = {7,1,5,3,6,4};
//  System.out.println(buyandsellstocks(arr));
//  buyandsellstocks2(arr);


// // // Find if an number appears at least twice or not
// System.out.println("Enter the length of the array");
// int n = sc.nextInt();
// int arr[] = new int [n];
// System.out.println("enter the elements of the array");
// for(int i = 0 ; i < arr.length ;i++){
//     arr[i] = sc.nextInt();
// }
// System.out.println(findDuplicates(arr));


// // // Find element in an array(using Binary Search)



// // Find all triplets whose sum = 0
// int a[] = {-1, 0,  1, 2, -1, -4};
// getTriplets(a);

    }
}
