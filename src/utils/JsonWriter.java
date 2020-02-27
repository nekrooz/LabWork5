package utils;

import collection.Collection;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class JsonWriter {
    private ObjectMapper objectMapper = new ObjectMapper();

    public void writeCollection(String path, Collection col) throws IOException {
        File file = new File(path);
        FileOutputStream outputStream = new FileOutputStream(file);

        outputStream.write(objectMapper.writerWithDefaultPrettyPrinter().writeValueAsString(col.asArray()).getBytes());
    }
}
