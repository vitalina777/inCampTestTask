package application1;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import application1.Student1;

public class University1 {    
    private String name;
    private List<Student1> students;

    public University1(String name) {
        this.name = name;
        students = new ArrayList();
    }

    public void addStudent1(Student1 student) {
        try {
            students.add(student);
        } catch (Error err) {
            System.out.printf("Failed to add student: %s to university %s%n", student.getName(), this.name);
        }
    }

    public List getStudentsList() {
        return students;
    }

    public String getName() {
        return name;
    }

    public List<Student1> getStudentsToInternship() {
        return students.stream()
                .filter(student -> student.getKnowledge1().getLevel() > getAverageKnowledgeLevel())
                .sorted(Comparator.comparing(student -> student.getKnowledge1().getLevel()))
                .collect(Collectors.toList());
    }

    //GET AVERAGE KNOWLEDGE LEVEL IN UNIVERSITY
    private int getAverageKnowledgeLevel() {
        return (int) students.stream()
                .mapToDouble(student -> student.getKnowledge1().getLevel())
                .average()
                .orElse(0);
    }
}
