public class Main {
    public static void main(String[] args) {

        // APPEND()
        StringBuilder sb = new StringBuilder("Hello");
        sb.append(" World");
        System.out.println(sb);

        // INSERT()
        sb = new StringBuilder("Java");
        sb.insert(2, "123");
        System.out.println(sb);

        // DELETE()
        sb = new StringBuilder("Programming");
        sb.delete(3, 6);
        System.out.println(sb);

        // DELETECHARAT()
        sb = new StringBuilder("Hello");
        sb.deleteCharAt(1);
        System.out.println(sb);

        // REPLACE()
        sb = new StringBuilder("Hello");
        sb.replace(0, 5, "Java");
        System.out.println(sb);

        // REVERSE()
        sb = new StringBuilder("Java");
        sb.reverse();
        System.out.println(sb);

        // LENGTH()
        sb = new StringBuilder("Programming");
        System.out.println(sb.length());

        // CHARAT()
        sb = new StringBuilder("Java");
        System.out.println(sb.charAt(2));

        // SETCHARAT()
        sb = new StringBuilder("Java");
        sb.setCharAt(0, 'K');
        System.out.println(sb);

        // SUBSTRING()
        sb = new StringBuilder("Programming");
        System.out.println(sb.substring(3, 7));

        // CAPACITY()
        sb = new StringBuilder("Java");
        System.out.println(sb.capacity());

        // ENSURECAPACITY()
        sb = new StringBuilder();
        sb.ensureCapacity(50);
        System.out.println(sb.capacity());

        // TRIMTOSIZE()
        sb = new StringBuilder("Java");
        sb.trimToSize();
        System.out.println(sb.capacity());

        // SETLENGTH()
        sb = new StringBuilder("Programming");
        sb.setLength(4);
        System.out.println(sb);

        // INDEXOF()
        sb = new StringBuilder("Java Programming");
        System.out.println(sb.indexOf("Program"));

        // LASTINDEXOF()
        sb = new StringBuilder("banana");
        System.out.println(sb.lastIndexOf("a"));

        // TOSTRING()
        sb = new StringBuilder("Java");
        System.out.println(sb.toString());

    }
}