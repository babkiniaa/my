package org.example;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;

public class IOC implements IO {


    @Override
    public void createLog() {
        File log = new File("log");
        if (!log.exists()) {
            log.mkdir();
        }
    }

    @Override
    public void writeFile(String str) {
        String timestamp = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyyMMdd_HHmmss"));
        String filename = "log" + timestamp + ".txt";
        cleanLogDirectory(filename);
        PrintWriter writer = null;
        try {
            writer = new PrintWriter(filename, "UTF-8");
            writer.println(str);
            writer.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void cleanLogDirectory(String filename) {
        File logDir = new File(filename);
        File[] files = logDir.listFiles();
        if (files != null && files.length > 2) {
            Arrays.stream(files)
                    .sorted((f1, f2) -> Long.compare(f2.lastModified(), f1.lastModified()))
                    .skip(2)
                    .forEach(File::delete);
        }
    }

    @Override
    public String readFile(String name) {
        return null;
    }
}
