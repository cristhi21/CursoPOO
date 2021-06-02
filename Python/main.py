from car import Car
from account import Account

if __name__ == "__main__":
    print("Hola mundo")
    car = Car("EGH41D", Account("cristhian vargas", "1144123324"))
    print(vars(car))
    print(vars(car.driver))

    # car2 = Car()
    # car2.licence = 55
    # car2.driver = "Zonia Vargas"
    # print(vars(car2))
    