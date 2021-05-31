package Java;

class Main{
    public static void main(String[] args) {
        Car car = new Car("CDO17A", new Account("Cristhian Vargas", "112312312"));
        car.passenger = 4;
        car.printDataCar();

        Car car2 = new Car("EGH41R", new Account("Zonia Vargas", "11443123412"));
        car2.printDataCar();
    }
}