package org.lessons.java.valutazioni;

import org.lessons.java.utility.UtilityValue;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //Apro Scanner
        Scanner myBroScan = new Scanner(System.in);

        Corso coursePrincipal = new Corso();

        for (int i = 0; i <UtilityValue.RandomNumberCourse() ; i++) {
            coursePrincipal.AddStudent(new Student());
        }

        String printCourse = coursePrincipal.toString();
        System.out.println(printCourse);


        //Chiudo Scanner
        myBroScan.close();

    }
}
