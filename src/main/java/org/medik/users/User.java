package org.medik.users;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public abstract class User {
    protected static final Logger LOGGER = LogManager.getLogger(User.class);
    protected static final String HOSPITAL_TEXT = "Hospital: {}";
    protected static final String NAME_TEXT = "Name: {}";

    private static  final String PHONE_NUMBER_ERROR = "The phone number must be 10 digits";
    private String phoneNumber;
    private String address;
    private String email;
    private String name;
    private int id;

    public User(String email, String name) {
        this.setEmail(email);
        this.name = name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        if (phoneNumber.length() != 10) {
            LOGGER.error(PHONE_NUMBER_ERROR);
        } else {
            this.phoneNumber = phoneNumber;
        }
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        if (!email.contains("@")) {
            LOGGER.error("Invalid email");
        } else {
            this.email = email;
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "User{" +
                "phoneNumber='" + phoneNumber + '\'' +
                ", address='" + address + '\'' +
                ", email='" + email + '\'' +
                ", name='" + name + '\'' +
                ", id=" + id +
                '}';
    }

    public abstract void showDataUser();
}