package com.gmail.mybmcc22.search;

import com.gmail.mybmcc22.model.MovieNode;

public class BinarySearchTree {

  private MovieNode root;

  public MovieNode getRoot() {
    return root;
  }

  //Insert data into the tree
  public void insert(String set, int value) {
    if (root == null) {
      root = new MovieNode(set, value);
    } else {
      root.insert(set, value);
    }
  }

  //Find and Return set if this match
  //Used ternary operator to simplify code
  public String get(String set) {
    return (root == null) ? null : root.get(set);
  }

  //Select title between start and end in alphabetical order
  public void Print(MovieNode node, String title1, String title2) {
    if (node == null) {
      return;
    }
    if (title1.compareTo(node.getTitle()) < 0) {
      Print(node.getLeft(), title1, title2);
    }
    //If root is within range, then print the title
    if ((title1.compareTo(node.getTitle()) < 0 || title1.compareTo(node.getTitle()) == 0)
        && (title2.compareTo(node.getTitle()) > 0 || title2.compareTo(node.getTitle()) == 0)) {
      System.out.println(node.getTitle() + " ");
    }
    //If root is smaller than title2, then check right subtree
    if (title2.compareTo(node.getTitle()) > 0) {
      Print(node.getRight(), title1, title2);
    }
  }
}
