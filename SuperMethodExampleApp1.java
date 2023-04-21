class Parent {
    int x, y;

    public Parent() {
        System.out.println("Parent 0-para constructor!");

        x = 10;
        y = 20;
    }

    public Parent(int x) {
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
        System.out.println("Child 0-para constructor!");
        p = 18;
        q = 17;
    }

    void display() {
        System.out.println(x);
        System.out.println(y);
        System.out.println(p);
        System.out.println(q);
    }
}

class SuperMethodExampleApp1 {
    public static void main(String[] args) {
        Child c = new Child();
        c.display();
    }
}