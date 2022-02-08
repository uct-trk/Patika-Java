package Giris;

import java.util.Arrays;

public class StringSinifi {
    public static void main(String[] args) {
        String str = "patika";
        String patika = "paTiKa";
        String[] sp = str.split("a");
        System.out.println(str.charAt(2));
        System.out.println(str.codePointAt(0));
        System.out.println(str.compareTo(patika));
        System.out.println(str.compareToIgnoreCase(patika));
        System.out.println(str.concat(".dev"));
        System.out.println(str.contains("a"));
        System.out.println(str.endsWith("b"));
        System.out.println(patika.indexOf("i"));
        System.out.println(patika.lastIndexOf("T"));
        System.out.println(patika.length());
        System.out.println(str.replaceAll("a","b"));
        System.out.println();
        System.out.println(Arrays.toString(sp));
        System.out.println(patika.substring(2,5));
    }
}
