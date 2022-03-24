package org.medik.users;

public class Patient extends User {
    private static final String CONSTRUCTOR_MESSAGE = "Thank you, {} for your registry with the email {}";
    private static final String TEXT_BIRTHDAY = "Birthday: {}";
    private static final String TEXT_WEIGHT = "Weight: {}";
    private static final String TEXT_HEIGHT = "Height: {}";
    private static final String TEXT_BLOOD = "Blood: {}";
    private static final String KG = "Kg.";
    private String birthday;
    private double weight;
    private double height;
    private String blood;

    public Patient(String email, String name) {
        super(email, name);
        LOGGER.info(CONSTRUCTOR_MESSAGE, name, email);
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getWeight() {
        return this.weight + KG;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public String getBlood() {
        return blood;
    }

    public void setBlood(String blood) {
        this.blood = blood;
    }

    @Override
    public String toString() {
        return "Patient{" + super.toString() +
                ", birthday='" + birthday + '\'' +
                ", weight=" + weight +
                ", height=" + height +
                ", blood='" + blood + '\'' +
                '}';
    }

    @Override
    public void showDataUser() {
        LOGGER.info(NAME_TEXT, this.getName());
        LOGGER.info(TEXT_BIRTHDAY, this.birthday);
        LOGGER.info(TEXT_HEIGHT, this.height);
        LOGGER.info(TEXT_WEIGHT, this.weight);
        LOGGER.info(TEXT_BLOOD, this.blood);
    }
}
