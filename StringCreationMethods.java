class StringCreationMethods {
    public static void main(String[]args) {
        String s1 = new String("Vighnesh");
        System.out.println("My name is: "+s1);

        char [] arr = {'V', 'i', 'g', 'h', 'n', 'e', 's', 'h'};
        String s2 = new String(arr);
        System.out.println("My name is: "+s2);

        String s3 = "Vighnesh";
        System.out.println("My name is: "+s3);
    }
}