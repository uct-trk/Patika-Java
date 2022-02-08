package Giris;

import java.util.Scanner;

public class PolindromikKelimeleriBulma {

    // birinci yontem
    static boolean isPalindrom(String str){
        int i = 0;
        int j = str.length() - 1;
        while (i < j){
            if (str.charAt(i) != str.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }

    // ikinci yontem
    static boolean isPalindrome2(String str){
        String reverse = "";
        for (int i = str.length() - 1; i >= 0; i--){
            reverse = reverse + str.charAt(i);
        }
        if (str.equals(reverse)){
            return true;
        } else {
            return false;
        }

    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Kelimeyi giriniz: ");
        String word = input.nextLine();
        System.out.println(isPalindrome2(word));
    }
}
