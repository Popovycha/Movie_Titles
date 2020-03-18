package com.gmail.mybmcc22.model;

public class MovieNode {

  public String title;
  public int relYear;
  public MovieNode left, right;

  //Creation of a new node with Movie title and release year
  public MovieNode(String title, int relYear) {
    this.title = title;
    this.relYear = relYear;
  }

  //Return title
  public String getTitle() {
    return title;
  }

  //Return left node
  public MovieNode getLeft() {
    return left;
  }

  //Returns right node
  public MovieNode getRight() {
    return right;
  }

  // finds Node with given key and return its value
  public String get(String set) {
    if (this.title.equals(set)) {
      return title + " " + relYear;
    }
    //Used ternary operator to simplify code
    if (set.compareTo(this.title) < 0) {
      return left == null ? null : left.get(set);
    } else {
      return right == null ? null : right.get(set);
    }
  }

  //if key not found in BinarySearchTree then it is added. if key already exists then that node's value
  public void insert(String set, int relYear) {
    if (set.compareTo(this.title) < 0) {
      if (left != null) {
        left.insert(set, relYear);
      } else {
        left = new MovieNode(set, relYear);
      }
    } else if (set.compareTo(this.title) > 0) {
      if (right != null) {
        right.insert(set, relYear);
      } else {
        right = new MovieNode(set, relYear);
      }
    } else {
      this.relYear = relYear;
    }
  }
}
