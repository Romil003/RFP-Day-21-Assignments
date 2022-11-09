package com.bridgelabz;

import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class MoodAnalyzer2Test {

    @Test
    public void givenNullMessage_ShouldReturnHappy(){
        MoodAnalyzer2 mood = new MoodAnalyzer2(null);
        String actualValue ;
        try {
            ExpectedException exceptionRule = ExpectedException.none();
            exceptionRule.expect(MoodAnalyzerException.class);
            actualValue = mood.analysingMood();
            Assert.assertEquals("HAPPY", actualValue);
        } catch (MoodAnalyzerException e) {
            e.printStackTrace();
        }
    }
}
