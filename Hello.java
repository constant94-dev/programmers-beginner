public class Hello {
    public static void main(String[] args) {
        System.out.println("Hello World!");

        char upper = 'G';
        char lower = (char) (upper - ('a'-'A'));
        System.out.println(lower);

        char internal_library_char = Character.toLowerCase(upper);
        System.out.println(internal_library_char);
    }
}
