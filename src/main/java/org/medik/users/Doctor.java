package org.medik.users;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class Doctor {
    private static final Logger LOGGER = LogManager.getLogger(Doctor.class);
    private static final String FORMAT_DATE = "dd/MM/yyyy";

    private ArrayList<AvailableAppointment> availableAppointments = new ArrayList<AvailableAppointment>();
    private String speciality;
    private String name;
    private int id;

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

    public void addAvailableAppointment(Date date, String time) {
        availableAppointments.add(new AvailableAppointment(date, time));
    }

    public ArrayList<AvailableAppointment> getAvailableAppointment() {
        return this.availableAppointments;
    }

    // Nested static class.
    public static class AvailableAppointment {
        private int id;
        private Date date;
        private String time;

        public AvailableAppointment(Date date, String time) {
            this.date = date;
            this.time = time;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getDate() {
            SimpleDateFormat sdf = new SimpleDateFormat(FORMAT_DATE);
            return sdf.format(this.date);
        }

        public void setDate(Date date) {
            this.date = date;
        }

        public String getTime() {
            return time;
        }

        public void setTime(String time) {
            this.time = time;
        }
    }
}