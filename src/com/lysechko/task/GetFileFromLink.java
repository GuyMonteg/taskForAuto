package com.lysechko.task;

import java.io.FileOutputStream;
import java.io.IOException;
import java.net.URL;
import java.nio.channels.Channels;
import java.nio.channels.ReadableByteChannel;

public class GetFileFromLink {

  public static void downloadUsingNIO(String urlStr, String file) {
    try {
      System.setProperty("http.agent", "Chrome");
      URL website = new URL(urlStr);
      ReadableByteChannel readableByteChannel = Channels.newChannel(website.openStream());
      FileOutputStream fileOutputStream = new FileOutputStream(file);
      fileOutputStream.getChannel().transferFrom(readableByteChannel, 0, Long.MAX_VALUE);
      fileOutputStream.close();
      readableByteChannel.close();
      System.out.println("Loading is successful");
    } catch (IOException e) {
      e.printStackTrace();
      System.out.println("Loading is interrupted");
    }

  }
}
