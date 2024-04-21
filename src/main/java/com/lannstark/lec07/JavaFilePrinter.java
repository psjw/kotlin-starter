package com.lannstark.lec07;

import java.io.*;

public class JavaFilePrinter {
  public void readFile() throws IOException {
    File currentFile = new File(".");
    File file = new File(currentFile.getAbsoluteFile() + "/a.txt");
    BufferedReader reader = new BufferedReader(new FileReader(file));
    System.out.println(reader.readLine());
    reader.close();
  }


  public void readFile(String path) throws IOException {
    try (BufferedReader reader = new BufferedReader(new FileReader(path))) {
      System.out.println(reader.readLine());
    }
  }

}
