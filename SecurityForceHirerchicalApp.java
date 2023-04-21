class SecurityForce {
    void attack() {
        System.out.println("Attacking!");
    }
}

class Army extends SecurityForce {
    void secureLand() {
        System.out.println("Securing Land!");
    }
}

class AirForce extends SecurityForce {
    void secureAir() {
        System.out.println("Securing Air!");
    }
}

class Navy extends SecurityForce {
    void secureWater() {
        System.out.println("Securing Water!");
    }
}

class SecurityForceHirerchicalApp {
    public static void main(String[] args) {
        Army ar = new Army();
        AirForce af = new AirForce();
        Navy nv = new Navy();

        ar.attack();
        ar.secureLand();

        af.attack();
        af.secureAir();

        nv.attack();
        nv.secureWater();
    }
}
