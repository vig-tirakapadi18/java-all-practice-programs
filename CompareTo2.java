class CompareTo2 {
    public static void main(String[]args) {
        String str1 = "VIG";
        String str2 = "VIGH";

        if(str1.compareTo(str2) > 0) {
            System.out.println("str1 is greater than str2!");
        }else if (str1.compareTo(str2) < 0) {
            System.out.println("str1 is lesser than str2!");
        } else {
            System.out.println("str1 is equal to str2!");
        }
    }
}
