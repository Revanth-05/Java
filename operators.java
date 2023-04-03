public class operators {
    public static void main(String args[]){

int a  =  10;
int b = 5;

// //  // 1.Arithmetic Operators :
// //   -> Binary
int plusOperator = a + b ;
int minusOperator = a - b;
int multiplicationOperator = a * b;
int DivisionOperator = a / b;
int moduloOperator = a % b;

System.out.println(plusOperator);
System.out.println(minusOperator);
System.out.println(multiplicationOperator);
System.out.println(DivisionOperator);
System.out.println("remainder  " + moduloOperator);


// //  -> Unary
a++;
b--;
--a;
++b;

// // // -> Ternary 
 int Great = (a>b) ? a : b ;
 System.out.println(Great);

 String val = (a%2 == 0)? "Even" : "odd" ;
 System.out.println(val);


 
// // // 2. Relational Operators
System.out.println("a equals To b " + (a == b));
System.out.println("a Not equal To b " + (a != b));
System.out.println("a Greater than or equal To b " + (a >= b));
System.out.println("a Less than or equal To b  " + (a <= b));
System.out.println("a Greater than b  " + (a > b));
System.out.println("a less than b  " + (a < b));

// // // 3.Logical Operatorss
System.out.println("Logical and " + ((a>b) && (b<a)));
System.out.println("Logical or " + ((a>=b) || (a<=b)));
System.out.println("Logical not " + !(a==b));

// // // 4.Assignment Operators 
System.out.println("a =  b  " +   (a = b));
System.out.println("a = a * b  " +(a *= b));
System.out.println("a = a + b  " +(a += b));
System.out.println("a = a - b  " +(a -= b));
System.out.println("a = a / b  " +(a /= b));

// // // 5.Bitwise Operator
System.out.println("Binary and " + (a & b));
System.out.println("Binary or " + (a | b));
System.out.println("Binary xor " + (a ^ b));
System.out.println("Binary one's complement " + ( ~ b));
System.out.println("Binary left shift " + (a << b));
System.out.println("Binary Right shift " + (a >> b));




}
}
