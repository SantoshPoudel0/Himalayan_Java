package OOP.GetterSetter;

public class College {

    // Step 1: Private data members (Encapsulation)
    private String collegeName;
    private String location;
    private int establishedYear;
    private int totalStudents;

    // Step 2: Constructor
    public College(String collegeName, String location, int establishedYear, int totalStudents) {
        this.collegeName = collegeName;
        this.location = location;
        this.establishedYear = establishedYear;
        this.totalStudents = totalStudents;
    }

    // Step 3: Getter and Setter for each field

    public String getCollegeName() {
        return collegeName;
    }

    public void setCollegeName(String collegeName) {
        this.collegeName = collegeName;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public int getEstablishedYear() {
        return establishedYear;
    }

    public void setEstablishedYear(int establishedYear) {
        this.establishedYear = establishedYear;
    }

    public int getTotalStudents() {
        return totalStudents;
    }

    public void setTotalStudents(int totalStudents) {
        this.totalStudents = totalStudents;
    }

    // Step 4: Display method
    public void displayInfo() {
        System.out.println("College Name: " + collegeName);
        System.out.println("Location: " + location);
        System.out.println("Established Year: " + establishedYear);
        System.out.println("Total Students: " + totalStudents);
    }

    // Step 5: Main method to test
    public static void main(String[] args) {
        // Create object
        College c1 = new College("ABC College", "Kathmandu", 1998, 2000);

        // Use getter
        System.out.println("Before Update:");
        c1.displayInfo();

        // Use setter to change values
        c1.setCollegeName("XYZ College");
        c1.setTotalStudents(2500);

        System.out.println("\nAfter Update:");
        c1.displayInfo();
    }
}
