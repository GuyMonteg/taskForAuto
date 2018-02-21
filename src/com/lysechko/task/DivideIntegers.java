package com.lysechko.task;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DivideIntegers {

  public static void dividedDate(String nums) {
    Integer mult = 1;
    SimpleDateFormat sdf = new SimpleDateFormat("ddMMyy");
    Integer d = Integer.valueOf(sdf.format(new Date()));
    String[] splited = nums.split("\\s+");
    for(int i = 0; i < splited.length; i++) {
      String num = splited[i];
      Integer div = Integer.valueOf(num);
      mult *=  div;
    }
    /*System.out.println(mult);
    System.out.println(d);*/
    Integer dividedInt = d * mult;
    System.out.println(dividedInt);
  }

}
