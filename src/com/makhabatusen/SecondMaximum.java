package com.makhabatusen;

import java.util.Arrays;
import java.util.Scanner;

public class SecondMaximum {
    static int[] numbers = new int[10];

    public static void main(String[] args) {

        userInput();
        calcMaxNum();
    }

    private static void calcMaxNum() {
        int temp;
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[i] < numbers[j]) {
                    temp = numbers[i];
                    numbers[i] = numbers[j];
                    numbers[j] = temp;
                }
            }
        }
        System.out.printf("The second largest number in array is %d%n", numbers[1]);
    }

    private static void userInput() {
        System.out.println("Please enter 10 numbers: ");
        for (int i = 0; i < numbers.length; i++) {
            try {
                Scanner scanner = new Scanner(System.in);
                int num = scanner.nextInt();
                numbers[i] = num;
            } catch (Exception e) {
                System.out.println("Please enter a number only");
            }
        }
        System.out.println(Arrays.toString(numbers));
    }
}

