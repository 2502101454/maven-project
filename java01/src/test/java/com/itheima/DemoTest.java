package com.itheima;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author zengwang
 * @create 2022-09-28 20:13
 * @desc:
 */
public class DemoTest {
    @Test
    public void testSay() {
        Demo d = new Demo();
        String ret = d.say("itheima");
        Assert.assertEquals("hello itheima", ret);
    }
}
