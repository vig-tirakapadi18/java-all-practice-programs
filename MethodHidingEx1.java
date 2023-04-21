class Parent1 {
    void display() {
        System.out.println("Parent");
    }
}

class Child extends Parent1 {
    void display() {
        System.out.println("Child");
    }
}

class MethodHidingEx1 {
    public static void main(String[] args) {
        Parent1 p1 = new Parent1();
        p1.display();

        Child c = new Child();
        c.display();

        Parent1 p2 = new Child();
        p2.display();
    }
}
