import java.util.Scanner;

public class Numbercheck{
    public static void main(String[] args) {
    //      Scanner sc= new Scanner(System.in);
    //     System.out.print("enter a number:");
    //     int a=sc.nextInt();
    //     if(a>0){
    //           System.out.print("positive number");
    //     }
    //     else{
    //          System.out.print("negative number");
    //     }
        //  Scanner sc = new Scanner(System.in);//create a scanner named sc that take input from keyboard
        //  System.out.print("enter a number:");
        //  int a= sc.nextInt();//this takes number from user
         

        //  if(a%2==0){
        //     System.out.print("even");
        //  }
        //  else{
        //      System.out.print("odd");
        //  }


        // Scanner sc=new Scanner(System.in);
        // System.out.print("enter First number:");
        // int a=sc.nextInt();
        //   System.out.print("enter Second number:");
        //   int b=sc.nextInt();
         
        //   if(a>b){
        //          System.out.print("a is greater");

        //   }
        //   else{
        //          System.out.print("b is greater");
        //   }

       //temperature category 
        // Scanner sc=new Scanner(System.in);
        // System.out.print("Enter temperature:");
        // double temp=sc.nextDouble();

        // if(temp<10){
        //            System.out.print("cold");
        // }
        // else if(temp>10 && temp<25){
        //    System.out.print("moderate");
        // }
        
        // else{
        //    System.out.print("HOT");
        // }
      
        //Student Grade calculator
       /*  Scanner sc=new Scanner(System.in);
            System.out.print("Enter a number");
            int a=sc.nextInt();

            if (a>=90){
                System.out.println("Grade A");
        
            }
            else if(a>=75){
                 System.out.println("Grade B");
            }
            else if(a>=60){
                  System.out.println("Grade C");
            }
             else if(a>=40){
                  System.out.println("Grade D");
            }
            else{
                  System.out.println("fail");
            }*/



                  //package statement.java;
   import java.util.Scanner;

        
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter fistnum: ");

        int a=sc.nextInt();

        System.out.print("Enter second: ");
         int b=sc.nextInt();
      
          System.out.print("Enter third: ");
         int c=sc.nextInt();

         if(a>b && a>c){
            System.out.println("firstnum is greater");
        
         }
         else if(b>a && b>c){
              System.out.println("secondnum is greater");
         }
           else if(c>a && c>b){
              System.out.println("thirdnum is greater");
         }

        else{
            System.out.println("not defined");
        }

    }
 
    
}

          
         

    }
}