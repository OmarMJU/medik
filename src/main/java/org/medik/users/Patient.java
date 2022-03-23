package org.medik.users;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Patient extends User {
    private static final Logger LOGGER = LogManager.getLogger(Patient.class);
    private static final String CONSTRUCTOR_MESSAGE = "Thank you, {} for your registry with the email {}";

    private String birthday;
    private double weight;
    private double height;
    private String blood;

    public Patient(String email, String name) {
        super(email, name);
        LOGGER.info(CONSTRUCTOR_MESSAGE, name, email);
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getWeight() {
        return this.weight + " Kg.";
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public String getBlood() {
        return blood;
    }

    public void setBlood(String blood) {
        this.blood = blood;
    }

    @Override
    public String toString() {
        return "Patient{" + super.toString() +
                ", birthday='" + birthday + '\'' +
                ", weight=" + weight +
                ", height=" + height +
                ", blood='" + blood + '\'' +
                '}';
    }
}
