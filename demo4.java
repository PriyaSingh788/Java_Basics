//Static keyword
public class demo4{
    public static void main(String[] args) {
     Student s1=new Student("Atul",26,19);
     Student s2=new Student("priya",22,18);
      
    //  Student.college="IIt Guwhati"

    System.out.println(s1.name+"," + s1.age+ ", " +s1.rollno+ "," + Student.college);
      System.out.println(s2.name+"," + s2.age+ ", " +s2.rollno+ "," + Student.college);





    }
}

class Student{
    String name;
    int age;
    int rollno;
    static String college="IIT Guhati";
    static int grade;

    Student(String name, int age, int rollno){
        this.name=name;
        this.age=age;
        this.rollno=rollno;

    }
    //Static block
    static void main() {
        grade=8;

    }

}