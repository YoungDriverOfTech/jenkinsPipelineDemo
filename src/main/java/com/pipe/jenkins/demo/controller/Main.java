package com.pipe.jenkins.demo.controller;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        List<byte[]> list = new ArrayList<>();
        while(true) {
            Thread.sleep(1000);
            list.add(new byte[1024 * 1024]);
        }

    }
}
