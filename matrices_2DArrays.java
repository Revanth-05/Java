import java.util.*;
public class matrices_2DArrays {


    // public static void getLargeSmall(int arr[][]){
    //     int largest = Integer.MIN_VALUE;
    //     int smallest = Integer.MAX_VALUE;
    //     for(int i = 0 ; i < arr.length ; i++){
    //         for(int j = 0; j < arr[0].length;j++){
    //             largest = Math.max(largest,arr[i][j]);
    //             smallest = Math.min(arr[i][j],smallest);
    //             }
    //         }
    //         System.out.println("largest number = " + largest);
    //         System.out.println("smallest number = " + smallest);
    //         for(int i = 0 ; i < arr.length ; i++){
    //             for(int j = 0; j < arr[0].length;j++){
    //                 if(largest == arr[i][j]){
    //                     System.out.println(" largest At cell ("+ i + "," + j + ")" );
    //                 }
    //                 if(smallest == arr[i][j]){
    //                     System.out.println(" smallest At cell ("+ i + "," + j + ")" );
    //                 }
    //                 }
    //             }
    // }


    // public static boolean search(int arr[][] , int key) {
    //     for(int i = 0 ; i < arr.length ; i++){
    //         for(int j = 0; j < arr[0].length;j++){
    //             if(arr[i][j] == key){
    //                 System.out.println("Found at cell (" + i +"," + j + ")");
    //                 return true;
    //             }
    //         }
    //     }
    //     System.out.println("Not found");
    //     return false;
    // }


    // public static void spiralMatrix(int arr[][]){
    //     int startRow = 0;
    //     int startColumn = 0;
    //     int endRow = arr.length-1;
    //     int endColumn = arr.length-1;

    //     while( startRow <= endRow && startColumn <= endColumn ){
    //         // top
    //         for(int j = startColumn ; j <= endColumn ; j++){
    //             System.out.print(arr[startRow][j] + " " );
    //         }
    //         // right
    //         for (int i = startRow + 1; i <= endRow; i++) {
    //             System.out.print(arr[i][endColumn] + " " );
    //         }
    //          // bottom / down
    //          for(int j = endColumn - 1 ; j >= startColumn ; j-- ){
    //             if(startRow == endRow){
    //                 break;
    //             }
    //             System.out.print(arr[endRow][j] + " " );
    //         }
    //           // left
    //           for (int i = endRow -1; i >= startRow + 1; i--) {
    //             if(startColumn == endColumn){
    //                 break;
    //             }
    //             System.out.print(arr[i][startColumn] + " " );
    //         }
    //         startRow++ ; startColumn++ ; endRow-- ; endColumn --;
    //     }
    // }


    // public static int diagonalsum(int arr[][]){
    //     int sum = 0;

       // // // O n^2 time complexity
       // // for(int i = 0; i < arr.length ; i++ ){
       // //     for(int j = 0 ; j < arr[0].length ; j++){
       // //             if( i == j ){
       // //                 sum += arr[i][j];
       // //             }
       // //             if(i != j){
       // //             if(i+j == arr.length-1){
       // //                 sum += arr[i][j]; 
       // //             }
       // //         }
       // //     }
       // // }


    //     // // O n time complexity
    //         for(int i = 0 ; i<arr.length ; i++ ){
    //             // // primary diagonal
    //             sum += arr[i][i];
    //             if(i != arr.length-1-i){
    //              // // Seconary diagonal
    //             sum += arr[i][arr.length-1-i];
    //             }
    //         }

        // return sum;
    // }


    // public static boolean stairCaseSearch(int matrix[][] ,int key) {
    //     int row = 0; int col = matrix[0].length-1;
    //     while(row <= matrix.length && col >= 0){
    //         if(matrix[row][col] == key){
    //             System.out.println("found at index ( " + row + " , " + col + " )");
    //             return true;
    //         }
    //         else if(key > matrix[row][col]){
    //             row++;
    //         }
    //         else{
    //             col--;
    //         }
    //     }
    //     System.out.println("index doesn't exist");
    //     return false;
    // }

