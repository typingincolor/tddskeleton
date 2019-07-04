package info.losd.stringcalculator;

import java.util.LinkedList;

public class Calculator {
    public static int add(String numbers) {
        String numbersWithoutDelimiters = numbers;
        String delimiter = ",|\n";

        if (numbers.startsWith("//")) {
            int delimiterIndex = numbers.indexOf("//") + 2;
            delimiter = numbers.substring(delimiterIndex, delimiterIndex + 1);
            numbersWithoutDelimiters = numbers.substring(numbers.indexOf("\n") + 1);
        }

        return add(numbersWithoutDelimiters, delimiter);
    }

    private static int add(String numbers, String delimiter) {
        int sum = 0;

        LinkedList<Integer> negativeNumbers = new LinkedList<>();

        String[] tokens = numbers.split(delimiter);

        for (String number : tokens) {
            if (!number.isEmpty()) {
                int x = Integer.parseInt(number);

                if (x<0) negativeNumbers.add(x);

                sum += Integer.parseInt(number);
            }
        }

        if (negativeNumbers.isEmpty()) return sum;

        throw new RuntimeException("Negative numbers not allowed: " + negativeNumbers.toString());
    }
}

