/*
 *  UCF COP3330 Fall 2021 Assignment 20 Solution
 *  Copyright 2021 Yohan Hmaiti
 */

// This program is a tax calculator that handles multiple states and
// multiple counties within each state. The program prompts the user for the order amount
// and the state where the order will be shipped.
// The program operates based on the states and conditions provided through the assignment only

package org.example;

import java.text.DecimalFormat;
import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        // use decimal format to help round decimals as requested by the assignment
        DecimalFormat df = new DecimalFormat("0.00");

        // Initialize a scanner called scanner
        Scanner scanner = new Scanner(System.in);

        // Variables declaration
        Double total = 0.0;
        Double taxtotal = 0.0;
        Double tax = 0.0;
        Double totalWithTax = 0.0;

        // prompt the user for the order amount
        //  and store it accordingly
        System.out.print("What is the order amount? ");
        total = scanner.nextDouble();

        // prompt the user for the state they live in
        System.out.print("What state do you live in? ");
        String state = scanner.next();

        // check if the state corresponds to "Wisconsin" or "Illinois" and then operate accordingly
        if(state.equals("Wisconsin") || state.equals("wisconsin") || state.equals("WISCONSIN")) {

            System.out.print("What county do you live in? ");
            String county = scanner.next();
            tax = 5.0 / 100;
            taxtotal = total * tax;

            // operate based on the county entered
            if(county.equals("Dunn") || county.equals("Dunn") || county.equals("Dunn")) {

                taxtotal += (total * 0.004);

            }else if(county.equals("Eau Claire") || county.equals("eau claire") || county.equals("EAU CLAIRE")){

                taxtotal += (total * 0.005);

            }

        } else if (state.equals("Illinois") || state.equals("illinois") || state.equals("ILLINOIS")){

            tax = 8.0 / 100;
            taxtotal = total * tax;

        }

        totalWithTax = total + taxtotal;

        System.out.print("The tax is $" + df.format(taxtotal) + ".\n" + "The total is $" +df.format(totalWithTax) + ".");

    }

}