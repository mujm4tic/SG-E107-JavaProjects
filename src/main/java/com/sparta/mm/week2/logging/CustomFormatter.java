package com.sparta.mm.week2.logging;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.logging.Formatter;
import java.util.logging.LogRecord;

public class CustomFormatter {

    public class CustomFormatter extends Formatter {

        @Override
        public String format(LogRecord record){
            return getDateFormat() + " " + record.getLevel() + " " + record.getMessage();

            return (LocalDateTime.now().format(DateTimeFormatter.ISO_DATE(FormatStyle.SHORT)) + " " + record.getLevel()
                    + " " + record.getMessage()

        }
    }
}
