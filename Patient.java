public class Patient extends User{
    private int patientId;
    private String condition;

    public Patient(String name, String userName, String password, String role, int patientId, String condition)
    {
        super(name, userName, password, role);
        this.patientId = patientId;
        this.condition = condition;
    }

    @Override
public String toString() {
    return super.toString() + " PatientID: " + patientId + " Condition: " + condition;
}

}