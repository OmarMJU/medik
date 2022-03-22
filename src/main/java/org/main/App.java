package org.main;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.medik.users.Patient;
import org.medik.users.Doctor;
import java.util.Calendar;

public class App {
    private final static Logger LOGGER = LogManager.getLogger(App.class);

    public static void main( String[] args ) {
        Calendar calendar = Calendar.getInstance();

        Doctor myDoctor = new Doctor("Panchita", "Pediatra");
        Patient myPatient = new Patient("Conchita", "conchita@mail.com");

        myDoctor.addAvailableAppointment(calendar.getTime(), "4pm");
        myDoctor.addAvailableAppointment(calendar.getTime(), "3pm");
        myDoctor.addAvailableAppointment(calendar.getTime(), "2pm");
        LOGGER.info(myDoctor.getAvailableAppointment());

        for (Doctor.AvailableAppointment aa : myDoctor.getAvailableAppointment()) {
            LOGGER.info(aa.getDate() + " - " + aa.getTime());
        }
    }
}