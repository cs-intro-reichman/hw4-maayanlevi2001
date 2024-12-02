

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
        String newword="";
        char[] lowerCaseword = new char[str.length()];
       
        for (int i = 0; i < str.length(); i++){
             char charOriginal = str.charAt(i);
             if (charOriginal >= 'A' && charOriginal <= 'Z') {
             lowerCaseword[i] = (char) (charOriginal + 32); 
            }
            else 
            {
                lowerCaseword[i] = charOriginal; 
            } 
        }
        for (int j = 0; j < str.length(); j++) {
            newword =  newword + lowerCaseword[j];
        }
        return newword;
        }
    

    /** If str1 contains str2, returns true; otherwise returns false. */
    public static boolean contains(String str1, String str2) {
        if (str2.isEmpty()){
            return true;
        }
    
        if (str1.length() < str2.length()) { 
        return false; 
        }
          
           for (int i = 0; i <= str1.length() - str2.length(); i++){
                boolean equal = true;
                for (int j = 0; j < str2.length(); j++) {
                     if (str2.charAt(j) !=  str1.charAt(i+j)) {
                        equal = false;
                        break;
                    }
                }
                if (equal){
                return true; 
                }
            }
            
        return false; 
        }
    }
