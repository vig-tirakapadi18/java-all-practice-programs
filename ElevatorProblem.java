import java.util.Scanner;

class ElevatorProblem {
  public static void main(String[]args) {
    Scanner scan = new Scanner(System.in);
    double []arr = new double[10];
    System.out.println("Please enter a weights!");
    for(int i = 0; i <= arr.length - 1; i++) {
      System.out.println("Enter the weight of person "+ i + ": ");
      arr[i] = scan.nextDouble();
    }

    double totalWeight = 0.0;
    for(int i = 0; i <= arr.length -1; i++) {
      totalWeight += arr[i];
    }
    System.out.println("The total weight is: "+ totalWeight);

    if(totalWeight <= 500.0) {
      System.out.println("The Lift is Working!");
    } else {
      System.out.println("The Lift is Overloaded!");
    }
  }
}