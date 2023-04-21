class Program1 {
    private int a = 10;

    void display1() {
        System.out.println(a);
    }
}

class Program2 extends Program1 {
    int b = 20;

    void changeVal() {
        // a = 99;
    }

    void display2() {
        // System.out.println(a);
        System.out.println(b);
    }
}

class EncapsulationWithInheritanceApp {
    public static void main(String[] args) {
        Program2 p = new Program2();

        p.display1();
        p.display2();
    }
}
