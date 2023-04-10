class StaticBlocks {
    static {
        System.out.println("First static block!");
    }    

    static {
        System.out.println("Second static block!");
    }

    static {
        System.out.println("Third static block!");
    }

    public static void main(String[] args) {
        System.out.println("main method!");
    }
}
