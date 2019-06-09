package application1;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import application1.Student1;

public class Internship1 {
    private String name;
    private List<Student1> students;

    public Internship1(String name) {
        this.name = name;
        this.students = new ArrayList();
    }

    public void addStudent1(Student1 student) {
        students.add(student);
    }

    public String getStudents() {
        String studentNames = "";
        for(Student1 s : students) {
            studentNames += s.getName();
            studentNames += "\n";
        }
        return studentNames;
    }
}
