package com.gmail.mybmcc22;

import com.gmail.mybmcc22.service.MovieService;

import java.io.IOException;

public class Main {

  public static void main(String[] args) throws IOException {
    MovieService service = new MovieService();
    //Prints into terminal from Title1 to Title2
    service.parseAndPrintMoviesFromFile("movies.csv");

    service.parseAndWriteInFile("movies.csv");
  }
}
