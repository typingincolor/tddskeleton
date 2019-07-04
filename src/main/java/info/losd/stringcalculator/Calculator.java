package info.losd.stringcalculator;

public class Calculator {
    public static int add(String numbers) {
        int sum = 0;
        String numbersWithoutDelimiters = numbers;
        String delimiter = ",|\n";

        if (numbers.startsWith("//")) {
            delimiter = numbers.substring(numbers.indexOf("//") + 2, numbers.indexOf("//") + 2 + 1);
            numbersWithoutDelimiters = numbers.substring(numbers.indexOf("\n") + 1);
        }

        String[] tokens = numbersWithoutDelimiters.split(delimiter);

        for (String number : tokens) {
            if (!number.isEmpty()) {
                sum += Integer.parseInt(number);
            }
        }

        return sum;
    }
}

