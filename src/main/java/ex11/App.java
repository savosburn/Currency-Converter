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
        int numEuros = myApp.readEuros();
        double exchangeRate = myApp.readRate();

        // calculations
        double total = myApp.eurosToDollars(numEuros, exchangeRate);

        // output
        String outputString = myApp.generateOutput(numEuros, exchangeRate, total);
        myApp.output(outputString);
    }

    public int readEuros() {
        System.out.print("How many euros are you exchanging? ");
        return in.nextInt();
    }

    public double readRate() {
        System.out.print("What is the exchange rate? ");
        return in.nextDouble();
    }

    public double eurosToDollars(int euros, double rate) {
        return euros * rate;
    }

    public String generateOutput(int euros, double rate, double total) {
        return String.format("%d euros at an exchange rate of %.4f is %.2f U.S. dollars.", euros, rate, total);
    }

    public void output(String outputString) {
        System.out.println(outputString);
    }
}