    // public static boolean stairCaseSearch2(int arr[][] , int key) {
    //     int row = arr.length-1 , col = 0;
    //     while(row >= 0 && col <= arr[0].length){
    //         if(arr[row][col] == key){
    //             System.out.println("Found at Index (" + row + "," + col + ")");
    //             return true;
    //         }
    //         else if(arr[row][col] < key){
    //             col++;
    //         }
    //         else{
    //             row--;
    //         }
    //     }
    //     System.out.println("Index does not Exist");
    //     return false;
    // }


 
// public static void sumofR2(int arr [][] ) {
//     int sum = 0;
//     for(int i = 0 ; i< arr.length ; i++){
//         for(int j = 0 ; j < arr[0].length ; j++){
//             if( i == 1 ){
//                 sum += arr[i][j];
//             }
//         }
//     }
//     System.out.println("Sum = "+ sum);
// }
    
// public static void sumofR2_2(int arr[][]) {
//     int sum = 0;
//     for(int i = 0 ; i < arr.length ; i++){
//         sum += arr[1][i];
//     }
//     System.out.println("Sum = " + sum);
// }



public static void print(int arr[][]) {
    for (int i = 0; i < arr.length; i++) {
        for (int j = 0; j < arr[0].length; j++) {
        System.out.print(arr[i][j] + " ");
        }
        System.out.println();
    }
}


public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // int matrix[][] = new int [3][3];
        // int n = matrix.length , m = matrix[0].length ;

        // System.out.println("Enter the Elements");
        // for(int i = 0 ; i < n ; i++){
        //     for(int j = 0; j < m ;j++){
        //         matrix[i][j] = sc.nextInt();
        //     }
        // }
        // for(int i = 0 ; i < n ; i++){
        //     for(int j = 0; j < m ;j++){
        //        System.out.print(matrix[i][j]+" ");
        //     }
        //     System.out.println();
        // }


        // search(matrix , 5);
        // getLargeSmall(matrix);


        // int matrix[][] = {{1,2,3,4},
        //                 {5,6,7,8},
        //                 {9,10,11,12},
        //                 {13,14,15,16},};
    // spiralMatrix(matrix);
    // System.out.println("Diagonal sum is " + diagonalsum(matrix));


    // int arr[][] = {{ 10 , 20 , 30 , 40 },
    //                { 15 , 25 , 35 , 45 },
    //                { 27 , 29 , 37 , 48 },
    //                { 32 , 33 , 39 , 50 }};
                //    int key = 33;
            // stairCaseSearch(arr,key);
            // key = 30;
            // stairCaseSearch2(arr,key);


// // Print the number of 7’s that are in the 2d array.
        // int arr[][] = {{4,7,8},
//                {8,8,7}};
//                int total = 0;
//     for (int i = 0; i < arr.length; i++) {
//       for(int j = 0 ; j < arr[0].length ; j++){  
//         if(arr[i][j] == 7){
//             total++;
//         }
//     }
//     }    
//     System.out.println("Total Number of 7's in 2d array = " + total );  


// // // Print out the sum of the numbers in the second row of the “nums” array.
// int[][] nums = {{1,4,9},
//                {11,4,3},
//                {2,2,3}};
// // Method - 1;    --> O(n^2)
// sumofR2(nums);
// // Method - 2;    --> O(n)
// sumofR2_2(nums);


// // //  Write a program to Find Transpose of a Matrix , for (2*3)Matrix
int matrix[][] = {{11,12,13},
                  {21,22,23}};

             int transpose[][] = new int[matrix[0].length][matrix.length]; 
             for (int i = 0; i < matrix.length; i++) {
                for (int j = 0; j< matrix[0].length; j++) {
                 transpose[j][i] = matrix[i][j];
                } 
             }  
             print(transpose);
    }

}
