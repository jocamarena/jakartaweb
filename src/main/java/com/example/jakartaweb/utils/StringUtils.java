package com.example.jakartaweb.utils;

public class StringUtils {
    public static String brief(String text, int maxLength) {
        if (text.length() > maxLength) {
            return text.substring(0, maxLength) + "...";
        }
        return text;
    }
}
