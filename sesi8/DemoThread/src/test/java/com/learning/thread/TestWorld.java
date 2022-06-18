package com.learning.thread;

public class TestWorld {
    public TestWorld(){
        
    }
    public static void testRun(){
        for (int i = 0; i < 5; i++) {
            ThreadWorld instance = new ThreadWorld();
            
            instance.setName("" + i);
            instance.start();
        }
    }
}
