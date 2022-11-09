package com.bridgelabz;

public class MoodAnalyzer1 {

    String message ;

    public MoodAnalyzer1() {
    }

    public MoodAnalyzer1(String message) {
        this.message = message;
    }

    public String analysingMood(){
        try {
            if (message.contains("Sad")) {
                return "SAD";
            } else {
                return "HAPPY";
            }
        } catch (NullPointerException e){
            return "HAPPY";
        }
    }
}
