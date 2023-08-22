import java.util.Scanner;
import java.lang.*;

class Solution {
    public static void main(String[] args) {
        System.out.println("Enter first Number:");
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        System.out.println("Enter second Number:");
        String b = sc.nextLine();

        Solution s = new Solution();
        String result = s.addBinary(a, b);
        System.out.println("Sum is: " + result);
    }

    public String addBinary(String a, String b) {
        if(a.length() >= 0 || b.length() >= 0 || a.length() <= 10000 || b.length() <= 10000){
            int num1 = Integer.parseInt(a, 2);
            int num2 = Integer.parseInt(b, 2);

            int sum = num1 + num2;
            return Integer.toBinaryString(sum);
        }
        else{
            exit(0);
        }
    }
}
