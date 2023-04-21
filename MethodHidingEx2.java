class Parent {
    static void display() {
        System.out.println("Static Parent");
    }
}

class Child extends Parent {
    static void display() {
        System.out.println("Static Child");
    }
}

class MethodHidingEx2 {
    public static void main(String[] args) {
        Parent p1 = new Parent();
        p1.display();

        Child c = new Child();
        c.display();

        Parent p2 = new Child();
        p2.display();
    }
}
