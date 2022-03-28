package org.medik.UI;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.medik.constants.Months;
import java.util.Scanner;

public interface IMenuable {
    Logger LOGGER = LogManager.getLogger(IMenuable.class);
    Scanner sc = new Scanner(System.in);
    String MONTHS[] = {
            String.valueOf(Months.JANUARY),
            String.valueOf(Months.FEBRUARY),
            String.valueOf(Months.MARCH),
            String.valueOf(Months.APRIL),
            String.valueOf(Months.MAY),
            String.valueOf(Months.JUNE),
            String.valueOf(Months.JULY),
            String.valueOf(Months.AUGUST),
            String.valueOf(Months.SEPTEMBER),
            String.valueOf(Months.OCTOBER),
            String.valueOf(Months.NOVEMBER),
            String.valueOf(Months.DECEMBER)
    };

    void showMenu();
}