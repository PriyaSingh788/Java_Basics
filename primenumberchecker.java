import java.util.Scanner;
public class  primenumberchecker{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number: ");

        int p=sc.nextInt();

        for(int i=2;i<p;i++){
            if(p%i==0){
          System.out.println("Number is not prime");

          break;
           
            }
        }

    }
}
