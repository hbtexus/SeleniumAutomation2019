package com.cybertek.day8;

import org.testng.Assert;
import org.testng.annotations.Test;

public class JavaTestNGDemo {

    @Test
    public void test1(){
        String a = "A";
        String b = "A";
        Assert.assertEquals(a,b);
    }
}
