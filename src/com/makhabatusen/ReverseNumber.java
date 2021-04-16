package com.makhabatusen;

import java.util.Scanner;

class ReverseNumber {

    public static void main(String[] args) {
        reverseNumber();
    }

    private static void reverseNumber() {
        int number;
        int reverse = 0;

        System.out.println("Please enter a number: ");
        Scanner in = new Scanner(System.in);
        number = in.nextInt();

        while (number > 0) {
            reverse = reverse * 10;
            reverse += number % 10;
            number = number / 10;
        }

        System.out.println("Reverse of the number is " + reverse);
    }
}
