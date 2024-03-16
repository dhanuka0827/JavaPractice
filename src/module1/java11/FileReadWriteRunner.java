package module1.java11;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FileReadWriteRunner {

    public static void main(String[] args) throws IOException {
        Path path = Paths.get("./resources/Sample.txt");
        String content = Files.readString(path);
        System.out.println(content);

        Path newPath = Paths.get("./resources/Sample-new.txt");
        String newContent = content+"\nBonjour";
        Files.writeString(newPath, newContent);
    }
}
