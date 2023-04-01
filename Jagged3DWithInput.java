import java.util.Scanner;

class Jagged3DWithInput {
  public static void main(String[]args) {
    Scanner scan = new Scanner(System.in);
    System.out.println("Enter the 1st dimension of an Array: ");
    int x = scan.nextInt();

    int [][][]arr = new int[x][][];

    for(int i = 0; i <= x - 1; i++) {
      System.out.println("Enter the 2nd dimension of an Array: ");
      int y = scan.nextInt();
      arr[i] = new int[y][];
    }
    for(int i = 0; i <= arr.length - 1; i++) {
      for(int j = 0; j <= arr[i].length - 1; j++) {
          System.out.println("Enter the 3rd dimension of an Array: ");
          int z = scan.nextInt();
          arr[i][j] = new int[z];
      }
    }

    for(int i = 0; i <= arr.length - 1; i++) {
      for(int j = 0; j <= arr[i].length - 1; j++) {
        for(int k = 0; k <= arr[i][j].length - 1; k++) {
          System.out.println("Please enter the age for school "+ i + " classroom "+ j + " student "+ k +" is : ");
          arr[i][j][k] = scan.nextInt();
        }
      }
    }

    for(int i = 0; i <= arr.length - 1; i++) {
      for(int j = 0; j <= arr[i].length - 1; j++) {
        for(int k = 0; k <= arr[i][j].length - 1; k++) {
          System.out.println(arr[i][j][k]);
        }
      }
    }
  }
}