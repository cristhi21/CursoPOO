package Java;

public class Car {
    Integer id;
    String license;
    Account driver;//Objeto de tipo driver
    Integer passenger;

    public Car(String license, Account driver){
        this.license = license;
        this.driver = driver;
    }
    
    void printDataCar(){
        System.out.println("license: " + license + " | Driver name: " + driver.name + " | Passenger: " + passenger);
    }
}
