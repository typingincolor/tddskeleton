public class FizzBuzz {
    public static String fizzBuzz(int i) {
        if (isMultiple(i, 3)) return "fizz";

        if (isMultiple(i,5)) return "buzz";

        return Integer.toString(i);
    }

    private static boolean isMultiple(int value, int mod) {
        return value % mod == 0;
    }
}
