package MODELS;

import java.util.ArrayList;

public class Course {
    private Faculty faculty;
    private String name;
    private long id;
    private int credit;
    private ArrayList<Course> prerequisite;
    private ArrayList<Course> coRequisite;

    public Course(Faculty faculty, String name, long id, ArrayList<Course> prerequisite, ArrayList<Course> coRequisite) {
        this.faculty = faculty;
        this.name = name;
        this.id = id;
        this.prerequisite = prerequisite;
        this.coRequisite = coRequisite;
    }
}
