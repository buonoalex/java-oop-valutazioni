package org.lessons.java.valutazioni;

import org.lessons.java.utility.UtilityValue;

import java.util.Objects;

public class Student {
    //Attributi
    private static int id;
    private int percentageOfAbsences;
    private double averageVote;

    //Costruttori
    public Student(Student s1){

    }

    public Student() {
        id = IncrementId();
        this.percentageOfAbsences = UtilityValue.RandomNumberCoursePercent();
        this.averageVote = UtilityValue.RandomNumberCourseAverage();
    }

    //Metodi
    public static boolean IsFailOrPass(int percent,int averageVote){
        if (percent > 50){
            return false;
        } else if ((percent < 50 && percent > 25) && averageVote > 2){
            return true;
        }else return percent < 25 && averageVote >= 2;
    }

    public int IncrementId(){
       return id++;
    }
    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (!(o instanceof Student student))
            return false;
        return id == student.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, percentageOfAbsences, averageVote);
    }

    @Override
    public String toString() {
        return "Student" + "\n"+
                "id = " + id + "\n"+
                " percentageOfAbsences = " + percentageOfAbsences +"%"+"\n"+
                " averageVote = " + averageVote +"\n"+
                "--------"+"\n";
    }

    //Getter and Setter

    public int getId() {
        return id;
    }

    public int getPercentageOfAbsences() {
        return percentageOfAbsences;
    }

    public double getAverageVote() {
        return averageVote;
    }

}
