package org.medik.appointment;

import org.medik.interfases.ISchedulable;
import org.medik.users.Doctor;
import java.util.Date;

public class AppointmentDoctor extends Appointment implements ISchedulable {
    private final static String EMPLOYE_REPLACE = "$[employe]";
    private final static String EMPLOYE = "doctor";
    private Doctor doctor;

    public Doctor getDoctor() {
        return doctor;
    }

    public void setDoctor(Doctor doctor) {
        this.doctor = doctor;
    }

    @Override
    public void schedule(Date date, String time) {
        LOGGER.info(APPOINMENT_MESSAGE.replace(EMPLOYE_REPLACE, EMPLOYE), date, time);
    }
}
