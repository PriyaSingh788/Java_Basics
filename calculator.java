
import java.util.Scanner;
public class calculator {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Firstnum:");
        int a=sc.nextInt();
        System.out.println("Enter Secondnum:");
        int b=sc.nextInt();

         System.out.println(" Enter op:(+,-,/,*,%)");
         char op=sc.next().charAt(0);

         switch(op){


         case '+':
            System.out.println("Result:"+(a+b));
            break;


        case '-':
          System.out.println("Result:"+(a-b));
          break;
        
        case'*':
                  System.out.println("Result=" +(a*b));
         break;


        case'/':
            System.out.println("Result="+(a/b));
            break;
        
        case'%':
         System.out.println("Result="+(a%b));
         break;


         default:
            System.out.println("Invalid operator");
            break;


        

         }
    }
}
