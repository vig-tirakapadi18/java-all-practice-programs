class BikeClass {
  String brand;
  String color;
  int cost;
  
  void start() {
    System.out.println("The Bike is Started!");
  }

  void move() {
    System.out.println("The Bike is Moving!");
  }

  void stop() {
    System.out.println("The Bike is Stopped!");
  }

  public static void main(String[]args) {
    BikeClass b = new BikeClass();
    b.brand = "Shine";
    b.color = "Green";
    b.cost = 90000;

    b.start();
    b.move();
    b.stop();
  }
}
