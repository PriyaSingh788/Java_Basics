// public class fct {
//     public static void main(String[] args) {
//         //without function
//        /*  int a= 8;
//         int b=10;
    
//         int z=a+b;
//         System.out.println(z);
//         */

//        int x=sum(9,10);
//         System.out .println(x);

//         int z=sum(19,20);
//            System.out .println(z+x);



//     }

//     //with function
//     static int sum(int a, int b){
//       return a + b;
//     }
// }
    // static void greet (String name){
    //       System.out.println("Hello" + " " +name); //argument no return value
        

    // }

public class fct{
    public static void main(String[] args) {  
                                             
        greet("priya");
        sum(7,9);
        sum(10,9);
        //  int x=  getnumber();
        //  System.out.println(x);

        //  int z=add(10,30,90);
        //  System.out.println(z);
    }

    static void greet(){
        System.out.println("Hello"); //types of function 1-->No input no --No argument no return value
    }

    static void greet (String name){
          System.out.println("Hello" + " " +name); //argument no return value
        

    }
    static void sum(int a, int b){
        System.out.println(a+b);
    }

    static int getnumber(){            //no argument return value---> No input/output
        return 10;
    }

    static int add(int a,int b,int c){   //argument return --->Input/output
        return a+b+c;
    }

              //chaining of function

     
        
}
