package Java;

public class Car {
    Integer id;
    String licence;
    Account driver;//Objeto de tipo driver
    Integer passenger;

    public Car(String licence, Account driver){
        this.licence = licence;
        this.driver = driver;
    }
    
    void printDataCar(){
        System.out.println("Licence: " + licence + " | Driver name: " + driver.name + " | Passenger: " + passenger);
    }
}
