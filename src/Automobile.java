public class Automobile {
    public int speed;
    public String licensePlate;
    public double amountOfFuel;

    public void accelerate() {
        speed += 5;
        amountOfFuel -= 7;

        System.out.println("speed=" + speed + "amountOfFuel=" + amountOfFuel);

    }

    public void decelerate() {
        speed -= 5;
        if (speed < 0) {
            speed = 0;
        }
        System.out.println("new speed is: " + speed);

    }

    public void displayState() {
        System.out.println("speed = " + speed + "amountOfFuel = " + amountOfFuel + "licensePlate " + licensePlate);

    }

    public class Main {
        public static void main(String[] args) {
            Automobile patsCar = new Automobile();
            Automobile suesCar = new Automobile();
            patsCar.speed = 10;
            patsCar.licensePlate = "123";
            patsCar.amountOfFuel = 20.70;
            patsCar.accelerate();

            suesCar.speed = 8;
            suesCar.licensePlate = "1785";
            suesCar.amountOfFuel = 29.70;
            suesCar.displayState();
        }

    }
}


