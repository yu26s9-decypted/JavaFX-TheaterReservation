package com.pluralsight.demo;

import java.util.Scanner;

public class TheaterReservation {
    public static Scanner scanner = new Scanner(System.in);
    static void main() {
        String fullName = askString("Please enter your name:");
        String dateOfReservation = askString("What date will you be coming (mm/dd/yyyy)");
        int ticketAmount = askInt("How many tickets would you like?");

        System.out.println(formatName(fullName));
        System.out.println(formatDate(dateOfReservation));



    }
    public static String askString(String prompt){
        System.out.println(prompt);
        return scanner.nextLine();
    }
    public static int askInt(String prompt){
        System.out.println(prompt);
        return scanner.nextInt();
    }

    public static String formatName(String name){
        String[] names = name.split("\\s");
        String firstName;
        String middleName;
        String lastName;
        if (names.length == 3){
            firstName = names[0];
            middleName = names[1];
            lastName = names[2];
            return lastName + "" + firstName + " ." + middleName;

        } else {
            firstName = names[0];
            lastName = names[1];
            return lastName + " " + firstName;
        }
    }

    public static String formatDate(String date){
        String[] dates = date.split("/");
        String month = dates[0];
        String day = dates[1];
        String year = dates[2];

        return year + "-" + month + "-" + day;
    }



}
