// public class loop {
//     public static void main(String[] args) {
// while loop-->In while loop we first check condition then run the loop
  //for example if i=11 nothing is printed we out from loop bcz condition not satisfied
//         int i=1;

//         while (i<=10){
//             System.out.println(i);
//             i++;
//         }
//     }
// }

public class loop {
    public static void main(String[] args) {

        // int i=10;

        // while (i>=1){
        //     System.out.println(i);
        //     i--;
        // }

       /*  int i=11;
        do {                      //here condition is failed still we entered in loop//and    print something
            System.out.println(i);
            i++;
        } while (i<=10);
           */



        //for loop
        /*for(int i=1; i<=10; i++){
            System.out.println(i);
        }*/

        //comma seperated variation
        /*for(int i=1,j=1; i<=10; i++, j++){    //this give square
            System.out.println(i*j);
        }*/

        //two variable 
        /*for(int i=1,j=1; i<=10 ||  j<=5;i++,j+=2){
            System.out.println(i*j);
        }*/


     /*boolean b=true;
     for(int i=1;i<=10; i++){
        System.out.println("true");
        if(i==5){
            System.out.println("false");
        }
    }*/
  //Print triangle
       /*  for(int i=1; i<=5;i++){
            for(int j=1; j<=i; j++){
                System.out.print ("*");
            }
             System.out.println();
        }*/

    //Print rectangle

   /*  for(int i=1;i<=5;i++){
        for(int j=1;j<=5;j++){
            System.out.print("*");
            
        }
        System.out.println();
    }*/


    //Use of break
    for(int i=1;i<=10;i++){
        System.out.println(i);

        if(i>=5){
            break;
        }

    }
         
      //using of break and continue

    }
}

