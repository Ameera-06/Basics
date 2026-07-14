package Mathproblem;
import java.util.*;
public class automorphic {
    static void main() {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the input:");
        int input=sc.nextInt();
        int square=input*input;
        System.out.println(square);
        int last=input%10;
        if(input==last){
            System.out.println("It is automorphic");
        }
        else{
            System.out.println("It is not a automorphic");
        }
    }
}
