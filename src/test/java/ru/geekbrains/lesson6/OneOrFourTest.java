package ru.geekbrains.lesson6;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class OneOrFourTest {
    @Parameterized.Parameters
    public static Collection<Object[]> params(){
        return Arrays.asList(new Object[][]{
                {new int[]{8,9,135,2,57}, false},
                {new int[]{1,9,135,2,57}, true},
                {new int[]{8,9,135,2,57,85,1,4,123}, true},
                {new int[]{8,9,135,2,57,3241,1342,432,34521}, false},
        });
    }

    private int[] arr;
    private boolean bool;
    private TestMainApp app;

    @Before
    public void init(){
        app = new TestMainApp();
    }

    public OneOrFourTest(int[] arr, boolean bool){
        this.arr = arr;
        this.bool = bool;
    }

    @Test
    public void test(){
        Assert.assertEquals(bool, app.checkNumbers(arr));
    }
}
