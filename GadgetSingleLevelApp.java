class Gadget {
    String type;

    void work() {
        System.out.println("Working!");
    }
}

class SmartPhone extends Gadget {

}

class GadgetSingleLevelApp {
    public static void main(String[] args) {
        SmartPhone sp = new SmartPhone();

        sp.type = "MI";
        sp.work();
    }
}