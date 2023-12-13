package org.lessons.java.valutazioni;

import java.util.ArrayList;
import java.util.List;

public class Corso {
    //Attributi
    private final List<Student> studentList;

    //Costruttori
    public Corso(){
        this.studentList = new ArrayList<>();
    }

    //Metodi
    public void AddStudent(Student student){
        this.studentList.add(student);
    }

    public void RemoveStudent(Student student){
        boolean verifyId = this.studentList.contains(student);
        if (!verifyId){
            System.out.println("the student not exist");
        }else{
            this.studentList.remove(student);
        }
    }

    public List<Student> studentListPass(){
        List<Student> studentsPass = new ArrayList<>();
        for(Student element : studentList){
            if(Student.IsFailOrPass(element.getPercentageOfAbsences(),element.getAverageVote())){
                studentsPass.add(element);
            }
        }
        return studentsPass;
    }

    //Getter and Setter
    public List<Student> getStudentList() {
        return studentList;
    }

}
