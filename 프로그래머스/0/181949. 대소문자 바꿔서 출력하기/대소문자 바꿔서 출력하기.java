import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        StringBuilder b = new StringBuilder();
        
        for (char c : a.toCharArray()) {
            if (Character.isUpperCase(c)) {
                b.append(Character.toLowerCase(c));
            }
            if(Character.isLowerCase(c)) {
                b.append(Character.toUpperCase(c));
            }
        }
        System.out.print(b.toString());
    }
}