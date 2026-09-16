public class conc {
    public static void main(String[] args) {
        Student s1= new Student();
        s1.name ="Priya";
        s1.age=22;
        s1.college="bbd";


        //constructor--> to create an object
       
       
        //default values
        System.out.println(s1.name);
        System.out.println(s1.age);
        System.out.println(s1.college);


        
    }
    /* integer--> 0
       floating-->0.0
       Boolean-->false
       String-->null */




    static class Student{
        String name; //information/functions--> instance methods 
        int age;
        String college;

        void markattendence(){
          System.out.println("Attendence mark by :" + name);
        void print{
            System.out.println(name + "," + age +","  + college);
        }


    
        }
        



    }
    
}
