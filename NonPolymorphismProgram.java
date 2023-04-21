class Vehicle {
    void carry() {
        System.out.println("Vehile is carrying!");
    }

    void speed() {
        System.out.println("Vehicle's speed!");
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

class NonPolymorphismProgram {
    public static void main(String[] args) {
        Bike bk = new Bike();
        Car cr = new Car();
        Bus bs = new Bus();

        bk.carry();
        bk.speed();

        cr.carry();
        cr.speed();

        bs.carry();
        bs.speed();
    }
}