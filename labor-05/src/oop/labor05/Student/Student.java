package oop.labor05.Student;

public class Student {
    private final String ID;
    private final String firtsName;
    private final String lastName;

    public Student(String ID, String firtsName, String lastName) {
        this.ID = ID;
        this.firtsName = firtsName;
        this.lastName = lastName;
    }

    public String getID() {
        return ID;
    }

    public String getFirtsName() {
        return firtsName;
    }

    public String getLastName() {
        return lastName;
    }

    @Override
    public String toString() {
        return "Student{" +
                "ID='" + ID + '\'' +
                ", firtsName='" + firtsName + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }
}
