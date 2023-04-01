import java.util.Scanner;

class PlayersHeight2D {
  public static void main(String[]args) {
    Scanner scan = new Scanner(System.in);
    double [][]height = new double[3][3];
    System.out.println("Enter a height of players: ");

    for(int i = 0; i <= height.length - 1; i++) {
      for(int j = 0; j <= height[i].length - 1; j++) {
        height[i][j] = scan.nextDouble();
      }
    }

    System.out.println("The height of players are: ");
    for(int i = 0; i <= height.length - 1; i++) {
      for(int j = 0; j <= height[i].length - 1; j++) {
        System.out.println(height[i][j]);
      }
    }
  }  
}
