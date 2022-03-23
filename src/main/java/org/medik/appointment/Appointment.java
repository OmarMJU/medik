package org.medik.appointment;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Date;

public class Appointment {
    protected static final Logger LOGGER = LogManager.getLogger(Appointment.class);
    protected final static String APPOINMENT_MESSAGE = "La cita con tu $[employe] es el dia {} a las {}.";
    private String time;
    private Date date;
    private int id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getDate() {
        return date;
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
