package com.bridgelabz;

import java.util.regex.Pattern;

@FunctionalInterface
public interface Regex {
    public boolean check(String pattern , String input);
}
