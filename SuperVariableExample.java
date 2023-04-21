class Program1 {
    int x = 10;
    void display() {
        System.out.println(x);
    }
}

class Program2 extends Program1 {
    int x = 20;
    void display() {
        System.out.println(x);
    }
}

class Program3 extends Program2 {
    int x = 30;
    void display() {
        System.out.println(x);
    }
}

class SuperVariableExample {
    public static void main(String[] args) {
        Program3 p3 = new Program3();
        p3.display();
    }
}
