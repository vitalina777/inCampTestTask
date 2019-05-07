package application1;

import application1.University1;
import application1.Internship1;
import application1.Student1;

public class Application1 {

    public static void main(String[] args) {
        University1 university = new University1("CH.U.I.");
        university.addStudent1(new Student1("Andrew Kostenko"));
        university.addStudent1(new Student1("Julia Veselkina"));
        university.addStudent1(new Student1("Maria Perechrest"));

        Internship1 internship = new Internship1("Interlink");
        System.out.println("List of internship's students:");
        System.out.println(internship.getStudents());
    }
    
}
