class Parent {
    int x, y;

    public Parent() {
        System.out.println("Parent 0-para constructor!");
        x = 10;
        y = 20;
    }

    public Parent(int x)  {
        super();
        System.out.println("Parent 1-para constructor!");
        this.x = x;
        y = 25;
    }

    public Parent(int x, int y) {
        System.out.println("Parent 2-para constructor!");
        this.x = x;
        this.y = y;
    }
}

class Child extends Parent {
    int p, q;

    public Child() {
        super(66, 77);
        System.out.println("Child 0-para constructor!");
        p = 111; 
        q = 222;
    }

    public Child(int p, int q) {
        super(88);
        System.out.println("Child 2-para constructor!");
        this.p = p;
        this.q = q;
    }

    void display() {
        System.out.println(x);
        System.out.println(y);
        System.out.println(p);
        System.out.println(q);
    }
}

class SuperMethodExampleApp2 {
    public static void main(String[] args) {
        Child c1 = new Child();
        c1.display();
        Child c2 = new Child();
        c2.display();
    }
}
