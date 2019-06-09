package application1;

import application1.University1;
import application1.Internship1;
import application1.Student1;

public class Application1 {

    public static void main(String[] args) {
        Student1 student1 = new Student1("Andrew Kostenko");
        Student1 student2 = new Student1("Julia Veselkina");
        Student1 student3 = new Student1("Maria Perechrest");
        Student1 student4 = new Student1("Harry Potter");
        Student1 student5 = new Student1("Oleksandr Moroz");
        Student1 student6 = new Student1("Vitalina Bondarenko");
        student1.setKnowledge1(new Knowledge1(61));
        student2.setKnowledge1(new Knowledge1(35));
        student3.setKnowledge1(new Knowledge1(39));
        student4.setKnowledge1(new Knowledge1(20));
        student5.setKnowledge1(new Knowledge1(80));
        student6.setKnowledge1(new Knowledge1(91));

        University1 university = new University1("CH.U.I.");
        university.addStudent1(student1);
        university.addStudent1(student2);
        university.addStudent1(student3);
        university.addStudent1(student4);
        university.addStudent1(student5);
        university.addStudent1(student6);
        
        //ТЕСТ УНІВЕРСИТЕТУ
        System.out.println("University students list");
        System.out.println(university.getStudentsList());
        System.out.println("\n\nStudents from University with higher than average level\n(students to adding to internship)");
        System.out.println(university.getStudentsToInternship());

        Internship1 internship = new Internship1("Interlink");
        //Додаєм студентів до найвищого рівня знань в університеті
        internship.addStudent1(university.getStudentsToInternship().get(2)); 
        internship.addStudent1(university.getStudentsToInternship().get(1)); 
        internship.addStudent1(university.getStudentsToInternship().get(0));

        System.out.println("\n\nList of internship's students:");
        System.out.println(internship.getStudents());
    }   
}
