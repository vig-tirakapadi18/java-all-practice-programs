class Program1 {
    int x = 10;

    void display() {
        System.out.println("Program 1");
    }
}

class Program2 extends Program1 {
    int y = 20;

    public Program2() {
        super();

        y = 30;
    }

    void display() {
        System.out.println("Program 2");
    }
}

class ConstructorExecutionInInheritance {
    public static void main(String[] args) {
        Program2 p2 = new Program2();

        p2.display();
    }
}
