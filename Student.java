public class Student {
    String name;
    int marks;

}
class StdFactory {
    Student Creatstd() {
Student s = new Student();
s.name = "Shubham";
s.marks = 99;
return s;
    }
    public static void main(String[] args) {
        Stdfactory f1 = new Stdfactory();
        Student s1 = f1.CreateStd();
        System.out.println("no the name is " + s1.name);
        System.out.println("the name are "+ s1.marks);
    }

    }
