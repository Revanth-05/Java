
public class oops{
    public static void main(String[] args) {

        // getters & Setters
      Pen cello = new Pen();
        cello.setColor("blue");
        cello.setSize(5);
        System.out.println(cello.color);
        System.out.println(cello.tipsize);
        cello.color = "Yellow";
        System.out.println(cello.color);

       // // Access Modifiers
        BankDetails myAcc = new BankDetails();
        myAcc.username = "revi" ;
        System.out.println(myAcc.username);
        myAcc.setPassword("revi@2005");
        System.out.println(myAcc.getPassword());
        myAcc.setnumber(1223);

        
        // Student one = new Student("Shradha");
        // System.out.println(one.name);


        // // copy constructors
        // Student s1 = new Student();
        // s1.name = "Shradha";
        // s1.rollno = 12;
        // s1.password = "abc"; 
        // s1.marks[0] = 100;
        // s1.marks[1] = 99;
        // s1.marks[2] = 88;

        // Student s2 = new Student(s1);
        // s2.password = "def";
        //  s1.marks[0] = 90;
        // for(int i = 0 ; i < 3 ; i++){
        //     System.out.println(s2.marks[i]);
        // }


    // // // Inheritance

    // // Single level Inheritance
    //    Fish nemo = new Fish();
    //    nemo.eat();

    // // multi level Inheritance
    // Dog leo = new Dog();
    // leo.color = "Cream" ;
    // System.out.println(leo.color);
    // leo.eat();
    // leo.legs = 4;
    // System.out.println(leo.legs);
    // leo.breed = "Labrador";
    // System.out.println(leo.breed);


    // // hierarchial Inheritance
    //   Bird peacock = new Bird();
    //   peacock.breathe();
    //   Human male = new Human();
    //   male.walk();


    // // hybrid Inheritance
    //    Nemo nemo =new Nemo();
    //    nemo.friendly();
    //    Bird Parrot = new Bird();
    //    Parrot.breathe();
    //    Cat Kitty = new Cat();
    //    Kitty.legs = 4;
    //    System.out.println(Kitty.legs);
    //     Dog Bruno = new Dog();
    //     Bruno.eat();



    // // // Polymorhism

    // //  Compile Type Polymorphism (Static) - Method / Function Overloading
    // Calculator calci = new Calculator();
    // System.out.println(calci.sum(1,2));
    // System.out.println(calci.sum((float)1.5,(float)2.5));
    // System.out.println(calci.sum(1,2,3));


    // //  Run Type Polymorphism (Dynamic) - Method / Function Overriding
        // Deer d = new Deer();
        // d.eat();




    // // // Abstraction

    // // abstract class
    // Horse shiro = new Horse();
    // shiro.eats();
    // shiro.walks();
    // // System.out.println(shiro.color);

    // Chicken nandu = new Chicken();
    // nandu.eats();
    // nandu.walks();
    // // nandu.changecolor();
    // // System.out.println(nandu.color);

    // Mustang myHorse = new Mustang();


    // // interfaces
    // Queen r = new Queen();
    // King R = new King();
    // r.moves();
    // R.moves();        


    // Multiple interfaces
    // Bear balu = new Bear();
    // balu.eats();



    // // // Static keyWord
// Student s1 = new Student();
// s1.schoolName = "HPS";

// Student s2 = new Student();
// System.out.println(s2.schoolName);

// Student s3 = new Student();
// s3.schoolName = "HPS(B)";
// System.out.println(s2.schoolName);


// // // Super keyword
// Rat mouse = new Rat();
// System.out.println(mouse.color);


// //  Print the sum , difference and product of two complex numbers by creating a class named 'Complex' with separate methods for each operation whose real and imaginary parts are entered by the user.
Complex c = new Complex(4,5);
Complex d = new Complex(5,9);

Complex e = Complex.add(c,d);
Complex f = Complex.sub(c,d);
Complex g = Complex.product(c,d);

e.printComplex();
f.printComplex();
g.printComplex();
    }
}



