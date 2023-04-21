class Animal {
    void sleep() {
        System.out.println("Sleeping!");
    }
}

class Carnivorous extends Animal {
    void food() {
        System.out.println("Food is Flesh!");
    }
}

class Tiger extends Carnivorous {
    void hunt() {
        System.out.println("Hunting!");
    }
}

class Ominivorous extends Animal {
    void food() {
        System.out.println("Food is Both!");
    }
}

class Dog extends Ominivorous {
    void bark() {
        System.out.println("Barking!");
    }
}

class Herbivorous extends Animal {
    void food() {
        System.out.println("Food is Veg!");
    }
}

class Cow extends Herbivorous {
    void eat() {
        System.out.println("Eats Grass!");
    }
}

class AnimalHybridApp {
    public static void main(String[] args) {
        Carnivorous cv = new Carnivorous();
        Tiger tg = new Tiger();
        Ominivorous ov = new Ominivorous();
        Dog dg = new Dog();
        Herbivorous hv = new Herbivorous();
        Cow cw = new Cow();

        cv.sleep();
        cv.food();

        tg.sleep();
        tg.food();
        tg.hunt();

        ov.sleep();
        ov.food();
        
        dg.sleep();
        dg.food();
        dg.bark();

        hv.sleep();
        hv.food();

        cw.sleep();
        cw.food();
        cw.eat();
    }
}
