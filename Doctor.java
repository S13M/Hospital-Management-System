class Doctor extends User{
    int doctorID;
    String degree;
    String specialization;

    public Doctor(String name, String userName, String password, String role, int doctorID, String degree, String specialization)
    {
        super(name, userName, password, role);
        this.doctorID = doctorID;
        this.degree = degree;
        this.specialization = specialization;
    }
    
    @Override
    public String toString(){
        return super.toString() + " Doctor ID: " + doctorID + " Degree: " + degree + " Specialization: " + specialization;
    }
}