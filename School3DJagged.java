import java.util.Scanner;

class School3DJagged {
  public static void main(String[]args) {
    Scanner scan = new Scanner(System.in);
    float [][][]height = new float[2][][];

    height[0] = new float[2][];
    height[1] = new float[3][];

    height[0][0] = new float[2];
    height[0][1] = new float[4];
    height[1][0] = new float[3];
    height[1][1] = new float[2];
    height[1][2] = new float[4];
    
    System.out.println("Enter the heights: ");
    for(int i = 0; i <= height.length - 1; i++) {
      for(int j = 0; j <= height[i].length - 1; j++) {
        for (int k = 0; k <= height[i][j].length - 1; k++) {
          height[i][j][k] = scan.nextFloat();
        }
      }
    }

    System.out.println("The Heights are: ");
    for(int i = 0; i <= height.length - 1; i++) {
      for(int j = 0; j<= height[i].length - 1; j++) {
        for(int k = 0; k <= height[i][j].length - 1; k++) {
          System.out.println(height[i][j][k]);
        }
      }
    }
  }  
}
