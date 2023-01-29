package model;

public class Student {

    private String name;
    private String surname;
    private int age;
    private char gender;
    private double mark;
    private boolean isPhD;


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

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public double getMark() {
        return mark;
    }

    public void setMark(double mark) {
        this.mark = mark;
    }

    public boolean isPhD() {
        return isPhD;
    }

    public void setPhD(boolean phD) {
        isPhD = phD;
    }


    public void printAll() {

        System.out.println("Student name " + name);
        System.out.println("Student surname: " + surname);
        System.out.println("Student age: " + age);
        System.out.println("Student gender: " + (gender == 'f' || gender == 'F' ? "Female" : "Male"));
        System.out.println("Student mark: " + mark);
        System.out.println("Does the student have a PhD degree? " + (isPhD ? "Yes" : "No"));
    }
}
