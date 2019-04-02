/*Author: pankajan
date created: 30/11/2018
purpose: understand the observer and ovservable
 */

//here I create student and cook as two class

package com.company;

import java.io.*;

public class Main {

    public Student e[] = new Student[13];



    public static void main(String[] args) {

        /*Student kajan = new Student("kajan", "SE/16/032");
        Student sayi = new Student("sayi", "SE/16/018");
        Student ruwan = new Student("ruwan", "SE/16/040");
        Student jana = new Student("jana", "SE/16/002");
        Student hashika = new Student("hasika", "SE/16/034");
        Student nandhu = new Student("nandhu", "SE/16/031");
        Student piranith = new Student("piranith", "SE/16/038");
        Student rajeh = new Student("rajeh", "SE/16/044");
        Student tharindu = new Student("Tharindu", "SE/16/028");
        Student naveen = new Student("naveen", "SE/16/020");
        Student sahan = new Student("sahan", "SE/16/042");
        Student champika = new Student("champika", "SE/16/022");
        Student dilan = new Student("dilan", "SE/16/005");

         Student e[] = {kajan, sayi, ruwan, jana, hashika, nandhu, piranith, rajeh, tharindu, naveen, sahan, champika, dilan};

         m.serilization(m.e);

        */

        Main m = new Main();
        m.deserilization();

        cook chef = new cook("chef tharindu");

        chef.addObserver(m.e[1]);
        chef.addObserver(m.e[2]);
        chef.addObserver(m.e[3]);
        chef.addObserver(m.e[4]);
        chef.addObserver(m.e[5]);
        chef.addObserver(m.e[6]);
        chef.addObserver(m.e[7]);
        chef.addObserver(m.e[8]);
        chef.addObserver(m.e[9]);
        chef.addObserver(m.e[10]);
        chef.addObserver(m.e[11]);
        chef.addObserver(m.e[12]);
        chef.addObserver(m.e[0]);

        chef.cooking();


    }

    public void serilization(Student e[]) {
        try {
            FileOutputStream fileOut = new FileOutputStream("C:\\Users\\Pankajan\\IdeaProjects\\projectobsevers\\src\\com\\company\\stu.ser");
            ObjectOutputStream out = new ObjectOutputStream(fileOut);
           // Student kaja = new Student("kaja", "SE/16/032");

            int x= 0;
            while( x < 13) {
            out.writeObject(e[x]);
             x++;
            }

            System.out.printf("Serialized data is saved in /home/employee.ser");
            out.close();
            fileOut.close();

        } catch (IOException i) {
            i.printStackTrace();
        }
    }

    public void deserilization() {
          try {
            FileInputStream fileIn = new FileInputStream("C:\\Users\\Pankajan\\IdeaProjects\\projectobsevers\\src\\com\\company\\stu.ser");
            ObjectInputStream in = new ObjectInputStream(fileIn);

              int x= 0;
              while( x < 13) {
                  e[x] = (Student) in.readObject();
                  x++;
              }

            in.close();
            fileIn.close();

        } catch (IOException i) {
            i.printStackTrace();
        } catch (ClassNotFoundException c) {
            System.out.println("Student class not found");
            c.printStackTrace();

        }
    }
}
