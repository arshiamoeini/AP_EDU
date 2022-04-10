package MODELS;

import java.time.LocalDateTime;

public class Student extends User {
    public enum EducationalStatus {
        ALLOWED_TO_REGISTER,
        PUT_OF,
    }

    public EducationalStatus educationalStatus;
    private Professor Supervisor;
    private boolean registrationLicense;
    private LocalDateTime registrationTime;

    public Student(long id, String password) {
        super(id, password);
    }
}
