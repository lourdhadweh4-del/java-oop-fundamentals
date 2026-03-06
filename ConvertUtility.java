public class ConvertUtility {
    public static double toFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }
    public static void tryToChange(int value) {
        value = 999;
        System.out.println("Inside tryToChange, value is set to: " + value);
    }
}
