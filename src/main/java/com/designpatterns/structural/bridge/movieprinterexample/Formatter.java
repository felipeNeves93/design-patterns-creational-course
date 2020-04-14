package com.designpatterns.structural.bridge.movieprinterexample;

import java.util.List;

public interface Formatter {

    String format(String header, List<Detail> details);
}
