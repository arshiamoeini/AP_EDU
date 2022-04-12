package MODELS;

import java.util.ArrayList;

public class Faculty {
    private Professor campusChairmen;
    private EducationalAssistant educationalAssistant;

    private ArrayList<Professor> professors;
    private ArrayList<Student> students;

    private ArrayList<Course> courses;
    private ArrayList<Classroom> classrooms;

    public Faculty(Professor campusChairmen) {
        this.campusChairmen = campusChairmen;
    }
}
