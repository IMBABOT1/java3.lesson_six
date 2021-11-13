package ru.geekbrains.lesson6;

import org.hamcrest.MatcherAssert;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import sun.applet.Main;

import java.util.Arrays;
import java.util.Collection;
import java.util.regex.Matcher;

@RunWith(Parameterized.class)
public class TestsApp {
    @Parameterized.Parameters
    public static Collection<Object[]> params(){
        return Arrays.asList(new Object[][]{
                {new int[]{1,7}, new int[]{1,2,4,4,2,3,4,1,7}},
                {new int[]{448,457,1254}, new int[]{1,8,4,110,856,123,13,4,448,457,1254}},
                {new int[]{}, new int[]{12,12,12457}},
                {new int[]{123}, new int[]{5,5,6,4,5,7,8,4,123}}
        });
    }



    private int[] expected;
    private int[] source;
    private TestMainApp app;

    @Before
    public void init(){
        app = new TestMainApp();
    }


    public TestsApp(int[] expected, int[] source){
        this.expected = expected;
        this.source = source;
    }

    @Test
    public void testArr(){
        Assert.assertArrayEquals(expected, app.arrWithoutFour(source));
    }
}
