package com.designpatterns.structural.bridge.movieprinterexample;

import java.util.List;

public class PrintFormatter implements Formatter {

    @Override
    public String format(String header, List<Detail> details) {
        System.out.println("i'm formatting");
        return "";
    }
}
