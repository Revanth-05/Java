import java.util.Arrays; //->For Inbiult Sort
import java.util.Collections;  // ->For reverse order (used for reverse Inbuilt Sorting)
import java.util.*;
public class basicSorting {
    
public static void print(int A[]) {
    for(int i = 0 ; i < A.length ; i++){
        System.out.print(A[i] + " ");
    }
}


// public static void bubbleSort(int []A){
//     for(int i = 0 ; i < A.length - 1; i++){
//         for(int j = 0; j < A.length - 1; j++){
//            if(A[j] > A[j+1]){
//             int temp = A[j];
//             A[j] = A[j+1];
//             A[j+1] = temp;
//            } 
//         }
//     }
// }


// public static void selectionSort(int a[]){
//     int n = a.length;
//     for(int i = 0;i<n-1;i++){
//         int min = i ;
//     for(int j = i+1 ;  j < n ; j++){
//         if(a[j] < a[min]){
//             min = j;
//         }
//         }
//         int temp = a[min];
//         a[min] = a[i] ;
//         a[i] = temp;
//     }
// }


// public static void insertionSort(int arr[]){
//     int n = arr.length;
//     for(int i = 1 ; i < n ; i++ ){
//         int curr = arr[i];
//         int prev = i - 1;
//     while( prev >= 0 && (curr > arr[prev]) ){
//         arr[prev+1] = arr[prev];
//      prev--;
//     }    
//     arr[prev + 1] = curr;
//     }
// }


public static void countingSort(int arr[]) {
    int largest = Integer.MIN_VALUE;
    for(int i = 0 ;i < arr.length ; i++ ){
        largest = Math.max(largest,arr[i]);
    }

    int count[] = new int[largest + 1];
    for(int i = 0 ;i <arr.length ; i++){
        count[arr[i]]++;
    }

    int update = 0;
    for(int i = 0 ; i < count.length ; i++){
        while(count[i] > 0){
            arr[update] = i;
            update++;
            count[i]--;
        }
    }

}
public static void main(String args[]){
    Scanner sc = new Scanner(System.in);

       // //****  Taking Array Size Input **** //
    System.out.println("Enter the Size  of the Array");
    int n = sc.nextInt();
   // //****  Taking Array Input **** //
    System.out.println("Enter the Elements of the Array");
    int arr[] = new int[n];
    for(int i = 0;i<n;i++){
        arr[i] = sc.nextInt();
    }
    // bubbleSort(arr);
    // print(arr);
    
    // selectionSort(arr);
    // print(arr);

    // insertionSort(arr);
    // print(arr);

    // // InBuilt Sort
    // Arrays.sort(arr); //-> Ascending order
    // Arrays.sort(arr,0, 3); //-> Only Selected Part

    // Integer A[] = {5,4,1,3,2};
    // Arrays.sort(A,Collections.reverseOrder()); //->Reverse Order
    // Arrays.sort(A,0,3,Collections.reverseOrder()); //-> Only Selected Part
    // print(A);


    // countingSort(arr);
    // print(arr);
    
    }
}
