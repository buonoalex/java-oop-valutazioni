package org.lessons.java.valutazioni;

import org.lessons.java.utility.UtilityValue;

import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //Apro Scanner
        Scanner myBroScan = new Scanner(System.in);

        Corso coursePrincipal = new Corso();

        for (int i = 0; i <UtilityValue.RandomNumberCourse() ; i++) {
            Student s1 = new Student();
            coursePrincipal.AddStudent(s1);
        }

        //Stampiamo a console la lista dei partecipanti
        System.out.println("Ecco i risutati del corso : \n");
        UtilityValue.PrintListStudent(coursePrincipal.getStudentList());

        //Stampiamo coloro che hanno superato l'anno
        System.out.println("Ecco i promossi : \n");

        List<Student> studentsPass = coursePrincipal.studentListPass();
        UtilityValue.PrintListStudent(studentsPass);

        //Stampiamo coloro che non hanno superato l'esame
        System.out.println("Ecco i bocciati : \n");

        List<Student> studentsFail = coursePrincipal.studentListFailed();
        UtilityValue.PrintListStudent(studentsFail);

        //Chiudo Scanner
        myBroScan.close();

    }
}
