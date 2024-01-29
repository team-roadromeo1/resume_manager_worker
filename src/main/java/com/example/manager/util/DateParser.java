package com.example.manager.util;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateParser {

  public static Date parseDate(String date) throws Exception {
    Date parsedDate = new SimpleDateFormat("dd/mm/yyyy").parse(date);
    return parsedDate;
  }
}
