package info.losd.stringcalculator;

public class Calculator {
    public static int add(String numbers) {
        int sum = 0;
        String[] tokens = numbers.split(",|\n");

        for(String number : tokens) {
            if (!number.isEmpty()) {
                sum += Integer.parseInt(number);
            }
        }

        return sum;
    }
}
