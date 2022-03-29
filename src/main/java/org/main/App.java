package org.main;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.medik.UI.UIDoctorMenu;
import org.medik.UI.UIMenu;
import org.medik.users.Nurse;
import org.medik.users.Patient;
import org.medik.users.Doctor;
import org.medik.users.User;

import java.util.Calendar;

public class App {
    private final static Logger LOGGER = LogManager.getLogger(App.class);

    public static void main( String[] args ) {
        UIMenu myMenu = new UIMenu();
        myMenu.showMenu();
    }
}