class Pen{
String color;
int tipsize;

// Setters
void setColor(String newcolor){
    color = newcolor;
}

void setSize(int newTip){
    tipsize = newTip;
}
}

// // Encapsulation - Constructors:
// class Student{
// String nameo;
// String roll;
// private String Password;



// String name;
// // Parameterized
// Student(String name){
//     this.name = name ;
// }
// Non Parameterized
// Student(){
//     System.out.println("roll no is 7");
// }
// int age;
// float percentage; //cgpa

// void percentage(int marks[]){
//     int newmarks = 0;
//     for(int i = 0 ; i < marks.length ;i++){
//          newmarks += marks[i];
//     }
//      percentage = newmarks/ marks.length;
// }
// }

class BankDetails{
   public String username;
    protected int phoneNumber;
    protected int setnumber(int newno){
        phoneNumber = newno;
        return phoneNumber;
    }

    // getters
    private String password ;
    String getPassword(){
        return this.password;
    }
protected void setPassword(String newPass){
password = newPass;
}
}



// // copy constructor
// class Student{
//     String name ;
//     int rollno ;
//     String password ;
//     int marks[] ;

  //  // // shallow copy constructor
  //  // Student(Student s1){
  //  //     marks = new int[3];
  //  // this.name = s1.name;
  //  // this.rollno = s1.rollno;
  //  // this.marks = s1.marks;
  //  // }

//    // deep copy constructor
//    Student(Student s1){
//    marks = new int[3];
//    this.name = s1.name;
//    this.rollno = s1.rollno;
//    for(int  i = 0 ; i  < marks.length ; i++){
//     this.marks[i] = s1.marks[i];
//    }
// }
// Student(){
//     marks = new int[3];
//     System.out.println("roll no is 7");
// }
// }
    

// // // Inheritance
// class Animal{
// String color;

// void eat(){
//     System.out.println("Eats");
// }
// void breathe(){
//     System.out.println("breathes");
// }
// }
// // Single level Inheritance
// class Fish extends Animal{
// int fins;
// void swim(){
// System.out.println("Swims in water");
// }
// }


// // multi level Inheritance
// class Mammal extends Animal{
// int legs;
// }
// class Dog extends Mammal{
// String breed;
// }

// // hierarchial Inheritance
// class Fish extends Animal{
//     void swim(){
//         System.out.println("Swims");
//     }
// }
// class Bird extends Animal{
//     void fly(){
//          System.out.println("flies");
//     }
// }
// class Human extends Animal{
//     void walk(){
//         System.out.println("walks");
//     }
// }


//     // hybrid Inheritance
// class Fish extends Animal{
//     void swim(){
//         System.out.println("Swims");
//     }
// }
// class Nemo extends Fish{
//     void friendly(){
//         System.out.println("Too Friendly");
//     }
// }
// class Shark extends Fish{
//     void friendly(){
//         System.out.println("Not Friendly , Too Dangerous");
//     }
// }

