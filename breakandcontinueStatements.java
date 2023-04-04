import java.util.*;
public class breakandcontinueStatements {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        // // // using Break 

        //  // 1. Break in between 
        // for( int i = 1 ; i <= 5 ; i++ ){
        //     if( i == 3 ){
        //         break;
        //     }
        //     System.out.println(i);
        // }
        // System.out.println(" out of loop  ");
        
        //  // 2. Keep Entering numbers till users enters a multiple of 10
        // for(; true ;)  { 
        //     System.out.print(" Enter the number ");
        // int  n = sc.nextInt();
        // if( n % 10 == 0 ){
        //     break ;
        // }
        // System.out.println(n);
        // }




     // // // using Continue 

        //  // 1. Continue in between
        // for( int i = 1 ; i <= 5 ; i++ ){
        //     if( i == 3 ){
        //         continue;
        //     }
        //     System.out.println(i);
        // }

        // //  // 2. Dispaly all numbers entered by user except multiple of 10
        // do{
        //     System.out.print("Enter the number ");
        //     int  n = sc.nextInt();
        //     if( n % 10 == 0 ){
        //         continue;
        //     }
        //     System.out.println("number is " + n);
        // }while(true);
    }
}
