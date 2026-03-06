public class ConverterUtility {
    public static void main(String[] args) {
        double tempC = 25.0;
        System.out.println("Temperature in Fahrenheit: " + ConverterUtility.toFahrenheit(tempC));
        int originalNum = 10;
        System.out.println("Before calling tryToChange: " + originalNum);
        ConverterUtility.tryToChange(originalNum);
        System.out.println("After calling tryToChange: " + originalNum);
    }
    public static double toFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }
    public static void tryToChange(int value) {
        value = 999;
        System.out.println("Inside tryToChange, value is set to: " + value);
    }
}

