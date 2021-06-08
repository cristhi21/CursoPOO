package Java;

class Main{
    public static void main(String[] args) {
        UberX uberX = new UberX("CDO17A", new Account("Cristhian Vargas", "112312312"), "Chevrolet", "Sonic");
        uberX.setPassenger(4);
        uberX.printDataCar();

        UberVan uberVan = new UberVan("EGH41D", new Account("Valentina Vargas", "5524324"));
        uberVan.setPassenger(6);
        uberVan.printDataCar();

        // Car car2 = new Car("EGH41R", new Account("Zonia Vargas", "11443123412"));
        // car2.printDataCar();
    }
}