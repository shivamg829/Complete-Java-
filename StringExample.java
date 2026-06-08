public class StringExample {
    public static void main(String[] args) {
        // String is immutable in Java, meaning once created, it cannot be changed.
        String str = new String("Hello, World!");
        System.out.println(str + "Shivam");
        System.out.println(str.length());
        System.out.println(str.toUpperCase());
        System.out.println(str.toLowerCase());
        System.out.println(str.charAt(7));
        System.out.println(str.substring(0, 5));
        System.out.println(str.contains("World"));
        System.out.println(str.replace("World", "Java"));
        System.out.println(str.trim());
        System.out.println(str.equals("Hello, World!"));
        System.out.println(str.equalsIgnoreCase("hello, world!"));
        System.out.println(str.startsWith("Hello"));
        System.out.println(str.endsWith("!"));
        System.out.println(str.indexOf("o"));
        System.out.println(str.concat(" Welcome to Java programming."));

        // String Buffer is mutable and thread-safe, used for building strings efficiently.
        StringBuffer stringBuffer = new StringBuffer("Hello");
        stringBuffer.append(", World!");
        System.out.println(stringBuffer.toString());
        // String Builder is mutable but not thread-safe, used for building strings efficiently in single-threaded contexts.
        StringBuilder stringBuilder = new StringBuilder("Hello");
        stringBuilder.append(", World!");
        System.out.println(stringBuilder.toString());
    }
}
