package com.example.dsa;

public class LongestString {
    public static void main(String[] args) {
        String[] arr = { "Sajid", "Sajid ali ahamad bhai suthar",
                "Sajid ali ahemad bhai", "Sajid ali suthar", "Sajid ali" };
        int max = 0;
        String longestString = "";
        for (String s : arr) {
            if (s.length() > max) {
                longestString = s;
                max = longestString.length();
            }
        }
        System.out.println("longestString : "+longestString);

    }
}
