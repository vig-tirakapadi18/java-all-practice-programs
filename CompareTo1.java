class CompareTo1 {
    public static void main(String[]args) {
        String str1 = "HELLO";
        String str2 = "HIIIIIIII";

        if(str1.compareTo(str2) > 0) {
            System.out.println("str1 is greater than str2!");
        } else if (str1.compareTo(str2) < 0) {
            System.out.println("str1 is lesser than str2!");
        } else {
            System.out.println("Both str1 and str2 are equal!");
        }
    }
}
