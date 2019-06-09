package application1;

import application1.Knowledge1;

public class Student1 {
    private String name;
    private Knowledge1 knowledge;

    public Student1(String name) {
        this.name = name;
    }

    public void setKnowledge1(Knowledge1 knowledge) {
        this.knowledge = knowledge;
    }

    //LET IT BE THAT KNOWLEDGE = 1 - 100;
    public Knowledge1 getKnowledge1() {
        return knowledge;
    }

    public String getName() {
        return name;
    }

    public String toString() {
        return String.format("Name:%s, Knowledge level:%d", name, knowledge.getLevel());
    }
}
