package com.learning.thread;

import java.util.logging.Level;
import java.util.logging.Logger;

//import org.junit.Test;

public class ThreadHello implements Runnable{

    private final String name;

    public ThreadHello(String name){
        this.name = name;
    }

    public void run() {
        System.out.println("Hello" + name);
        try {
            Thread.sleep(250);
        } catch (InterruptedException ex) {
           Logger.getLogger(ThreadHello.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }

    //  @Test
    // public void testRun(){
    //     for (int i = 0; i < 5; i++) {
    //         ThreadHello instance = new ThreadHello(String.valueOf(i));
    //         Thread t = new Thread(instance);
    //         t.start();
    //     }
    // }

    
}
