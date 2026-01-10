package OOP.BasicConcept;

public class Main {

    public static void main(String[] args) {

        // Create object
        Student student1 = new Student();

        // Assign values directly to fields

        student1.name = "Xabi";
        student1.age = 21;
        student1.weight = 62.5;

        // Access values
        System.out.println("Name: " + student1.name);
        System.out.println("Age: " + student1.age);
        System.out.println("Weight: " + student1.weight);
    }
}
