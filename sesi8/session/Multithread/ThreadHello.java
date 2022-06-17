package sesi8.session.Multithread;

import java.util.logging.Level;
import java.util.logging.Logger;

public class ThreadHello implements Runnable{

    private final String name;

    public ThreadHello(String name){
        this.name = name;
    }

    @Override
    public void run() {
        System.out.println("Hello" + name);
        try {
            Thread.sleep(250);
        } catch (InterruptedException ex) {
           Logger.getLogger(ThreadHello.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }

    // public static void jalankanRun(){
    //     ThreadHello gas = new ThreadHello();
    // }
    public static void main(String[] args) {
        
    }
    
}
