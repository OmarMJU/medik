package org.medik.users;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Doctor {
    private static final Logger LOGGER = LogManager.getLogger(Doctor.class);
    private int id;
    private String name;
    private String speciality;

    public Doctor() {
        LOGGER.info("Creating a new Doctor.");
    }

    public Doctor(String name, String speciality) {
        this.name = name;
        this.speciality = speciality;
        LOGGER.info("Your doctor is " + this.name + " with the speciality " + this.speciality);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSpeciality() {
        return speciality;
    }

    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }
}