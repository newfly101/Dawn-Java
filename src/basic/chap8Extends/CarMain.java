package basic.chap8Extends;

public class CarMain {
    public static void main(String[] args) {
        ElectricCar eCar = new ElectricCar();
        eCar.move();
        eCar.charge();

        GasCar gasCar = new GasCar();
        gasCar.move();
        gasCar.fillUp();
    }
}
