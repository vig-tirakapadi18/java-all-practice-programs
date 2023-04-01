import java.util.Scanner;

class GuesserGame {
  public static void main(String[]args) {
    Scanner scan = new Scanner(System.in);
    int []num = new int[5];
    System.out.println("Enter 5 numbers: ");
    
    for(int i = 0; i <= num.length - 1; i++) {
      num[i] = scan.nextInt();
    }
    System.out.println("Guess a number: ");
    int guessedNum = scan.nextInt();
    boolean status = false;

    for(int i = 0; i <= num.length - 1; i++) {
      if(guessedNum == num[i]) {
        status = true;
      }
    }

    if(status == true) {
      System.out.println("Second player won!");
    } else {
      System.out.println("First player won!");
    }
  }
}
