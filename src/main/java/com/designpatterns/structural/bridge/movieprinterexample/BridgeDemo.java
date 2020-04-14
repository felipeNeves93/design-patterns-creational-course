package com.designpatterns.structural.bridge.movieprinterexample;

public class BridgeDemo {

    public static void main(String... args) {
        Movie movie = new Movie();
        movie.setClassification("Action");
        movie.setTitle("John Wick");
        movie.setRuntime("2:15");
        movie.setYear("2014");

        Printer moviePrinter = new MoviePrinter(movie);

        Formatter htmlFormatter = new HtmlFormatter();
        String htmlMaterial = moviePrinter.print(htmlFormatter);

        System.out.printf(htmlMaterial);
    }
}
