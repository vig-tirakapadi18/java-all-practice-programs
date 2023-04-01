import java.util.Scanner;

class Array1DWithInput {
  public static void main(String[]args) {
    Scanner scan = new Scanner(System.in);
    System.out.println("Please enter the size of 1D array: ");
    int size = scan.nextInt();

    int [] arr = new int[size];

    for (int i = 0; i <= arr.length - 1; i++) {
      System.out.println("Enter the element at "+i+" : ");
      arr[i] = scan.nextInt();
    }

    System.out.println("The elements are: ");
    for(int i = 0; i <= arr.length - 1; i++) {
      System.out.println("The element at "+i+" is : "+ arr[i]);
    }
  }
}
