package module3.examples.ioexamples.files;

import java.io.File;
import java.io.IOException;
import java.util.Map;

public class Document {

    private File file;
    private Map<String, String> tags;

    // TODO implement
    Document(String path, Map<String, String> tags) throws IOException {
        this.file = new File(path);
        if(!file.exists()) {
            throw new IOException("File does not exist!");
        }
    }

}
