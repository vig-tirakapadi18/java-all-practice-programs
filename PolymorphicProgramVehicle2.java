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

class PolymorphicProgramVehicle2 {
    public static void main(String[] args) {
        Vehicle ref;
        ref = new Bike();
        ref.carry();
        ref.speed();

        ref = new Car();
        ref.carry();
        ref.speed();

        ref = new Bus();
        ref.carry();
        ref.speed();
    }
}
