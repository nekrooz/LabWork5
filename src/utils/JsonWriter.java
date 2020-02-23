package utils;

import collection.Collection;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class JsonWriter {
    private ObjectMapper objectMapper = new ObjectMapper();

    public void writeCollection(Collection col, String path) throws IOException {
        File file = new File(path);
        FileOutputStream outputStream = new FileOutputStream(file);

        outputStream.write(objectMapper.writerWithDefaultPrettyPrinter().writeValueAsString(col).getBytes());
    }
}
