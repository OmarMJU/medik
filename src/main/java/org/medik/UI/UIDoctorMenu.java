package org.medik.UI;

public class UIDoctorMenu implements IMenuable {
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

    public void showMenu() {
        int response;

        do {
            LOGGER.info(WELCOME_MESSAGE, UIMenu.doctorLogged.getName());
            LOGGER.info(AVAILABLE_APPOINTMENT);
            LOGGER.info(SCHEDULED_APPOINTMENT);
            LOGGER.info(LOGOUT);
            response = Integer.parseInt(sc.nextLine());

            if (response == 0) {
                UIMenu menu = new UIMenu();
                menu.showMenu();
            } else if (response == 2) {
                showAddAvailableAppointmentsMenu();
            }
        } while (response != 0);
    }

    private static void showAddAvailableAppointmentsMenu() {
        int response;

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

                String date = sc.nextLine();
                LOGGER.info(DATE_CORRECT, date);
            } else if (response == 0) {
                UIDoctorMenu doctorMenu = new UIDoctorMenu();
                doctorMenu.showMenu();
            }
        } while (response != 0);
    }
}
