package com.bridgelabz;

import org.junit.Assert;
import org.junit.Test;

public class MoodAnalyzer1Test {

    @Test
    public void givenMessage_WhenHavingSadWord_ShouldReturnSad(){
        MoodAnalyzer1 mood = new MoodAnalyzer1("I am in Sad mood.");
        String actualValue = mood.analysingMood();
        Assert.assertEquals("SAD",actualValue);
    }

    @Test
    public void givenMessage_WhenNotHavingSadWord_ShouldReturnHappy(){
        MoodAnalyzer1 mood = new MoodAnalyzer1("I am in Happy mood.");
        String actualValue = mood.analysingMood();
        Assert.assertEquals("HAPPY",actualValue);
    }

    @Test
    public void givenNullMessage_ShouldReturnHappy(){
        MoodAnalyzer1 mood = new MoodAnalyzer1(null);
        String actualValue = mood.analysingMood();
        Assert.assertEquals("HAPPY", actualValue);
    }


}
