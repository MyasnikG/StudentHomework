package service;

import model.Student;

import java.util.Scanner;

public class StudentService {

    public Student createStudent(){

        Scanner scanner = new Scanner(System.in);
        Student studentObj = new Student();
        System.out.println("Please enter student's name");
        String name = scanner.next();
        studentObj.setName(name);
        System.out.println("Please enter student's surname");
        String surname = scanner.next();
        studentObj.setSurname(surname);
        System.out.println("Please enter student's age");
        int age = scanner.nextInt();
        studentObj.setAge(age);
        System.out.println("Please enter student's gender");
        String gender = scanner.next();
        studentObj.setGender(gender.charAt(0));
        System.out.println("Please enter student's mark");
        double mark = scanner.nextDouble();
        studentObj.setMark(mark);
        System.out.println("Does the student have a PhD degree?");
        boolean isPhD = scanner.nextBoolean();
        studentObj.setPhD(isPhD);

        return studentObj;
    }


    public void findYoungestFemaleStudent(Student [] students){

        Student youngest = null;
        for (int i = 0; i < students.length; i++) {
            if(youngest==null){
                if(students[i].getGender()=='f'|| students[i].getGender()=='F'){
                    youngest=students[i];
                }
            } else if ((students[i].getGender()=='f'|| students[i].getGender()=='F') && students[i].getAge()<youngest.getAge()){
                youngest=students[i];
            }
        }
        if(youngest!=null){
            System.out.println("The youngest female student is");
            youngest.printAll();
        } else {
            System.out.println("No female students found!");
        }
    }


//    Creating a method for finding the student with the highest mark
    public Student findStudentWithHighestMark(Student s1, Student s2, Student s3){
        Student highestMark;
        if(s1.getMark()> s2.getMark()&& s1.getMark()>s3.getMark()){
            highestMark=s1;
        } else if (s2.getMark()>s1.getMark() && s2.getMark()>s3.getMark()){
            highestMark=s2;
        } else {
            highestMark=s3;
        }

        return highestMark;
    }

//    Creating a method for printing the student's info who is a PhD and has the highest mark
    public void isPhDWithHighestMark(Student [] students){
        Student highestMarkPhD=null;

        for (int i = 0; i < students.length; i++) {
            if(highestMarkPhD == null){
                if(students[i].isPhD()){
                    highestMarkPhD=students[i];
                }
            } else if(students[i].isPhD() && students[i].getMark()>highestMarkPhD.getMark()){
                highestMarkPhD=students[i];
            }
        }

        if(highestMarkPhD!=null){
            System.out.println("PhD student with the highest mark is");
            highestMarkPhD.printAll();
        } else {
            System.out.println("No students found with a PhD degree!");
        }
    }

//    Creating a method for finding the amount of male and female students
    public void studentCount(Student [] students){
        int maleCount = 0;
        int femaleCount = 0;

        for (int i = 0; i < students.length; i++) {
            if(students[i].getGender()=='f'|| students[i].getGender()=='F'){
                femaleCount++;
            } else {
                maleCount++;
            }
        }

        System.out.println("The amount of female students is " + femaleCount);
        System.out.println("The amount of male students is " + maleCount);
    }

//    Creating a method for finding PhD students

    public boolean isPhDStudent(Student [] students){
        for (int i = 0; i < students.length; i++) {
            if(students[i].isPhD()){
                return true;
            }
        }
        return false;
    }



}
