package com.gmail.mybmcc22.util;

import com.gmail.mybmcc22.search.BinarySearchTree;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class CSVReader {

  private final static String REGEX = ",(?=(?:[^\"]*\"[^\"]*\")*[^\"]*$)";
//Reader for movies.csv files
  public static BinarySearchTree getMoviesFromFile(String file) {
    FileReaderUtil fileReaderUtil = new FileReaderUtil();
    String line = "";
    BinarySearchTree bst = new BinarySearchTree();
    try (BufferedReader br = new BufferedReader(
        new FileReader(fileReaderUtil.getFileFromResources(file)))) {

      while ((line = br.readLine()) != null) {

        // use comma as separator
        String[] movie = line.split(REGEX, -1);
        String movieLine = movie[1].replaceAll("\"", "");
        if (movieLine.endsWith(" ")) {
          movieLine = movieLine.trim();
        }
        int year = Integer
            .parseInt(movieLine.substring(movieLine.length() - 5, movieLine.length() - 1));
        final String title = movieLine.substring(0, movieLine.length() - 7);
        bst.insert(title, year);
      }
    } catch (IOException e) {
      e.printStackTrace();
    }
    return bst;
  }
}
