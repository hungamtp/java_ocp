package basic;

public class HString {
    public static void main(String[] args) {
        String string1 = "Hello";
        String string2 = "Hello"; // re-use the value in StringPool
        String string3 = new String("Hello"); // Create new value in StringPool
        System.out.println(string1 == string3); // compare the reference
        System.out.println(string1.equals(string3)); // compare the value
        System.out.println(string1 == string2);
        StringBuilder sb = new StringBuilder("Hello");
        System.out.println(string3.intern());
        String emptyString = "  john";
        emptyString.trim();
        System.out.println(emptyString);

        String s1 = "John Wayne";
        String s2 = "John" + " " + "Wayne"; // run-time StringPool understand there is John Wayne in the StringPool
        System.out.println(s1 == s2); // true

    }
}
