var car = new Car("CDO17A", new Account("Cristhian Vargas", "114412231"));
car.passenger = 4;
car.printDataCar();

let uberX = new UberX("EGH-41D", new Account("Antonio Vivaldi", "9991231"), "Ford", "Ford Mustang");
uberX.passenger = 4;
uberX.printDataCar();

let paypal = new Paypal(2, 'cvargas@gmail.com');
paypal.printDataPaypal();