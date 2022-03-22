package org.main;

import org.medik.users.Doctor;
import org.medik.users.Patient;

public class App {
    public static void main( String[] args ) {
        Doctor myDoctor = new Doctor("Panchita", "Pediatra");
        Patient myPatient = new Patient("Conchita", "conchita@mail.com");
    }
}