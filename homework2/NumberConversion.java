package homework2;

import java.util.*;

public class NumberConversion {
    public static void main(String[] args) {
        
    	String hexCode = "0123456789ABCDEF";
        String inStr;
        int inRadix = 0;
        int outRadix = 0;
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a number and radix: ");
        inStr = sc.nextLine();
        
        System.out.print("Enter the input radix: ");
        inRadix = sc.nextInt();
        while (inRadix > 16 || inRadix < 2) {
            System.out.print("Invalid. Enter the input radix: ");
            inRadix = sc.nextInt();
        }

        if (!radixCheck(inStr, hexCode, inRadix)) {
            System.out.println("Wrong radix!");
            System.exit(0);
        }

        System.out.print("Enter the output radix: ");
        outRadix = sc.nextInt();
        while (inRadix > 16 || inRadix < 2) {
            System.out.print("Invalid. Enter the output radix: ");
            outRadix = sc.nextInt();
        }

        sc.close();
        System.out.print("\"" + inStr + "\" in radix " + inRadix + " is \"" + toRadix(inStr, hexCode, inRadix, outRadix) + "\" in radix " + outRadix + ".");
    }

    public static boolean radixCheck(String inStr, String hexCode, int radix) {
        for (int i = 0; i < inStr.length(); i++) {
        	int n = hexCode.indexOf(inStr.charAt(i));
            if (n >= radix || n == -1) {
                return false;
            }
        }
        return true;
    }

    public static String toRadix(String inStr, String hexCode, int inRadix, int outRadix) {
        int number = radixN2Dec(inStr, hexCode, inRadix);
        String result = "";
        while (number > 0) {
            char radix = hexCode.charAt(number % outRadix);
            result = radix + result;
            number /= outRadix;
        }
        return result;
    }

    public static int radixN2Dec(String inStr, String hexCode, int radix) {
        int result = 0;
        for (int i = 0; i < inStr.length(); i++) {
            int digit = hexCode.indexOf(inStr.charAt(i));
            result += digit * Math.pow(radix, (inStr.length() - 1 - i));
        }
        return result;
    }
}
