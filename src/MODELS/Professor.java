package MODELS;

import java.util.ArrayList;

public class Professor extends User {

    private ArrayList<Classroom> weeklyClasses;
    public Professor(long id, String password) {
        super(id, password);
    }
}
