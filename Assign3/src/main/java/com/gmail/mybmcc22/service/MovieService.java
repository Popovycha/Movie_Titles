package com.gmail.mybmcc22.service;

import com.gmail.mybmcc22.search.BinarySearchTree;
import com.gmail.mybmcc22.util.CSVReader;

import java.io.FileWriter;
import java.io.IOException;

public class MovieService {

  public BinarySearchTree parseAndPrintMoviesFromFile(String fileName) {
    final BinarySearchTree movies = parseFile(fileName);
    movies.Print(movies.getRoot(), "Icarus", "Mother!");
    return movies;
  }

  public BinarySearchTree parseAndWriteInFile(String fileName) throws IOException {
    final BinarySearchTree movies = parseFile(fileName);
    FileWriter fileWriter = new FileWriter("result.csv");
    fileWriter.write(fileName);
    return movies;
  }

  private BinarySearchTree parseFile(String fileName) {
    final BinarySearchTree movies = CSVReader.getMoviesFromFile(fileName);
    return movies;
  }
}
