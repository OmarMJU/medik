package org.medik.UI;

import org.medik.constants.Months;
import org.medik.users.Patient;
import org.medik.users.Doctor;
import org.medik.users.Nurse;
import java.util.ArrayList;

public class UIMenu implements IMenuable {
    private static final String EMAIL_MESSAGE = "Insert your email in format somethig@somemail.com";
    private static final String EMAIL_INCORRECT_MESSAGE = "The email is not valid or not found!";
    private static final String CORRECT_ANSWER_MESSAGE = "Please select a correct answer.";
    private static final String THANKS_MESSAGE = "Thank you for your visit.";
    private static final String WELCOME_MESSAGE = "WELCOME TO MEDIK.";
    private static final String OPTIONS_MESSAGE = "Select an option.";
    private static final String DOCTOR = "1. Doctor";
    private static final String PATIENT = "2. Patient";
    private static final String NURSE = "3. Nurse";
    private static final String EXIT = "0. Exit";
    public static Patient patientLogged;
    public static Doctor doctorLogged;
    public static Nurse nurseLogged;

    public void showMenu() {
        int request;

        LOGGER.info(WELCOME_MESSAGE);
        LOGGER.info(OPTIONS_MESSAGE);

        do {
            LOGGER.info(DOCTOR);
            LOGGER.info(PATIENT);
            LOGGER.info(NURSE);
            LOGGER.info(EXIT);
            request = Integer.parseInt(sc.nextLine());

            switch (request) {
                case 0:
                    LOGGER.info(THANKS_MESSAGE);
                    break;
                case 1:
                    LOGGER.info(DOCTOR);
                    authUser(request);
                    break;
                case 2:
                    LOGGER.info(PATIENT);
                    authUser(request);
                    break;
                case 3:
                    LOGGER.info(NURSE);
                    authUser(request);
                    break;
                default:
                    LOGGER.info(CORRECT_ANSWER_MESSAGE);
            }
        } while (request != 0);
    }

    private static void authUser(int userType) {
        ArrayList<Doctor> doctors = new ArrayList<>();
        doctors.add(new Doctor("simi@mail.com", "Simi"));
        doctors.add(new Doctor("florencia@mail.com", "Florencia"));
        doctors.add(new Doctor("chapatin@mail.com", "Chapatin"));

        ArrayList<Patient> patients = new ArrayList<>();
        patients.add(new Patient("dannita@mail.com", "Dannita"));
        patients.add(new Patient("omar@mail.com", "Omar"));
        patients.add(new Patient("ambar@mail.com", "Ambar"));

        ArrayList<Nurse> nurses = new ArrayList<>();
        nurses.add(new Nurse("estela@mail.com", "Estela"));
        nurses.add(new Nurse("maria@mail.com", "Maria"));
        nurses.add(new Nurse("anahi@mail.com", "Anahi"));

        boolean emailCorrect = false;

        do {
            LOGGER.info(EMAIL_MESSAGE);
            String email = sc.nextLine();

            if (userType == 1) {
                for (Doctor doctor : doctors) {
                    if (doctor.getEmail().equals(email)) {
                        emailCorrect = true;
                        doctorLogged = doctor;
                        UIDoctorMenu doctorMenu = new UIDoctorMenu();
                        doctorMenu.showMenu();
                    } else {
                        LOGGER.error(EMAIL_INCORRECT_MESSAGE);
                    }
                }
            } else if (userType == 2) {
                for (Patient patient : patients) {
                    if (patient.getEmail().equals(email)) {
                        emailCorrect = true;
                        patientLogged = patient;
                    } else {
                        LOGGER.error(EMAIL_INCORRECT_MESSAGE);
                    }
                }
            } else if (userType == 3) {
                for (Nurse nurse : nurses) {
                    if (nurse.getEmail().equals(email)) {
                        emailCorrect = true;
                        nurseLogged = nurse;
                    } else {
                        LOGGER.error(EMAIL_INCORRECT_MESSAGE);
                    }
                }
            }
        } while (!emailCorrect);
    }
}
