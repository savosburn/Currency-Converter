/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Savannah Osburn
 */

package ex11;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AppTest {
    @Test

    public void output_string_includes_numEuros_rate_and_USDollars() {
        App myApp = new App();

        double total = myApp.eurosToDollars(81, 1.3751);

        String expectedOutput = "81 euros at an exchange rate of 1.3751 is 111.38 U.S. dollars.";

        String actualOutput = myApp.generateOutput(81, 1.3751, total);

        assertEquals(expectedOutput, actualOutput);
    }
}