// class Bird extends Animal{
//       void fly(){
//          System.out.println("flies");
//       }
// }
// class Peacock extends Bird{
//  void friendly(){
//         System.out.println("Friendly");
//     } 
// }
// class Mammal extends Animal{
//     int legs;
// void walk(){
//         System.out.println("walks");
//     }
// }
// class Dog extends Mammal{
//     void friendly(){
//         System.out.println("Friendly");
//     } 
// }
// class Cat extends Mammal{
//     void friendly(){
//         System.out.println("Friendly");
//     } 
// }
// class Human extends Mammal{
//     void friendly(){
//         System.out.println("Friendly");
//     } 
// }


    // // // Polymorhism
    // //  Compile Type Polymorphism (Static) - Method / Function Overloading
    // class Calculator{
    //     int sum(int a , int b){
    //         return a+b;
    //     }
    //     float sum(float a , float b){
    //         return a+b;
    //     }
    //     int sum(int a , int b ,int c){
    //         return a + b + c;
    //     }
    // }

        // //  Run Type Polymorphism (Dynamic) - Method / Function Overriding
        // class Animal{
        //     void eat(){
        //         System.out.println("Eats Anything");
        //     }
        // }
        // class Deer{
        //    void eat(){
        //         System.out.println("Eats Grass");
        //     }
        // }



    // // // Abstraction

    // // abstract class
    // abstract class Animal{
    //     String color;
    //     // Animal(){
    //     //     color = "brown" ; 
    //     // }
    //     Animal(){
    //         System.out.println("Animal Constructor called...");
    //     }
    //     void eats(){
    //         System.out.println("Animal Eats");
    //     }
    //     abstract void walks();
    // }
    
    // class Horse extends Animal{
    //      void changecolor(){
    //         color = "grey" ; 
    //     }
    //      Horse(){
    //         System.out.println("Horse Constructor called...");
    //     }
    //     void walks(){
    //         System.out.println("Horse walks on 4 legs");
    //     }
    // }

    // class Mustang extends Horse{
    //      Mustang(){
    //         System.out.println("Mustang Constructor called...");
    //     }
    // }

    // class Chicken extends Animal{
    //      void changecolor(){
    //         color = "white" ; 
    //     }
    //     void walks(){
    //         System.out.println("Chicken walks on 2 legs");
    //     }
    // }


    // // interfaces
//     interface ChessPlayer{
//         void moves();
//     }
//   class Queen implements ChessPlayer {
//     public void moves(){
//         System.out.println("up,down,left,right,Diagonal - (in all 4 Directions...)");
//     }
//    }
//     class King implements ChessPlayer {
//     public void moves(){
//         System.out.println("up,down,left,right,Diagonal(moves all  Directions by 1 step)");
//     }
//    }
//     class Rook implements ChessPlayer {
//     public void moves(){
//         System.out.println("up,down,left,right");
//     }
//    }

// // Multple Interface
// interface Herbivore{
// public void eats();
// }
// interface Carnivore{
// public void eats();
// }
// class Bear implements Herbivore,Carnivore{
//  public void eats(){
//     System.out.println("bear eats both h & c");
//  }
// }
  

// // // Static keyWord
// class Student{
//     static int percentage(int math, int phy , int chem){
//         return (math+phy+chem) / 3;
//     }
//     String name;
//     int rollno;

//     static String schoolName;

//     void setName(String name){
//         this.name = name;
//     }
//     String getName(){
//         return this.name;
//     }
// }


// // // Super keyword
// class Animal{
//     String color;
//     Animal(){
//         System.out.println("Animal Constructor called...");
//     }
// }
// class Rat extends Animal{
    
//    Rat(){
//     super();
//     super.color = "black";
//      System.out.println("Rat constructor called...");
//     } 
// }


// // Print the sum , difference and product of two complex numbers by creating a class named 'Complex' with separate methods for each operation whose real and imaginary parts are entered by the user.
class Complex{
    int real;
    int imag;
    public Complex(int r , int i){
real = r;
imag = i;
    }

    public static Complex add(Complex a , Complex b){
        return new Complex((a.real+a.imag),(b.real+b.imag));
    }
    public static Complex sub(Complex a , Complex b){
        return new Complex((a.real-a.imag),(b.real-b.imag));
    }
    public static Complex product(Complex a , Complex b){
        return new Complex((a.real*b.real)-(a.imag*b.imag ),(a.real*b.imag)+(b.real*a.imag));
    }
    public void printComplex(){
        if(real == 0 && imag != 0){
            System.out.println(imag + "i");
        }
        else if(real != 0){
            System.out.println(real);
        }
        else{
            System.out.println(real+"+"+imag +"i");
        }
    }
}