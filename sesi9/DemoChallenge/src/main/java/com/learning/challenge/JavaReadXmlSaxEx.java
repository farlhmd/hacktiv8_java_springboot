package com.learning.challenge;

import java.util.List;

public class JavaReadXmlSaxEx {
    public static void main(String[] args) {
        MyRunner runner = new MyRunner();
        List<UserModel> lines = runner.parseUsers();

        lines.forEach(System.out::print);
    }
}
