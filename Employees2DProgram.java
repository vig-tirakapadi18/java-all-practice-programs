import java.util.Scanner;

class Employees2DProgram {
  public static void main(String[]args) {
    Scanner scan = new Scanner(System.in);
    String [][]name = new String[4][5];
    System.out.println("Enter employees names: ");
    
    for(int i = 0; i <= name.length - 1; i++) {
      for(int j = 0; j <= name[i].length - 1; j++) {
        name[i][j] = scan.next();
      }
    }

    System.out.println("The names are: ");
    for(int i = 0; i <= name.length - 1; i++) {
      for(int j = 0; j <= name[i].length - 1; j++) {
        System.out.println(name[i][j]);
      }
    }
  }  
}
