package com.bridgelabz;

public class MoodAnalyzerException2 extends Exception {

    enum ExceptionType {
        ENTERED_NULL , ENTERED_EMPTY
    }

    ExceptionType type;

    public MoodAnalyzerException2(ExceptionType type ,String message) {
        super(message);
        this.type = type;
    }
}
