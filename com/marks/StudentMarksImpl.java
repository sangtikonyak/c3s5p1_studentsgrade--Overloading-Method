package com.marks;

public class StudentMarksImpl {
    public static void main(String[] args) {
        StudentMarks studentMarks=new StudentMarks();
        System.out.println("marks of medical = " + studentMarks.calculateMarks(20, 40, 60));
        System.out.println("\nMarks of non-medical = " + studentMarks.calculateMarks(40, 50, 60, 70));
        System.out.println("\nMarks of Business studies = " + studentMarks.calculateMarks(80, 90));
    }
}
