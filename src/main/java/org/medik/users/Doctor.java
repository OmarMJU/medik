package org.medik.users;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class Doctor extends User {
    private ArrayList<AvailableAppointment> availableAppointments = new ArrayList<>();
    private static final String FORMAT_DATE = "dd/MM/yyyy";
    private static final String CEDULA_TEXT = "Cedula: {}";
    private static final String HOSPITAL = "INCAN";
    private static final int CEDULA = 12345678;
    private String speciality;

    public Doctor(String email, String name) {
        super(email, name);
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

    @Override
    public String toString() {
        return "Doctor{" + super.toString() +
                ", availableAppointments=" + availableAppointments +
                ", speciality='" + speciality + '\'' +
                '}';
    }

    @Override
    public void showDataUser() {
        LOGGER.info(NAME_TEXT, this.getName());
        LOGGER.info(HOSPITAL_TEXT, HOSPITAL);
        LOGGER.info(CEDULA_TEXT, CEDULA);
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

        @Override
        public String toString() {
            return "AvailableAppointment{" +
                    "id=" + id +
                    ", date=" + date +
                    ", time='" + time + '\'' +
                    '}';
        }
    }
}