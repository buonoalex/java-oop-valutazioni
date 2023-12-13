package org.lessons.java.utility;

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

}
