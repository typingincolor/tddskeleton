package info.losd.stringcalculator;

public class Calculator {
    public static int add(String numbers) {
        int sum = 0;
        String[] tokens = numbers.split(",");

        if(tokens.length > 2) throw new RuntimeException();

        for(String number : tokens) {
            if (!number.isEmpty()) {
                sum += Integer.parseInt(number);
            }
        }

        return sum;
    }
}
