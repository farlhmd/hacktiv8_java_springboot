package com.learning.thread;

import org.junit.Test;

public class TestWorld {

    
    @Test
    public void testRun(){
        for (int i = 0; i < 5; i++) {
            ThreadWorld instance = new ThreadWorld("");
            
            instance.setName(String.valueOf(i));
            instance.start();
        }
    }
}
