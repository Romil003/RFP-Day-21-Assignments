package com.bridgelabz;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class MoodAnalyzerTest {

    MoodAnalyzer mood = new MoodAnalyzer();

    @Test
    public void givenMessage_WhenHavingSad_ShouldReturnSad(){
        String actualValue = mood.analyseMood("I am in Sad mood");
        Assert.assertEquals("SAD",actualValue);
    }

    @Test
    public void givenMessage_WhenNotHavingSad_ShouldReturnSad(){
        String actualValue = mood.analyseMood("I am in Any mood");
        Assert.assertEquals("HAPPY",actualValue);
    }

}
