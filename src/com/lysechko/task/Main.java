package com.lysechko.task;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

  public static void main(String[] args) throws IOException {
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    String read = reader.readLine();
    
    if (read.matches("^(http|https)://.*$")) {
      //Download file from link
      String fromLink = "https://linxsupply.com/wp-content/uploads/2016/01/be-better-mock-1-600x750.jpg";
      String toFile = "D:\\be-better-mock-1-600x750.jpg";
      GetFileFromLink.downloadUsingNIO(fromLink, toFile);
    }
    if (read.matches("[A-Za-z]:(.*)")){
      //Creates a file in the specified path
      String path = "D:\\fylik.txt";
      CreateFile.createFromPath(path);

    }
    if (read.matches("^[0-9].*$")) {
      //Divide date and num String
      String nums = "2 2 3";
      DivideIntegers.dividedDate(nums);
    }

  }
}