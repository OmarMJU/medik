package org.medik.UI;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import java.util.Scanner;

public interface IMenuable {
    Logger LOGGER = LogManager.getLogger(IMenuable.class);
    Scanner sc = new Scanner(System.in);
    void showMenu();
}