package String;
import java.util.*;
public class Anagram {
    static void main() {
        Scanner sc=new Scanner(System.in);
        String str1="listen";
        String str2="SILENT";
        str1 = str1.toLowerCase();
        str2= str2.toLowerCase();
        boolean isEqual=true;
        if(str1.length()!=str2.length()){
            System.out.println("The String is not an Anagram");
            return;
        }
        char[] a1 = str1.toCharArray();
        char[] a2 = str2.toCharArray();
        Arrays.sort(a1);
        Arrays.sort(a2);
        for (int i = 0; i < a1.length; i++) {
            if (a1[i] != a2[i]) {
                isEqual = false;
                break;
            }
        }
        if (isEqual==true) {
            System.out.println("The String is an Anagram");
        } else {
            System.out.println("The String is not an Anagram");
        }
    }
}
