package LambdaExpressionExp_1;

import java.util.List;

public class Student {

    private final int id;
    private final String firstName;
    private final String lastName;
    private final int age;
    private final String email;
    private final String phoneNumber;

    private Student(Builder builder) {
        this.id = builder.id;
        this.firstName = builder.firstName;
        this.lastName = builder.lastName;
        this.age = builder.age;
        this.email = builder.email;
        this.phoneNumber = builder.phoneNumber;
    }

    public int getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public String getEmail() {
        return email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public static class Builder {

        private int id;
        private String firstName;
        private String lastName;
        private int age;
        private String email;
        private String phoneNumber;

        public Builder(int id, String firstName, String lastName) {
            this.id = id;
            this.firstName = firstName;
            this.lastName = lastName;
        }

        public Builder age(int age) {
            this.age = age;
            return this;
        }

        public Builder email(String email) {
            this.email = email;
            return this;
        }

        public Builder phoneNumber(String phoneNumber) {
            this.phoneNumber = phoneNumber;
            return this;
        }

        public Student build() {
            return new Student(this);
        }
    }

    public static void printStudentWithinAgeRange(List<Student> student, int low, int high) {
        System.out.println("-------------------- printStudentWithinAgeRange --------------------");
        for (Student p : student) {
            if (low <= p.getAge() && p.getAge() < high) {
                System.out.println(p.getId() + " " + p.getFirstName() + " " + p.getLastName() + " " + p.getAge() + " " + p.getEmail() + " " + p.getPhoneNumber());
            }
        }
    }
}