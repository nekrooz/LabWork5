package collection;

import comps.HumanBeing;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class Collection {
    private ArrayList <HumanBeing> col;

    public void setCollectionAsArray(HumanBeing[] arr_col){
        col = (ArrayList<HumanBeing>) Arrays.asList(arr_col);
    }

    public ArrayList <HumanBeing> getCollection(){
        return col;
    }
//    public T toArray(){
//        return col.toArray();
//    }
}
