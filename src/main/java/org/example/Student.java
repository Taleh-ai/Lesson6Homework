package org.example;

public class Student implements Actions{

    private String name;
    private String surname;
    private int age;
    private int studentId;
    private int grade;
    private University university;
    private static int count;

    public Student(String name, String surname, int age, int studentId, int grade, University university) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.studentId = studentId;
        this.grade = grade;
        this.university = university;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public University getUniversity() {
        return university;
    }

    public void setUniversity(University university) {
        this.university = university;
    }

    public void getCount() {
        System.out.println(Student.count);
    }

    public void goClass() {
        System.out.println("Go to class. You are late!");
    }

    public void goHome() {
        System.out.println("Go home take the trash!Then do your homework:)");
    }

    public void takeBrake() {
        System.out.println("Drink water and eat something!");
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                ", studentId=" + studentId +
                ", grade=" + grade +
                ", university=" + university +
                '}';
    }
}
