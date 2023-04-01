import java.util.Scanner;

class Jagged2DProgram {
  public static void main(String[]args) {
    Scanner scan = new Scanner(System.in);
    int [][]arr = new int[3][];
    arr[0] = new int[2];
    arr[1] = new int[4];
    arr[2] = new int[3];

    System.out.println("Please enter the ages: ");
    for(int i = 0; i <= arr.length - 1; i++) {
      for(int j = 0; j <= arr[i].length - 1; j++) {
        arr[i][j] = scan.nextInt();
      }
    }
    System.out.println("The ages are: ");
    for(int i = 0; i <= arr.length - 1; i++){
      for(int j = 0; j<= arr[i].length - 1; j++) {
        System.out.println(arr[i][j]);
      }
    }
  }
}