import java.util.Scanner;
public class largestofthreeNo {
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter fistnum: ");

        int a=sc.nextInt();

        System.out.print("Enter secondnum: ");
         int b=sc.nextInt();
      
          System.out.print("Enter thirdnum: ");
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
