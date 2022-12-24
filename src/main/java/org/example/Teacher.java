package org.example;

public class Teacher implements Actions {
    private String name;
    private String surname;
    private int age;
    private String subject;
    private int workExp;
    private static int count;

    private University university;

    public Teacher(String name, String surname, int age, String subject, int workExp,University university) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.subject = subject;
        this.workExp = workExp;
        this.university = university;
        setCount(count++);

    }

    public static void setCount(int count) {
        Teacher.count = count;
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

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public int getWorkExp() {
        return workExp;
    }

    public void setWorkExp(int workExp) {
        this.workExp = workExp;
    }

    public University getUniversity() {
        return university;
    }

    public void setUniversity(University university) {
        this.university = university;
    }


    public void getCount() {
        System.out.println(Teacher.count);
    }

    public void goClass() {
        System.out.println(this.university.name + " and teach " + this.subject);
    }

    public void goHome() {
        System.out.println("Class is over go home and check homework!");
    }

    public void takeBrake() {
        System.out.println("You must take a break. It is alredy 45 minutes");
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                ", subject='" + subject + '\'' +
                ", workExp=" + workExp +
                ", university=" + university.toString() +
                '}';
    }
}
