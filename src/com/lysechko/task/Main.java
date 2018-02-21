package com.lysechko.task;


public class Main {

  public static void main(String[] args) {
    //Download file from link
    String fromLink = "https://linxsupply.com/wp-content/uploads/2016/01/be-better-mock-1-600x750.jpg";
    String toFile = "D:\\be-better-mock-1-600x750.jpg";
    GetFileFromLink.downloadUsingNIO(fromLink, toFile);

    //Divide date and num String
    String nums = "2 2 3";
    DivideIntegers.dividedDate(nums);

    //Creates a file in the specified path
    String path = "D:\\fylik.txt";
    CreateFile.createFromPath(path);
  }

}