package com.designpatterns.structural.bridge.movieprinterexample;

import java.util.List;

public abstract class Printer {

    public String print(Formatter formatter) {
        return formatter.format(getHeader(), getDetails());
    }

    public abstract List<Detail> getDetails();

    public abstract String getHeader();
}
