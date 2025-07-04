import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        
        for(char x : a.toCharArray()) {
            if(Character.isLowerCase(x)) {
                System.out.print(Character.toUpperCase(x));
            } else if (Character.isUpperCase(x)) {
                System.out.print(Character.toLowerCase(x));
            }
        }

    }
}