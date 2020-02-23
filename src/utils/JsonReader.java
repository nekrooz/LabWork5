package utils;


import collection.Collection;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import comps.HumanBeing;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class JsonReader {
    private ObjectMapper objectMapper = new ObjectMapper();

    public Collection readCollection(String path) throws IOException {
        try{
            Collection col = new Collection();
            col.setCollectionAsArray( objectMapper.readValue(new FileReader(path), HumanBeing[].class) );
            return col;
        }catch (ClassCastException e){
            System.out.println(e.getMessage());
            return null;
        }
    }
}
