package com.makhabatusen;

import java.util.Scanner;

public class PrimeNumbers {

    static int[] numbers;
    static int start;
    static int end;

    public static void main(String[] args) {
        userInput();
    }

    private static void userInput() {
        System.out.println("Please enter beginning range: ");
        Scanner scanner = new Scanner(System.in);
        start = scanner.nextInt();
        System.out.println("Please enter ending range: ");
        end = scanner.nextInt();
        if (start > 0 && end > 0) {
            calcPrimeNumbers();
        } else {
            System.out.println("Please enter positive numbers only");
            userInput();
        }
    }

    private static void calcPrimeNumbers() {
        numbers = new int[end - start + 1];
        System.out.printf("Prime numbers between %d and %d are: ", start, end);
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = start;
            start++;
        }
        for (int num : numbers) {
            int x = 0;
            if (num >= 2) {
                for (int i = 2; i <= num / 2; i++) {
                    if (num % i == 0) {
                        x = 1;
                        break;
                    }
                }
                if (x == 0) {
                    System.out.print(num + " ");
                }
            }
        }
    }
}

