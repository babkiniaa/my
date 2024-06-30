package org.example;

import java.io.FileNotFoundException;
import java.io.UnsupportedEncodingException;

public interface IO {
    void createLog();

    void writeFile(String str);

    void cleanLogDirectory(String filename);

    String readFile(String name);
}
