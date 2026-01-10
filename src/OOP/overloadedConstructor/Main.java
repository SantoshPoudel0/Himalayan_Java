package OOP.overloadedConstructor;

public class Main {
    public static void main(String[] args) {

        Student student1 = new Student("xabi");
        Student student2 = new Student("santosh", 21);
        Student student3 = new Student("santosh", 21, 98.21);

        System.out.println(student1.name);

        System.out.println(student2.name);
        System.out.println(student2.age);

        System.out.println(student3.name);
        System.out.println(student3.age);
        System.out.println(student3.gpa);

    }
}
