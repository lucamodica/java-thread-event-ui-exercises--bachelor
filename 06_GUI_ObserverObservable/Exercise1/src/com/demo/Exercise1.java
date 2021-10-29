package com.demo;
import com.obs.*;

import java.util.Observer;

public class Exercise1 {

    public static void main(String[] args) {

        Visualizer v = new Visualizer();
        Filter f = new Filter();
        Counter c = new Counter();
        c.addObserver(f);
        f.addObserver(v);
        c.start();
    }
}