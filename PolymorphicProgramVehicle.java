class Vehicle {
    void carry() {
        System.out.println("Vehicle is carrying!");
    }

    void speed() {
        System.out.println("Vehicle is speeding!");
    }
}

class Bike extends Vehicle {
    void carry() {
        System.out.println("Bike is carrying!");
    }

    void speed() {
        System.out.println("Bike's speed!");
    }
}

class Car extends Vehicle {
    void carry() {
        System.out.println("Car is carrying!");
    }

    void speed() {
        System.out.println("Car's speed!");
    }
}

class Bus extends Vehicle {
    void carry() {
        System.out.println("Bus is carrying!");
    }

    void speed() {
        System.out.println("Bus's speed!");
    }
}

class PolymorphicProgramVehicle {
    public static void main(String[] args) {
        Vehicle ref;
        Bike bk = new Bike();
        Car cr = new Car();
        Bus bs = new Bus();

        ref = bk;
        ref.carry();
        ref.speed();

        ref = cr;
        ref.carry();
        ref.speed();

        ref = bs;
        ref.carry();
        ref.speed();
    }
}
