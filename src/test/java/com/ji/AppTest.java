package com.ji;

import static org.junit.Assert.assertTrue;

import com.ji.Singleton.SingletonI;
import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest {
    /**
     * Rigorous Test :-)
     */
    @Test
    public void testSingleton() {
        System.out.println(SingletonI.SingletonI());
        System.out.println(SingletonI.SingletonI());
        System.out.println(SingletonI.SingletonI());
    }
}
