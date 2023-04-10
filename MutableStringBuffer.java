class MutableStringBuffer {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("Java");
        System.out.println(sb);
        sb.append(" Python");
        System.out.println(sb);

        String str = "Java";
        System.out.println(str);
        str.concat(" Script");
        System.out.println(str);
    }    
}
