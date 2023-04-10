class OverloadingMain {
    public static void main() {
        System.out.println("Second main method!");
    }
    public static void main(int x) {
        System.out.println("Third main method!");
    }
    public static void main(String[] args) {
        System.out.println("First main method!");
    }    
    public static void main(int [] args) {
        System.out.println("Fourth main method!");
    }
}
