
//prefix
public class operator {
    public static void main(String[] args) {
//         int j=9;           //here we can see first the value of j increase then assign in k
//                            //output 10,10
//         int k=++j;

//         System.out.println(j);

//     }
// }

// //postfix


//         int j=9;                  //here we can see first the value of j assign in k then increase by 1
//                            //output 10,10
//         int k=j++;
//
//         System.out.println(j);





// //relational operator-->It is a boolean expression,give answer in true and false 
// //==, !=, <, > ,<= ,>=


// int a=9;
// int b=10;

// boolean c=(a==b);
//   System.out.println(c);

//   boolean  d=(a!=b);
//   System.out.println(c);
      
//     boolean  e=(a>b);
//   System.out.println(e);

//     boolean  f=(a<b);
//   System.out.println(f);

//      boolean  g=(a<=b);
//   System.out.println(g);

//     boolean  h=(a>=b);
//   System.out.println(h);



//Bitwise operator
//& -->And(both value should be true then true ) , |-->or (if one value is true then its true), ^-->Xor(odd number of true only give true), ~-->Not(uninary operator),
//first find binary number then convert it in decimal
//its always in int

//    int a=5;
//    int b=3;
//    

//    int c=(a&b);
//     int d=(a|b);
//           System.out.println(c);
//            System.out.println(d);

//        int e=(a^b);
//           System.out.println(e);

//    int f=(~b);
//           System.out.println(f);



          //logical operator--> it used for expression -always in boolean
         //&&--> And operator(if any false all false)
        
       
       
           
           
        int a = 5;
        int b = 3;
        int c= 6;

        boolean d = (a < b) && (a < c);
        boolean e = (a < b) || (a < c);

        System.out.println(d);
        System.out.println(e);

    }
}