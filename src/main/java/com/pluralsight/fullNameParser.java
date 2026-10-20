package com.pluralsight;

import java.util.Scanner;

public class fullNameParser {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String fullName = scan.nextLine();

        int periodIndex = fullName.lastIndexOf('.');
        int spaceIndex = fullName.indexOf(' ');
        String firstName = fullName.substring(0, spaceIndex);

        if (periodIndex > 0){
            char previousChar = fullName.charAt(periodIndex - 1);
            System.out.println("First name: " + firstName.trim());
            System.out.println("Middle name: " + previousChar + ".");
            String lastName = fullName.substring(periodIndex + 1);
            System.out.println("Last name: " + lastName.trim());



        }
        else {

            String lastName = fullName.substring(spaceIndex + 1);

            System.out.println("First name: " + firstName.trim());
            System.out.println("Middle name: (none)");
            System.out.println("Last name: " + lastName.trim());
        }
    }
}
