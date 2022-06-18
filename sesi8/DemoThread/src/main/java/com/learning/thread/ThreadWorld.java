package com.learning.thread;

import java.util.logging.Level;
import java.util.logging.Logger;

public class ThreadWorld extends Thread {

    private final String name;
// Ini jika menggunakan variable String atau Parameter.
    public ThreadWorld(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        System.out.println(getName() + ": World");
        try {
            Thread.sleep(250);
        } catch (InterruptedException ex) {
            Logger.getLogger(ThreadHello.class.getName()).log(Level.SEVERE, null, ex);
        }
    }


}
