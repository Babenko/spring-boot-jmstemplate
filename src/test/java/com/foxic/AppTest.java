package com.foxic;

import org.hamcrest.CoreMatchers;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

/**
 * Unit test for simple App.
 */
@RunWith(JUnit4.class)
public class AppTest {

    @Test
    public void test() throws Exception {
        Integer a = 1;
        a++;
        Assert.assertThat(a, CoreMatchers.equalTo(2));
    }

}
