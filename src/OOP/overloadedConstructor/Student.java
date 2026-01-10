package OOP.overloadedConstructor;

public class Student {
    String name;
    int age;
    double gpa;

    Student( String name){
        this.name = name;
    }
    Student( String name, int age){
        this.name = name;
        this.age = age;
    }
    Student( String name, int age, double gpa){
        this.name = name;
        this.age = age;
        this.gpa = gpa;
    }

}
