package com.company;


import java.util.Observable;
import java.util.Observer;

public class Student  implements Observer,java.io.Serializable{
    private String name;
    private String studentID;

    public Student(String n, String id)
    {
        name = n;
        studentID = id;
    }

    @Override
    public void update(Observable o, Object arg) {
        System.out.printf("\n%s hear the bell sound." , this.name);
    }


    public String toString() {
        return String.format("%s", name);
    }
}
