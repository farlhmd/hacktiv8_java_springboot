package com.learning.thread;

import java.util.List;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {
        MyRunner runner = new MyRunner();
        List<User> lines = runner.parseUsers();

        lines.forEach(System.out::println);
    }
}
