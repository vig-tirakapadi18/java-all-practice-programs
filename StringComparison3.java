class StringComparison3 {
    public static void main(String[]args) {
        String s1 = new String("Vighnesh");
        String s2 = "Vighnesh";

        if(s1 == s2) {
            System.out.println("Addresses are Equal!");
        } else {
            System.out.println("Addresses are not Equal!");
        }

        if(s1.equals(s2)) {
            System.out.println("Values are not Equal!");
        } else {
            System.out.println("Values are not Equal!");
        }
    }    
}
