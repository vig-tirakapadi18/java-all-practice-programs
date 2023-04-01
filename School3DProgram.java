import java.util.Scanner;

class School3DProgram {
  public static void main(String[]args) {
    Scanner scan = new Scanner(System.in);
    int [][][]age = new int[2][2][3];

    System.out.println("Please enter the ages: ");
    for(int i = 0; i <= age.length - 1; i++) {
      for(int j = 0; j <= age[i].length - 1; j++) {
        for(int k = 0; k <= age[i][j].length - 1; k++) {
          age[i][j][k] = scan.nextInt();
        }
      }
    }

    System.out.println("The ages are: ");
    for(int i = 0; i <= age.length - 1; i++) {
      for(int j = 0; j <= age[i].length - 1; j++) {
        for(int k = 0; k <= age[i][j].length - 1; k++) {
          System.out.println(age[i][j][k]);
        }
      }
    }
  }  
}
