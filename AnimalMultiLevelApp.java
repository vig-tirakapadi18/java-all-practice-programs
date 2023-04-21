class Animal {
    void sleep() {
        System.out.println("Sleeping!");
    }
}

class Carnivorous extends Animal {
    void food() {
        System.out.println("Eating Flesh!");
    }
}

class Tiger extends Carnivorous {
    void hunt() {
        System.out.println("Hunting!");
    }
}

class AnimalMultiLevelApp {
    public static void main(String[] args) {
        Carnivorous c = new Carnivorous();
        Tiger t = new Tiger();

        c.sleep();
        c.food();

        t.sleep();
        t.food();
        t.hunt();
    }
}
