package org.lessons.java.utility;

import org.lessons.java.valutazioni.Student;

import java.util.List;
import java.util.Random;

public class UtilityValue {
    //Attributi

    //Costruttori
    private UtilityValue(){

    }
    //Metodi
    public static int RandomNumberCourse(){
        Random number = new Random();
        return number.nextInt(10,20);
    }

    public static int RandomNumberCoursePercent(){
        Random number = new Random();
        return number.nextInt(1,100);
    }

    public static double RandomNumberCourseAverage(){
        Random number = new Random();
        return (double) Math.round(number.nextDouble(0, 5) * 100) /100;
    }

    public static void PrintListStudent(List<Student> list){
        for (Student element : list){
            String printStudent = element.toString();
            System.out.println(printStudent);
        }
    }

}
