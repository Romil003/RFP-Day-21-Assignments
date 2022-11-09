package com.bridgelabz;

import org.junit.Assert;
import org.junit.Test;

public class MoodAnalyzer3Test {

    @Test
    public void givenNullMessage_ShouldThrowCustomException(){
        MoodAnalyzer3 mood = new MoodAnalyzer3();
        try {
            mood.analysingMood("");
        } catch (MoodAnalyzerException2 e) {
            Assert.assertEquals(MoodAnalyzerException2.ExceptionType.ENTERED_EMPTY,e.type);
        }
    }

}
