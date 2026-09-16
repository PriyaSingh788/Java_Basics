public class obj {
    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2= new Student();

        s1.name="Priya";
        s1.age=22;
        s1.rollno=18;
        s1.college="BBD";

        s2.name="Riya";
        s2.age=18;
        s2.rollno=19;
        s2.college="integral";

        s1.markattendence();
        s2.markattendence();

        s1.print();
        s2.print();
        
    }
}




    class Student{
        String name;
        int age;
        int rollno;
        String college;

        void markattendence(){
            System.out.println("attendence markby:" + " " + name);
        }
        void print(){
            System.out.println(name + "," + age + "," + rollno + "," + college);
        }
    }






