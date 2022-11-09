package com.bridgelabz;

public class MoodAnalyzer2 {

    String message ;

    public MoodAnalyzer2() {
    }

    public MoodAnalyzer2(String message) {
        this.message = message;
    }

    public String analysingMood() throws MoodAnalyzerException{
        try {
            if (message.contains("Sad")) {
                return "SAD";
            } else {
                return "HAPPY";
            }
        } catch (NullPointerException e){
            throw new MoodAnalyzerException("PLease enter proper message");
        }
    }
}
