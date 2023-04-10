class FewStringImpMethods {
    public static void main(String[] args) {
        String str = "KodNest Tech";

        System.out.println("Length of string: "+str.length());

        // System.out.println(str[3]);  //Not Possible

        System.out.println("Char at index 3: "+str.charAt(3));

        System.out.println("Index of 'd':  "+str.indexOf('d'));

        System.out.println("Is string contains : Nest : "+str.contains("Nest"));

        System.out.println("Is string contains : Java : "+str.contains("Java"));

        System.out.println("Get substring: "+str.substring(3));

        System.out.println("Get substring: "+str.substring(3, 7));
    }    
}
