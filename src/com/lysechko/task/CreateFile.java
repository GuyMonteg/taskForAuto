package com.lysechko.task;

import java.io.File;
import java.io.IOException;

public class CreateFile {

  public static void createFromPath(String path) {
    System.getProperty("file.separator");
    File file = new File(path);
    try {
      if (file.createNewFile()){
        System.out.println("File is created!");
      }else{
        System.out.println("File already exists.");
      }
    } catch (IOException e) {
      e.printStackTrace();
    }

  }

}
