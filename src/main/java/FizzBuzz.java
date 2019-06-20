import static java.lang.System.*;

public class FizzBuzz {
    public static void main(String[] args) {
        for (int i=0; i <=100; i++) out.println(fizzBuzz(i));
    }

    public static String fizzBuzz(int i) {
        if (isMultiple(i, 3)) {
            if (isMultiple(i, 5)) {
                return "fizzbuzz";
            }
            return "fizz";
        }

        if (isMultiple(i,5)) return "buzz";

        return Integer.toString(i);
    }

    private static boolean isMultiple(int value, int mod) {
        return value % mod == 0;
    }
}
