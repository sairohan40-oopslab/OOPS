class Vehicle {
    private String model;
    private int speed;
    private int speedLimit;

    public Vehicle(String model, int speedLimit) {
        this.model = model;
        this.speedLimit = speedLimit;
        this.speed = 0;
    }

    public void showModel() {
        System.out.println("Vehicle Model: " + model);
    }

    public void showSpeed() {
        System.out.println("Current Speed: " + speed);
    }

    public void accelerate(int increase) {
        if (speed + increase <= speedLimit) {
            speed += increase;
        } else {
            speed = speedLimit;
        }
    }

    public void brake(int decrease) {
        if (speed - decrease >= 0) {
            speed -= decrease;
        } else {
            speed = 0;
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Vehicle car = new Vehicle("Sedan", 120);
        car.accelerate(50);
        car.accelerate(100);
        car.brake(30);
        car.showModel();
        car.showSpeed();
    }
}
