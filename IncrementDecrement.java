// class IncrementDecrement {
//   public static void main(String[]args) {
//     int a = 5;
//     System.out.println(a);
//     ++a;
//     System.out.println(a);
//   } 
// }

// class IncrementDecrement {
//   public static void main(String[]args) {
//     int a = 5;
//     System.out.println(a);
//     a++;
//     System.out.println(a);
//   } 
// }

// class IncrementDecrement {
//   public static void main(String[]args) {
//     int a = 5;
//     int b = a;
//     b = ++a;
//     System.out.println(a);
//     System.out.println(b);
//   } 
// }

// class IncrementDecrement {
//   public static void main(String[]args) {
//     int a = 5;
//     int b = a;
//     b = a++;
//     System.out.println(a);
//     System.out.println(b);
//   } 
// }

// class IncrementDecrement {
//   public static void main(String[]args) {
//     int a = 5;
//     int b = a;
//     b = ++a + ++a;
//     System.out.println(a);
//     System.out.println(b);
//   } 
// }

// class IncrementDecrement {
//   public static void main(String[]args) {
//     int a = 5;
//     int b = a;
//     b = a++ + a++;
//     System.out.println(a);
//     System.out.println(b);
//   } 
// }

class IncrementDecrement {
  public static void main(String[]args) {
    int a = 5;
    int b = a;
    b = ++a + ++a + a++ + --a + a-- + ++a + a--;
    System.out.println(a);
    System.out.println(b);
  } 
}

