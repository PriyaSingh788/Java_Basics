public class conct {
    public static void main(String[] args) {
        Student s1 = new Student("Riya",23,26,"iit guwahati");

        System.out.println(s1.name);
        System.out.println(s1.age);
        System.out.println(s1.rollno);
        System.out.println(s1.college);
      
        Student s2=new Student();



    
    }
    
}

   class Student{
        String name; //information/functions--> instance methods 
        int age;
        int rollno;
        String college;

        /*Student(){
            name="Riya";
            age =18;
           rollno=19;
            college="bbd";

         }*/
         //Default constructor
         Student() {

         }

        //parametrized constructor
        Student(String n , int a, int rn, String c){
            name = n;
            age=a;
            rollno=rn;
            college=c;

        }
         

        void markattendence(){
        System.out.println("Attendence mark by :" + name);

    
    }
}
