from car import Car
from account import Account
from uberBlack import UberBlack
from paypal import Paypal

if __name__ == "__main__":
    # print("Hola mundo")
    car = Car("EGH41D", Account("cristhian vargas", "1144123324"))
    # print(vars(car))
    # print(vars(car.driver))

    uberBlack = UberBlack("EGH-41D", Account("Valentino Rossi", "75675455"), "F1", ["Cuero", 'Gamuza'])
    print(vars(uberBlack))
    # car2 = Car()
    # car2.licence = 55
    # car2.driver = "Zonia Vargas"
    # print(vars(car2))

    paypal = Paypal(22, 'cvargas@gmail.com')
    print(vars(paypal))