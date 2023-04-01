class Calculator {
  int a=10, b=20, result;

  void add() {
    result = a + b;
    System.out.println("Sum: "+ result);
  }

  void sub() {
    result = a - b;
    System.out.println("Difference: "+ result);
  }

  void mul() {
    result = a * b;
    System.out.println("Multiplication: "+ result);
  }

  void div() {
    result = a % b;
    System.out.println("Divison: "+ result);
  }
}

class CalculatorApp {
  public static void main(String[]args) {
    Calculator calc = new Calculator();
    calc.add();
    calc.sub();
    calc.mul();
    calc.div();
  }
  
}
