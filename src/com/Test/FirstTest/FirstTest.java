package com.Test.FirstTest;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

public class FirstTest {
    @Before
    public void before(){
        System.out.println("before");
    }
    @After
    public void after(){
        System.out.println("after");
    }

    @Test
    public void FTest(){
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(1);
        int[] arr = new int[2];
        arr[0] = 0;
        assert arrayList.get(0)==1;
        Assert.assertEquals(0,arr[0]);
    }
}
