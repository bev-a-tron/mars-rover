package swordfish;

import java.io.BufferedReader;
import java.io.IOException;

public class FileReader {

    public static String read(String fileName) throws IOException {
        BufferedReader reader = new BufferedReader(new java.io.FileReader(fileName));
        StringBuilder contents = new StringBuilder(1000);

        String line = null;
        while ((line = reader.readLine()) != null) {
            contents.append(line);
            contents.append("\n");
        }

        return contents.toString().trim();
    }
}
