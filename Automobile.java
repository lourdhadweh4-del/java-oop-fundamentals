public class Automobile {
    public int speed;
    public String licensePlate;
    public double amountOfFuel;

    public Automobile (int speed, String licensePlate, double amountOfFuel) {
        this.speed = speed;
        this.licensePlate = licensePlate;
        this.amountOfFuel = amountOfFuel;
    }
        public void accelerate () {
        speed += 20; //increase speed
        amountOfFuel -= 1.5; //decrease fuel
        System.out.println(" Speed is:  " + speed + " Fuel is:  " + amountOfFuel);

    }
public void decelerate () {
        speed -= 20;
        if (speed<0) {
            speed = 0;
            System.out.println(" New speed is:  "  +speed);
        }
    System.out.println(" New Speed is: " + speed);
}
public void displayState () {
        speed = 20;
        licensePlate = "4532";
        amountOfFuel = 5.89;

    System.out.println(" Speed is:  " + speed + " License Plate is:  "  + licensePlate + " Amount of fuel is:  " +  amountOfFuel);

}

}
