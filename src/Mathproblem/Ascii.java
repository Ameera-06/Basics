package Mathproblem;
import java.util.*;
public class Ascii {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the character:");
        char ch = sc.next().charAt(0);
        if(ch>=48 && ch<=57){
            System.out.println(ch + " is Digit");
        }
        else{
            System.out.println(ch + " not a digit");
        }
    }
}