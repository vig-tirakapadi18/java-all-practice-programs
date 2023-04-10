class StringBuilderBufferCapacity {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        System.out.println(sb.capacity());
        System.out.println(sb.length());

        sb.append("Hello ");
        System.out.println(sb.capacity());
        System.out.println(sb.length());

        sb.append("I am ");
        System.out.println(sb.capacity());
        System.out.println(sb.length());

        sb.append("Vighnesh from XYZ ");
        System.out.println(sb.capacity());
        System.out.println(sb.length());
    
        sb.append("and I studied Engineering ");
        System.out.println(sb.capacity());
        System.out.println(sb.length());

        sb.append("and finished BTech in 2022 ");
        System.out.println(sb.capacity());
        System.out.println(sb.length());
    }
}
