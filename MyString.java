
import java.lang.reflect.Array;

public class MyString {
    public static void main(String[] args) {
        System.out.println("Testing lowercase:");
        System.out.println("UnHappy : " + lowerCase("UnHappy"));
        System.out.println("This costs 15 Sheksls : " + lowerCase("This costs 15 Sheksls"));
        System.out.println("TLV : " + lowerCase("TLV"));
        System.out.println("lowercase : " + lowerCase("lowercase"));

        System.out.println("Testing contains:");
        System.out.println(contains("unhappy", "happy")); // true
        System.out.println(contains("happy", "unhappy")); // false
        System.out.println(contains("historical", "story")); // false
        System.out.println(contains("psychology", "psycho")); // true
        System.out.println(contains("personality", "son")); // true
        System.out.println(contains("personality", "dad")); // false
        System.out.println(contains("resignation", "sign")); // true
    }

    /** Returns the lowercase version of the given string. */
    public static String lowerCase(String str) {
        char[] arr = new char[str.length()];
        for (int i = 0; i < str.length(); i++)
         {
            arr[i] = str.charAt(i);
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= 'A' && arr[i] <= 'Z') {
                arr[i] = (char) (arr[i] + 32); 
            }
        }

        // Replace the following statement with your code
        String result = "";
        for (int i = 0; i < arr.length; i++) {
            result += arr[i];
        }


    /** If str1 contains str2, returns true; otherwise returns false. */
    public static boolean contains(String str1, String str2) {
        char[] arr = new char[str.length()];
        for (int i = 0; i < str.length(); i++)
         {
            arr[i] = str.charAt(i);
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= 'A' && arr[i] <= 'Z') {
                arr[i] = (char) (arr[i] + 32); 
            }
        }
        // Replace the following statement with your code
        String result = "";
        for (int i = 0; i < arr.length; i++) {
            result += arr[i];
        }
        return  result;
    }
}
