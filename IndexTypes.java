class IndexTypes {
  public static void main(String[]args) {
    byte a = 44;
    System.out.println("Decimal: "+a);

    byte b = 044;
    System.out.println("Octal: "+b);

    byte c = 0x44;
    System.out.println("Hexadecimal: "+ c);

    byte d = 0b10111;
    System.out.println("Binary: "+ d);
  }  
}
