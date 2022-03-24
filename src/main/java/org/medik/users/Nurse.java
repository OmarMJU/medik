package org.medik.users;

public class Nurse extends User {
    private static final String HOSPITAL = "INER";
    private String speciality;

    public Nurse(String email, String name) {
        super(email, name);
    }

    public String getSpeciality() {
        return speciality;
    }

    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }

    @Override
    public String toString() {
        return "Nurse{" + super.toString() +
                ", speciality='" + speciality + '\'' +
                '}';
    }

    @Override
    public void showDataUser() {
        LOGGER.info(NAME_TEXT, this.getName());
        LOGGER.info(HOSPITAL_TEXT, HOSPITAL);
    }
}
