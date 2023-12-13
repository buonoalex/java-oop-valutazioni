package org.lessons.java.valutazioni;

import org.lessons.java.utility.UtilityValue;

import java.util.ArrayList;
import java.util.List;

public class Corso {
    //Attributi
    private List<Student> studentList = new ArrayList<>(5);

    //Costruttori
    public Corso(){
        if (this.studentList.size()==0){
            ArrayList<Student> c = new ArrayList<>(5);
            this.studentList = c;
        }


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
            if (element.getAverageVote()>2){
                studentsPass.add(element);
            }else if(element.getAverageVote()>=2 && (element.getPercentageOfAbsences()<50 && element.getPercentageOfAbsences()>25)){
                studentsPass.add(element);
            }
        }
        return studentsPass;
    }

    @Override
    public String toString(){
        String totalPrintStudent = null;
        for (Student element : this.studentList){
            String printStudent = element.toString();
            totalPrintStudent += printStudent;
        }
        return totalPrintStudent;
    }

    //Getter and Setter
    public List<Student> getStudentList() {
        return studentList;
    }

}
