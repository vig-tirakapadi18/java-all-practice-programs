class Laptop {
  String brand;
  String processor;
  int cost;

  void switchOn() {
    System.out.println("Switched on!");
  }

  void work() {
    System.out.println("Working!");
  }

  void switchOff() {
    System.out.println("Switched off!");
  }
}

class LaptopApp {
  public static void main(String[]args) {
    Laptop l1 = new Laptop();
    Laptop l2 = new Laptop();

    l1.brand = "HP";
    l1.processor = "I3";
    l1.cost = 42000;
    l2.brand = "DELL";
    l2.processor = "I5";
    l2.cost = 60000;

    l1.switchOn();
    l1.work();
    l1.switchOff();
    l2.switchOn();
  }
}
