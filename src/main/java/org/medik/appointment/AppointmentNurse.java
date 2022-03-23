package org.medik.appointment;

import org.medik.interfases.ISchedulable;
import org.medik.users.Nurse;
import java.util.Date;

public class AppointmentNurse extends Appointment implements ISchedulable {
    private final static String EMPLOYE_REPLACE = "$[employe]";
    private final static String EMPLOYE = "enefermera";
    private Nurse nurse;

    public Nurse getNurse() {
        return nurse;
    }

    public void setNurse(Nurse nurse) {
        this.nurse = nurse;
    }

    @Override
    public void schedule(Date date, String time) {
        LOGGER.info(APPOINMENT_MESSAGE.replace(EMPLOYE_REPLACE, EMPLOYE), date, time);
    }
}
