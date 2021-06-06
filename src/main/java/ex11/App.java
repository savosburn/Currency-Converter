/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Savannah Osburn
 */

package ex11;

import java.util.Scanner;

public class App {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        App myApp = new App();

        // input
        double numEuros = myApp.readEuros();
        double exchangeRate = myApp.readRate();

        // calculations
        double total = myApp.eurosToDollars(numEuros, exchangeRate);

        // output
        String outputString = myApp.generateOutput(numEuros, exchangeRate, total);
        myApp.output(outputString);
    }

    public double readEuros() {
        System.out.print("How many euros are you exchanging? ");

        // User can only enter number
        while (!in.hasNextDouble()) {
            System.out.print("Invalid number. Enter again: ");
            in.next();
        }

        return in.nextDouble();
    }

    public double readRate() {
        System.out.print("What is the exchange rate? ");

        // User can only enter number
        while (!in.hasNextDouble()) {
            System.out.print("Invalid number. Enter again: ");
            in.next();
        }

        return in.nextDouble();
    }

    public double eurosToDollars(double euros, double rate) {
        return euros * rate;
    }

    public String generateOutput(double euros, double rate, double total) {
        int euro;
        String eurosAmount = Double.toString(euros);

        if (euros % 1 == 0) {
             euro = (int) euros;
            eurosAmount = String.format("%d", euro);
        }
        return String.format("%s euros at an exchange rate of %.4f is %.2f U.S. dollars.", eurosAmount, rate, total);
    }

    public void output(String outputString) {
        System.out.println(outputString);
    }
}
