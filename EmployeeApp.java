class Employee {
  String id;
  String name;
  int salary;

  void doProject() {
    System.out.println("Doing the Project!");
  }

  void attendClass() {
    System.out.println("Attending Class!");
  }
}

class EmployeeApp {
  public static void main(String[]args) {
    Employee e = new Employee();
    e.id = "E001";
    e.name = "Vig";
    e.salary = 45000;
    e.doProject();
    e.attendClass();
  }
}
