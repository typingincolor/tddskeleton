package info.losd.stringcalculator;

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
        String[] tokens = numbers.split(delimiter);

        for (String number : tokens) {
            if (!number.isEmpty()) {
                sum += Integer.parseInt(number);
            }
        }

        return sum;
    }
}

