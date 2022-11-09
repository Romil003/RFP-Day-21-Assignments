package com.bridgelabz;

public class MoodAnalyzer3 {

    String message ;

    public MoodAnalyzer3() {
    }

    public MoodAnalyzer3(String message) {
        this.message = message;
    }

    public String analysingMood(String message) throws MoodAnalyzerException2{
        try {
            if (message.length() == 0){
                throw new MoodAnalyzerException2(MoodAnalyzerException2.ExceptionType.ENTERED_EMPTY,"PLease enter proper message");
            }
            if (message.contains("Sad")) {
                return "SAD";
            } else {
                return "HAPPY";
            }
        } catch (NullPointerException e){
            throw new MoodAnalyzerException2(MoodAnalyzerException2.ExceptionType.ENTERED_NULL,"PLease enter proper message");
        }
    }
}
