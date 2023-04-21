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

class Transport {
    void display(Vehicle ref) {
        ref.carry();
        ref.speed();
    }
}

class PolymorphicProgramVehicle3 {
    public static void main(String[] args) {
        Bike bk = new Bike();
        Car cr = new Car();
        Bus bs = new Bus();

        Transport tr = new Transport();
        tr.display(bk);
        tr.display(cr);
        tr.display(bs);
    }
}
