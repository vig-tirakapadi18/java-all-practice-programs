class UseOfStaticBlocks {
    static int x;

    static {
        x = 100;
    }

    void display() {
        System.out.println(x);
    }
}

class UseOfStaticBlocksApp {
    public static void main(String[] args) {
        UseOfStaticBlocks sb = new UseOfStaticBlocks();
        sb.display();
    }
}