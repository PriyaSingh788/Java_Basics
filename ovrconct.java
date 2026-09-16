

public class ovrconct {
    public static void main(String[] args) {
        Student s1= new Student();
        Student s2=new Student("Aditi");
        Student s3= new Student("riya",19);
        Student s4=new Student("aisha",10,18);
        Student s5=new Student("priya",18,19,"bbd");

        s1.data();
        s2.data();
        s3.data();
        s4.data();
        s5.data();
    }
     
    
}

  class Student{
        String name; //information/functions--> instance methods 
        int age;
        int rollno;
        String college;

        //constructor chaining 

        Student( ){}

        Student(String name){
            this.name=name;
        }
         Student(String name, int age){
            this.name=name;
            this.age=age;

        }
           Student(String name, int age , int rollno){
            this.name=name;
            this.age=age;
            this.rollno = rollno;


        }
             Student(String name, int age , int rollno, String college){
            this.name=name;
            this.age=age;
            this.rollno = rollno;
            this.college=college;



             }

        void data(){
            System.out.println(name + "," + age +"," + rollno + " ," + college);
        }

  }

