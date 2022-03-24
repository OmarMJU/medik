package org.main;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.medik.users.Nurse;
import org.medik.users.Patient;
import org.medik.users.Doctor;
import java.util.Calendar;

public class App {
    private final static Logger LOGGER = LogManager.getLogger(App.class);

    public static void main( String[] args ) {
        Calendar calendar = Calendar.getInstance();

        /* Doctor Object. */
        Doctor myDoctor = new Doctor("panchita@mail.com", "Panchita");
        myDoctor.setPhoneNumber("5578945623");
        myDoctor.setAddress("Street Thinks, Col. Some col");
        myDoctor.setId(1);
        myDoctor.setSpeciality("Pediatrician");
        myDoctor.setName("Franciasca Tomasa Isidra Del Sagrado Corazon de Jesus Benita");

        myDoctor.addAvailableAppointment(calendar.getTime(), "4pm");
        myDoctor.addAvailableAppointment(calendar.getTime(), "3pm");
        myDoctor.addAvailableAppointment(calendar.getTime(), "2pm");

//        LOGGER.info(myDoctor.getAvailableAppointment());
//        LOGGER.info(myDoctor.getSpeciality());
//        LOGGER.info(myDoctor.getAddress());
//        LOGGER.info(myDoctor.getEmail());
//        LOGGER.info(myDoctor.getId());
//        LOGGER.info(myDoctor.getName());
//        LOGGER.info(myDoctor.getPhoneNumber());

        for (Doctor.AvailableAppointment aa : myDoctor.getAvailableAppointment()) {
            LOGGER.info(aa.getDate() + " - " + aa.getTime());
        }

//        LOGGER.info(myDoctor);
        myDoctor.showDataUser();

        /* Patient object. */
        Patient myPatient = new Patient("conchita@mail.com", "Conchita");
        myPatient.setPhoneNumber("5512345678");
        myPatient.setBirthday("July 25");
        myPatient.setBlood("O+");
        myPatient.setHeight(1.68);
        myPatient.setWeight(65);
        myPatient.setId(1);
        myPatient.setAddress("Calle Patito, Col. Animalitos, Del. GAM");
        myPatient.showDataUser();

//        LOGGER.info(myPatient.getPhoneNumber());
//        LOGGER.info(myPatient.getBirthday());
//        LOGGER.info(myPatient.getBlood());
//        LOGGER.info(myPatient.getHeight());
//        LOGGER.info(myPatient.getWeight());
//        LOGGER.info(myPatient);

        /* Nurse Object */
        Nurse myNurse = new Nurse("evamaria@mail.com", "Eva Maria");
        myNurse.setSpeciality("Pediatria");
        myNurse.showDataUser();
    }
}