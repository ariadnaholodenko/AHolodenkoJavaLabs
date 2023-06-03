package edu.ntudp.fit.Lab4.util;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;

public class FileUtils {
    public static String readFile(String filePath) throws IOException {
        byte[] encodedBytes = Files.readAllBytes(Paths.get(filePath));
        return new String(encodedBytes, StandardCharsets.UTF_8);
    }
}
