package org.medik.constants;

public enum Months {
    JANUARY("ENERO"),
    FEBRUARY("FEBRERO"),
    MARCH("MARZO"),
    APRIL("ABRIL"),
    MAY("MAYO"),
    JUNE("JUNIO"),
    JULY("JULIO"),
    AUGUST("AGOSTO"),
    SEPTEMBER("SEPTIEMBRE"),
    OCTOBER("OCTUBRE"),
    NOVEMBER("NOVIEMBRE"),
    DECEMBER("DICIEMBRE");

    public String spanish;

    private Months(String s) {
        spanish = s;
    }

    private String getSpanish() {
        return this.spanish;
    }
}
