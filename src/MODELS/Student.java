package MODELS;

import java.time.LocalDateTime;
import java.util.ArrayList;

public class Student extends User {
    public enum EducationalStatus {
        ALLOWED_TO_REGISTER,
        PUT_OF,
    }

    public EducationalStatus educationalStatus;
    private Professor Supervisor;
    private boolean registrationLicense;
    private LocalDateTime registrationTime;

    private ArrayList<Classroom> weeklyClasses;
    public Student(long id, String password) {
        super(id, password);
    }
}
