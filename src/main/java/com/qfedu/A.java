package com.qfedu;

public class A {
    public static void main(String[] args) {
        String str = "qwartadagca";
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == 'a') {
                System.out.println(ch);
            }
        }
    }
}
