package info.losd.stringcalculator;

public class Calculator {
    public static int add(String numbers) {
        String[] tokens = numbers.split(",");

        if(tokens.length > 2) throw new RuntimeException();

        for(String number : tokens) {
            if (!number.isEmpty()) Integer.parseInt(number);
        }

        return 0;
    }
}
