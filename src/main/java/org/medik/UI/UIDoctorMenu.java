package org.medik.UI;

import org.medik.users.Doctor;
import java.util.ArrayList;

public class UIDoctorMenu implements IMenuable {
    private static final String TIME_DATE = "Insert the time available fot the date {} in format [hh:mm] 24 Hrs.";
    private static final String TIME_CORRECT = "Your time {} is correct? 1) Correct - 2) Incorrect";
    private static final String DATE_CORRECT = "Your date {} is correct? 1) Correct - 2) Incorrect";
    private static final String INSERT_DATE_AVAILABLE = "Insert the date available: [dd/mm/yyyy]";
    private static final String ADD_AVAILABLE_APPOINTMENT = "-> Add available appointment";
    private static final String AVAILABLE_APPOINTMENT = "1. Add available appointments";
    private static final String SCHEDULED_APPOINTMENT = "2. My scheduled appointments";
    private static final String SELECT_MONTH = "Select a month";
    private static final String WELCOME_MESSAGE = "Welcome {}";
    private static final String SHOW_MONTHS = "{}. {}";
    private static final String LOGOUT = "0. Logout";
    private static final String RETURN = "0. Return";

    private static final ArrayList<Doctor> doctorsAvailableAppointments = new ArrayList<>();

    public void showMenu() {
        int response;

        do {
            LOGGER.info(WELCOME_MESSAGE, UIMenu.doctorLogged.getName());
            LOGGER.info(AVAILABLE_APPOINTMENT);
            LOGGER.info(SCHEDULED_APPOINTMENT);
            LOGGER.info(LOGOUT);
            response = Integer.parseInt(sc.nextLine());

            switch (response) {
                case 0:
                    UIMenu menu = new UIMenu();
                    menu.showMenu();
                    break;
                case 1:
                    showAddAvailableAppointmentsMenu();
                    break;
                case 2:
                    showScheduleAppointments();
                    break;
            }
        } while (response != 0);
    }

    private static void showAddAvailableAppointmentsMenu() {
        int responseDate;
        int responseTime;
        int response;
        String time;
        String date;

        do {
            LOGGER.info(ADD_AVAILABLE_APPOINTMENT);
            LOGGER.info(SELECT_MONTH);

            for (int i = 0; i < 3; i++) {
                int j = i + 1;
                LOGGER.info(SHOW_MONTHS, j, UIMenu.MONTHS[i]);
            }

            LOGGER.info(RETURN);
            response = Integer.parseInt(sc.nextLine());

            if (response > 0 && response < 4) {
                LOGGER.info(SHOW_MONTHS, response, UIMenu.MONTHS[response - 1]);
                LOGGER.info(INSERT_DATE_AVAILABLE);

                date = sc.nextLine();
                LOGGER.info(DATE_CORRECT, date);
                responseDate = Integer.parseInt(sc.nextLine());

                if (responseDate == 2) {
                    continue;
                }

                do {
                    LOGGER.info(TIME_DATE, date);
                    time = sc.nextLine();
                    LOGGER.info(TIME_CORRECT, time);
                    responseTime = Integer.parseInt(sc.nextLine());
                } while (responseTime == 2);

                UIMenu.doctorLogged.addAvailableAppointment(date, time);
                checkDoctorAvailableAppointment(UIMenu.doctorLogged);
            } else if (response == 0) {
                UIDoctorMenu doctorMenu = new UIDoctorMenu();
                doctorMenu.showMenu();
            }
        } while (response != 0);
    }

    private static void checkDoctorAvailableAppointment(Doctor doctor) {
        if (doctor.getAvailableAppointment().size() > 0 && !doctorsAvailableAppointments.contains(doctor)) {
            doctorsAvailableAppointments.add(doctor);
        }
    }

    private static void showScheduleAppointments() {
        ArrayList<Doctor.AvailableAppointment> availableAppointments = UIMenu.doctorLogged.getAvailableAppointment();
        for (Doctor.AvailableAppointment availableAppointment : availableAppointments) {
            LOGGER.info(availableAppointment.toString());
        }
    }
}
