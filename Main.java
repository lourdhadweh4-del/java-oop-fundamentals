public class Main {
    public static void main(String[] args) {
        Automobile patsCar = new Automobile(30, "5423", 6.2);
        Automobile suesCar = new Automobile(40, "9867", 4.6);
        patsCar.accelerate();
        suesCar.displayState();

    }
}
